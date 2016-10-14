package webdoctor.service;
import static webdoctor.jooq.Tables.*;
import static org.jooq.impl.DSL.*;
import com.google.gson.Gson;
import org.jooq.*;
import org.jooq.impl.*;
import java.sql.*;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

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


        List<Disease> disease_list = create.select().from(DISEASE).where(DISEASE.NAME.startsWith(name)).fetchInto(Disease.class);
        String json = gson.toJson(disease_list);
//        System.out.println(json);
//        for(Disease s : disease_list) {
//            System.out.println(s.getName());
//
//        }
       return json;
    }

    public Disease diseaseByName(String name) {
        return create.select().from(DISEASE).where(DISEASE.NAME.equal(name)).fetchOneInto(Disease.class);
    }

    public String  searchByTags(Symptom[] symptoms){
        String json = null;
        List<String> disease_occurrence = new ArrayList<String>();
        List<String> diseases_to_symptom;

        final Map<String,Integer> diseases_map = new HashMap<String,Integer>();
        for(Symptom s:symptoms) {
            diseases_to_symptom = create.select(DISEASE.NAME).from(DISEASE_SYMPTOM)
                    .join(SYMPTOM).on(DISEASE_SYMPTOM.TAGID.equal(SYMPTOM.ID))
                    .join(DISEASE).on(DISEASE_SYMPTOM.DISEASEID.equal(DISEASE.ID))
                    .where(SYMPTOM.NAME.equal(s.getName()))
                    .fetchInto(String.class);
            for(String d : diseases_to_symptom) {
                disease_occurrence.add(d);
            }
        }

        for(String s: disease_occurrence) {
            System.out.println(s);
        }
        for(String str : disease_occurrence){
            diseases_map.put(str,1+(diseases_map.containsKey(str) ?     diseases_map.get(str) : 0));
        }
        List<String>diseases = new ArrayList<String>(diseases_map.keySet());
        Collections.sort(diseases,new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                return diseases_map.get(b) - diseases_map.get(a);
            }
        });

        json = gson.toJson(diseases);
        System.out.println(json);
        return json;

    }
    public String searchByDepartment(String department) {
        String json = null;

        List<Symptom> symptom_list = create.select().from(SYMPTOM).where(SYMPTOM.DEPARTMENT.equal(department)).fetchInto(Symptom.class);
//        for ( String s : symptom_list) {
//            System.out.println(s);
//        }
        json = gson.toJson(symptom_list);

        return json;
    }
}
