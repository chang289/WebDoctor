package webdoctor.service;


import com.google.gson.Gson;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.jooq.tables.pojos.Comment;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.User;

import java.util.List;

import static webdoctor.jooq.Tables.*;


/**
 * Created by Yibih on 2016/10/30.
 */

@Service
public class ArticleService {
    Gson gson = new Gson();

    private final DSLContext create;



    @Autowired
    public ArticleService(DSLContext dslContext) {
        this.create = dslContext;
    }

    public int postArticle(Article article) {


        return create.insertInto(ARTICLE,ARTICLE.AUTHOR_NAME,ARTICLE.TITLE,ARTICLE.CONTENT,ARTICLE.DISEASE)
                .values(article.getAuthorName(), article.getTitle(),article.getContent(),article.getDisease())
                .execute();

    }

    public String[] getRelatedArticle(Disease disease) {
        List<String>article_list = create.select(ARTICLE.TITLE).from(ARTICLE)
        .where(disease.getName().equals(ARTICLE.DISEASE))
        .fetchInto(String.class);

        String [] article_array = new String [article_list.size()];
        article_list.toArray(article_array);
        return article_array;

//        return gson.toJson(create.select().from(DISEASE_ARTICLE)
//                .join(DISEASE).on(DISEASE_ARTICLE.DISEASE_ID.equal(DISEASE.ID))
//                .join(ARTICLE).on(DISEASE_ARTICLE.ARTICLE_ID.equal(ARTICLE.ID))
//                .where(DISEASE.ID.equal(disease.getId()))
//                .fetchInto(Article.class));
    }

    public int postComment(Comment comment){
       return create.insertInto(COMMENT,COMMENT.USER_ID,COMMENT.ARTICLE_ID,COMMENT.TIME_STAMP,COMMENT.CONTENT)
               .values(comment.getUserId(),comment.getArticleId(),comment.getTimeStamp(),comment.getContent())
               .execute();
    }



}
