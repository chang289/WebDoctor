package webdoctor.service;


import com.google.gson.Gson;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.helperClass.ArticleWithTime;
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

    public ArticleWithTime[] getRelatedArticle(Disease disease) {
        List<Article>article_list = create.select().from(ARTICLE)
        .where(ARTICLE.DISEASE.equal(disease.getName()))
                .fetchInto(Article.class);
        Article [] article_array = new Article [article_list.size()];
        article_list.toArray(article_array);
        ArticleWithTime[] result = alterArticle(article_array);
        return result;

//        return gson.toJson(create.select().from(DISEASE_ARTICLE)
//                .join(DISEASE).on(DISEASE_ARTICLE.DISEASE_ID.equal(DISEASE.ID))
//                .join(ARTICLE).on(DISEASE_ARTICLE.ARTICLE_ID.equal(ARTICLE.ID))
//                .where(DISEASE.ID.equal(disease.getId()))
//                .fetchInto(Article.class));
    }
    public int deleteArticle(Article article) {
        return create.deleteFrom(ARTICLE).where(ARTICLE.ID.equal(article.getId()))
                .execute();
    }

    public int deleteFavourite(Article article) {
        return create.deleteFrom(USER_FAVOURITEARTICLE).where(USER_FAVOURITEARTICLE.ARTICLE_ID.equal(article.getId()))
                .execute();
    }



    public ArticleWithTime[] alterArticle(Article[] article) {
        ArticleWithTime[] awt = new ArticleWithTime[article.length];
        for (int i = 0; i < article.length; i++) {
            awt[i] = new ArticleWithTime();
            awt[i].setId(article[i].getId());
            awt[i].setTitle(article[i].getTitle());
            awt[i].setAuthorName(article[i].getAuthorName());
            awt[i].setTimeStamp(article[i].getTimeStamp().toString().substring(0, article[i].getTimeStamp().toString().length() - 5));
            awt[i].setContent(article[i].getContent());
            awt[i].setDisease(article[i].getDisease());
        }
        return awt;
    }

}
