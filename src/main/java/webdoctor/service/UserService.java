package webdoctor.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.User;
import static webdoctor.jooq.Tables.USER;

/**
 * Created by IAN on 2016/10/11.
 */

@Service
public class UserService {
    //need to add dependency
    private final DSLContext create;

    @Autowired
    public UserService(DSLContext dslContext) {
        this.create = dslContext;
    }

    public int checkValid(User user) {
        User checkedUser = create.select().from(USER).where(USER.USERNAME.equal(user.getUsername())).fetchOneInto(User.class);
        if (checkedUser == null) {
            return 0;//fail
        }
        else {
            return 1;//success
        }
    }

    public int signUp(User user) {
        return create.insertInto(USER, USER.USERNAME, USER.PASSWORD, USER.EMAIL, USER.AUTHORITY)
                .values(user.getUsername(), user.getPassword(), user.getEmail(), "0").execute();
    }

    public int login(User user) {
        User data = create.select().from(USER).where(USER.USERNAME.equal(user.getUsername())).fetchOneInto(User.class);
        if (data == null) {
            return 0;//fail
        }
        else {
            if (user.getPassword().equals(data.getPassword())) {
                return 1;//success
            }
            else {
                return 0;
            }
        }
    }
    public int changePassword(User user) {
        if (checkValid(user) == 1) {
            create.update(USER)
                    .set(USER.PASSWORD, user.getPassword())
                    .where(USER.USERNAME.equal(user.getUsername()))
                    .execute();
            return 1;
            //success
        }else {
            return 0;
            //fail
        }

    }

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
