package webdoctor.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.User;

import javax.validation.constraints.Null;

import static webdoctor.jooq.Tables.USER;

/**
 * Created by Yibih on 2016/10/29.
 */
@Service
public class Authorization {
    private final DSLContext create;

    @Autowired
    public Authorization(DSLContext dslContext) {
        this.create = dslContext;
    }

    public int authorize(User user) {
        User temp = create.select()
                .from(USER)
                .where(USER.USERNAME.equal(user.getUsername()))
                .fetchOneInto(User.class);

        if (temp == null) {
            return 0;
            //failed
        }else{
            create.update(USER)
                    .set(USER.AUTHORITY,"1")
                    .where(USER.ID.equal(temp.getId()))
                    .execute();

            return 1;
            //success

        }

    }

}
