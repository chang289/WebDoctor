package webdoctor.service;


import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.jooq.tables.pojos.Comment;
import webdoctor.jooq.tables.pojos.User;
import static webdoctor.jooq.Tables.USER;
import static webdoctor.jooq.Tables.ARTICLE;
import static webdoctor.jooq.Tables.DISEASE_ARTICLE;
import static webdoctor.jooq.Tables.USER_FAVOURITEARTICLE;
import static webdoctor.jooq.Tables.COMMENT;


/**
 * Created by Yibih on 2016/10/30.
 */

@Service
public class ArticleService {

    private final DSLContext create;

    @Autowired
    public ArticleService(DSLContext dslContext) {
        this.create = dslContext;
    }

    public int postArticle(Article article) {
        return create.insertInto(ARTICLE,ARTICLE.AUTHOR_ID,ARTICLE.TITLE,ARTICLE.TIME_STAMP,ARTICLE.CONTENT)
                .values(article.getAuthorId(), article.getTitle(), article.getTimeStamp(),article.getContent())
                .execute();

    }

    public int postComment(Comment comment){
       return create.insertInto(COMMENT,COMMENT.USER_ID,COMMENT.ARTICLE_ID,COMMENT.TIME_STAMP,COMMENT.CONTENT)
               .values(comment.getUserId(),comment.getArticleId(),comment.getTimeStamp(),comment.getContent())
               .execute();
    }




}
