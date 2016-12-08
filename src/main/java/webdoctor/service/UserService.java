package webdoctor.service;

import com.google.api.services.gmail.model.Message;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.common.passwordHash;
import webdoctor.helperClass.ArticleWithTime;
import webdoctor.helperClass.FeedBack;
import webdoctor.helperClass.UserArticle;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.jooq.tables.pojos.User;

import java.util.List;

import static webdoctor.jooq.Tables.ARTICLE;
import static webdoctor.jooq.Tables.USER;
import static webdoctor.jooq.Tables.USER_FAVOURITEARTICLE;

/**
 * Created by IAN on 2016/10/11.
 */

@Service
public class UserService {
    //need to add dependency
    private final DSLContext create;

    private String email = "zhouyiyan1995@gmail.com";

    @Autowired
    ArticleService as;

    @Autowired
    EmailService es;

    @Autowired
    passwordHash ph;
    @Autowired
    public UserService(DSLContext dslContext) {
        this.create = dslContext;
    }

    private int checkValid(User user) {
        User checkedUser = create.select().from(USER).where(USER.USERNAME.equal(user.getUsername())).fetchOneInto(User.class);
        if (checkedUser == null) {
            return 0;//fail
        }
        else {
            return 1;//success
        }
    }

    public int signUp(User user) {
        if(checkValid(user) != 0) {
            return 0;
            //fail, exited
        }else {
            user.setPassword(ph.hash256(user.getPassword()));
            create.insertInto(USER, USER.USERNAME, USER.PASSWORD, USER.EMAIL, USER.AUTHORITY)
                    .values(user.getUsername(), user.getPassword(), user.getEmail(), "0")
                    .execute();
            return 1;
            //success
        }

    }

    public int login(User user) {
        User data = create.select().from(USER).where(USER.USERNAME.equal(user.getUsername())).fetchOneInto(User.class);
        if (data == null) {
            return -1;//fail
        }
        else {
            if (ph.hash256(user.getPassword()).equals(data.getPassword())) {
                System.out.println(Integer.valueOf(data.getAuthority()));
                return Integer.valueOf(data.getAuthority());//success
            }
            else {
                return -1;
            }
        }
    }
    public int changePassword(User user) {
        if (checkValid(user) == 1) {
            create.update(USER)
                    .set(USER.PASSWORD, ph.hash256(user.getPassword()))
                    .where(USER.USERNAME.equal(user.getUsername()))
                    .execute();
            return 1;
            //success
        }else {
            return 0;
            //fail
        }

    }
    public User getUser(User user) {
        return create.select()
                .from(USER)
                .where(USER.USERNAME.equal(user.getUsername()))
                .fetchOneInto(User.class);
    }

//    public Article[] getRelativeArticle(String username) {
//        List<Article> article_list = create.select()
//                .from(ARTICLE)
//                .join()
//    }

    public int changeEmail(User user) {
        if (checkValid(user)== 1) {
            create.update(USER)
                    .set(USER.EMAIL, user.getEmail())
                    .where(USER.USERNAME.equal(user.getUsername()))
                    .execute();
            return 1;
            //success
        }else {
            return 0;
        }
    }

    public ArticleWithTime[] getArticleByAuthor(User user) {

        if (checkValid(user) == 1) {
            List<Article> list = create.select().from(ARTICLE)
                    .where(ARTICLE.AUTHOR_NAME.equal(user.getUsername()))
                    .fetchInto(Article.class);
            Article[] array = new Article[list.size()];
            list.toArray(array);
            ArticleWithTime[] awt = new ArticleWithTime[list.size()];
            for (int i = 0; i < array.length; i++) {
                 awt = as.alterArticle(array);
            }
            return awt;
        }
        else {
            return null;
        }
    }

    public int sendFeedback(FeedBack fb) {
        String content = "username: " + fb.getUsername() + "\n" + fb.getContent();
        Message m = es.sendEmail(email, email, fb.getSubject(), content);
        if (m == null) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
