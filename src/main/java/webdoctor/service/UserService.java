package webdoctor.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.common.passwordHash;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.jooq.tables.pojos.User;

import java.util.List;

import static webdoctor.jooq.Tables.ARTICLE;
import static webdoctor.jooq.Tables.USER;

/**
 * Created by IAN on 2016/10/11.
 */

@Service
public class UserService {
    //need to add dependency
    private final DSLContext create;

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
}
