package webdoctor.service;

import com.google.gson.Gson;
import org.hibernate.mapping.Set;
import org.jooq.*;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Disease;
import static webdoctor.jooq.Tables.*;
import webdoctor.jooq.tables.pojos.User;

/**
 * Created by Yibih on 2016/11/8.
 */
@Service
public class DescriptionService {
    private final DSLContext create;

    @Autowired
    public DescriptionService(DSLContext dslContext) {
        this.create = dslContext;
    }

    private int checkDisease(Disease disease) {
        Disease temp = create.select()
                .from(DISEASE)
                .where(DISEASE.NAME.equal(disease.getName()))
                .fetchOneInto(Disease.class);
        if(temp == null) {
            return 0;
            //fail
        }else {
            return 1;
            //success
        }
    }

    public int descriptionCreate(Disease disease) {
        if(checkDisease(disease) == 0){
            return 0;
            //existed
        }else{
            create.insertInto(DISEASE,DISEASE.NAME,DISEASE.DESCRIPTION,DISEASE.DEPARTMENT)
                    .values(disease.getName(),disease.getDescription(),disease.getDepartment())
                    .execute();
            return 1;
            
        }
    }

    public int descriptionEdit(Disease disease) {
        if(checkDisease(disease) == 0) {
            return 0;
        } else {
            create.update(DISEASE)
                    .set(DISEASE.DESCRIPTION,disease.getDescription())
                    .where(DISEASE.NAME.equal(disease.getName()))
                    .execute();
            return 1;
        }
    }
}
