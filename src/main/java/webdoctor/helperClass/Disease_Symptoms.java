package webdoctor.helperClass;


import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;

import java.util.*;

/**
 * Created by Yibin on 2016/11/14.
 */
public class Disease_Symptoms {
    private Disease disease;
    private List <String> symptomList;

    public void set_Disease(Disease disease) {
        this.disease = disease;
    }
    public void set_SymptomList(List <String> symptomList) {
        this.symptomList = symptomList;
    }

    public Disease get_Disease() {
        return this.disease;
    }

    public List <String> get_SymptomList() {
        return this.symptomList;
    }
}