package webdoctor.service;

import org.jooq.DSLContext;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.helperClass.ArticleWithTime;
import webdoctor.helperClass.UserArticle;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.jooq.tables.pojos.UserFavouritearticle;

import java.util.Arrays;
import java.util.List;

import static webdoctor.jooq.Tables.ARTICLE;
import static webdoctor.jooq.Tables.USER;
import static webdoctor.jooq.Tables.USER_FAVOURITEARTICLE;

/**
 * Created by IAN on 2016/11/27.
 */
@Service
public class FavouriteService {

    private final DSLContext create;

    @Autowired
    public FavouriteService(DSLContext dslContext) {
        this.create = dslContext;
    }

    @Autowired
    ArticleService as;
    @Autowired
    UserService us;

    public int checkExists(UserArticle ua) {
        User user = ua.getUser();
        int articleId = ua.getArticleId();
        User tempUser = us.getUser(user);
        UserFavouritearticle uf = create.select().from(USER_FAVOURITEARTICLE).where(USER_FAVOURITEARTICLE.USER_ID.equal(tempUser.getId()))
                .and(USER_FAVOURITEARTICLE.ARTICLE_ID.equal(articleId))
                .fetchOneInto(UserFavouritearticle.class);
        if (uf == null) {
            return 0;
        }
        else {
            return 1;
        }
    }


    public ArticleWithTime[] getFavourite(User user) {
        User tempUser = us.getUser(user);
        if (tempUser == null) {
            return null;
        }
        else {
            List<Article> articleList = create.select(ARTICLE.ID, ARTICLE.AUTHOR_NAME, ARTICLE.TITLE, ARTICLE.TIME_STAMP, ARTICLE.CONTENT, ARTICLE.DISEASE).from(ARTICLE)
                    .join(USER_FAVOURITEARTICLE)
                    .on(USER_FAVOURITEARTICLE.ARTICLE_ID.equal(ARTICLE.ID))
                    .join(USER)
                    .on(USER.ID.equal(USER_FAVOURITEARTICLE.USER_ID))
                    .where(USER.ID.equal(tempUser.getId()))
                    .fetchInto(Article.class);
            Article[] articleArray = new Article[articleList.size()];
            articleList.toArray(articleArray);
            return as.alterArticle(articleArray);
        }
    }

    public int setFavourite(UserArticle ua) {
        User user = ua.getUser();
        int articleId = ua.getArticleId();
        User tempUser = us.getUser(user);

        if (tempUser == null) {
            return 0;
        }
        else {
            if (checkExists(ua) == 0) {
                System.out.println("exists");
                return create.insertInto(USER_FAVOURITEARTICLE).values(tempUser.getId(), articleId).execute();

            }
            else {
                return deleteFavourite((ua));
            }
        }
    }

    public int deleteFavourite(UserArticle ua) {
        User user = ua.getUser();
        int articleId = ua.getArticleId();
        User tempUser = us.getUser(user);
        if (tempUser == null) {
            return 0;
        }
        else {
            if (checkExists(ua) == 0) {
                return -2;
            }
            else {
                int success = create.delete(USER_FAVOURITEARTICLE).where(USER_FAVOURITEARTICLE.USER_ID.equal(tempUser.getId()))
                        .and(USER_FAVOURITEARTICLE.ARTICLE_ID.equal(articleId))
                        .execute();
                if (success > 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }

}
