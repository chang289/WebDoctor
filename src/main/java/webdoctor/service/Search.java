package webdoctor.service;
import static webdoctor.jooq.Tables.*;
import static org.jooq.impl.DSL.*;
import com.google.gson.Gson;
import org.jooq.*;
import org.jooq.impl.*;
import java.sql.*;
import java.util.List;
import org.jooq.util.derby.sys.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;


/**
 * Created by IAN on 2016/10/10.
 */


@Service
public class Search {

    Gson gson = new Gson();

    private final DSLContext create;
    @Autowired
    public Search(DSLContext dslContext) {
        this.create = dslContext;
    }

    public String searchByName(String name) {

        String json = null;

        List<Disease> disease_list = create.select().from(DISEASE).where(DISEASE.NAME.startsWith(name)).fetchInto(Disease.class);
        json = gson.toJson(disease_list);
        System.out.println(json);
//        for(Disease s : disease_list) {
//            System.out.println(s.getName());
//
//        }


       return json;
    }
    public void searchByTags(Symptom[] symptoms){

    }
    public String searchByDepartment(String department) {
        String json = null;

        List<String> symptom_list = create.select(SYMPTOM.NAME).from(SYMPTOM).where(SYMPTOM.DEPARTMENT.equal(department)).fetchInto(String.class);
//        for ( String s : symptom_list) {
//            System.out.println(s);
//        }
        json = gson.toJson(symptom_list);
        System.out.println(json);

        return json;
    }




}
