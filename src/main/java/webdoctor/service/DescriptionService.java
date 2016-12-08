package webdoctor.service;

import com.google.gson.Gson;
import org.jooq.*;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;
import java.util.stream.*;
import org.jooq.*;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.jooq.util.derby.sys.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Disease;
import static webdoctor.jooq.Tables.*;
import webdoctor.helperClass.*;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.jooq.tables.pojos.User;

/**
 * Created by Yibih on 2016/11/8.
 */
@Service
public class DescriptionService {
    private final DSLContext create;

    Gson gson = new Gson();

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

    private Disease getDisease(Disease disease) {
        return create.select()
                .from(DISEASE)
                .where(DISEASE.NAME.equal(disease.getName()))
                .fetchOneInto(Disease.class);

    }

    private Symptom getSymptom(String symptom) {
        return create.select().from(SYMPTOM)
                .where(SYMPTOM.NAME.equal(symptom))
                .fetchOneInto(Symptom.class);

    }

    private int checkSymptom(Symptom symptom) {
        Symptom temp = create.select().from(SYMPTOM)
                .where(SYMPTOM.NAME.equal(symptom.getName()))
                .fetchOneInto(Symptom.class);
        if(temp == null) {
            return 0;
            //fail
        }else {
            return 1;
            //success
        }
    }

    public int symptomCreate(Symptom symptom) {
        if(checkSymptom(symptom) == 0) {
            return 0;
        }else {
            return create.insertInto(SYMPTOM, SYMPTOM.NAME, SYMPTOM.DEPARTMENT)
                    .values(symptom.getName(), symptom.getDepartment())
                    .execute();
        }
    }

    public int descriptionCreate(Disease_Symptoms D) {

        String disease_name = D.getName();
        String disease_description = D.getDescription();
        String disease_deparment = D.getDepartment();
        String symptom_list = D.getSymptoms();

        Disease disease = new Disease();
        disease.setName(disease_name);
        disease.setDescription(disease_description);
        disease.setDepartment(disease_deparment);

        Symptom[] newSymptoms = D.getNewSymptoms();
        for (int i = 0; i < newSymptoms.length; i++) {
            for (int j = 0; j < i; j++) {
                if (newSymptoms[i].getName().equals(newSymptoms[j].getName())) {
                    System.out.println("duplicate");
                    return -1;
                }
            }
        }
        for (int i = 0; i < newSymptoms.length; i++) {
            Symptom temp = create.select().from(SYMPTOM).where(SYMPTOM.NAME.equal(newSymptoms[i].getName()))
                    .fetchOneInto(Symptom.class);
            if (temp != null) {
                System.out.println("Exists");
                return -1;
            }
        }

        for (int i = 0; i < newSymptoms.length; i++) {
            create.insertInto(SYMPTOM, SYMPTOM.NAME, SYMPTOM.DEPARTMENT).values(newSymptoms[i].getName(), newSymptoms[i].getDepartment())
                    .execute();
            symptom_list = symptom_list + newSymptoms[i].getName() + ",";
        }
        System.out.println(symptom_list);

        if(checkDisease(disease) == 1){
            return 0;
            //existed
        }else{

            create.insertInto(DISEASE,DISEASE.NAME,DISEASE.DESCRIPTION,DISEASE.DEPARTMENT)
                    .values(disease.getName(),disease.getDescription(),disease.getDepartment())
                    .execute();

            int D_ID = create.select()
                    .from(DISEASE)
                    .where(DISEASE.NAME.equal(disease.getName()))
                    .fetchOneInto(Disease.class).getId();
            int T_ID;
//            System.out.println(symptom_list);
            String [] symptoms = symptom_list.split(",");


            for (String s : symptoms) {
                Symptom temp_symp = getSymptom(s);
                if (temp_symp == null) {
                    return 0;
                }
                T_ID = temp_symp.getId();
                create.insertInto(DISEASE_SYMPTOM,DISEASE_SYMPTOM.TAG_ID,DISEASE_SYMPTOM.DISEASE_ID)
                        .values(T_ID,D_ID)
                        .execute();
            }

            return 1;

        }
    }


    public String getDSList(){
        String json =  null;
        List<String>Department = create.select().from(SYMPTOM)
                .fetch(SYMPTOM.DEPARTMENT);

        Set<String> temp = new HashSet<String>();
        temp.addAll(Department);
        Department.clear();
        Department.addAll(temp);

        List<DepartmentSymptoms> DSList = new ArrayList<DepartmentSymptoms>();

//        for(String s: Department) {
//            System.out.println(s);
//        }

        int i = 0;
        List<String> symp_temp;
        for(String s: Department){
//            System.out.println(s);

            symp_temp = create.select(SYMPTOM.NAME).from(SYMPTOM)
                    .where(SYMPTOM.DEPARTMENT.equal(s))
                    .fetchInto(String.class);

//            for(String a : symp_temp) {
//                System.out.println(a);
//            }
//            System.out.println(Arrays.toString(symp_temp.toArray()));
            DepartmentSymptoms DS_temp = new DepartmentSymptoms();
            DS_temp.set_Department(s);
            DS_temp.set_SymptomList(symp_temp);
            DSList.add(DS_temp);
        }
        json = gson.toJson(DSList);
//        System.out.println(json);
        return json;
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

    public int deleteDescription(Disease disease) {
        if (checkDisease(disease) == 0) {
            return 0;
        }
        else {
            Disease temp = getDisease(disease);
            return create.deleteFrom(DISEASE)
                    .where(DISEASE.ID.equal(temp.getId()))
                    .execute();
        }
    }

    public int deleteDiseaseSymptom(Disease disease) {
        Disease temp = getDisease(disease);
        if (getDisease(disease) == null) {
            return 0;
        }
        else {
            return create.deleteFrom(DISEASE_SYMPTOM)
                    .where(DISEASE_SYMPTOM.DISEASE_ID.equal(getDisease(disease).getId()))
                    .execute();
        }
    }



}
