package webdoctor.helperClass;


import webdoctor.jooq.tables.pojos.Symptom;

import java.util.*;

/**
 * Created by Yibih on 2016/11/14.
 */
public class DepartmentSymptoms {
    private String department;
    private List <String> symptomList;

    public void set_Department(String department) {
        this.department = department;
    }
    public void set_SymptomList(List <String> symptomList) {
        this.symptomList = symptomList;
    }

    public String get_Department() {
        return this.department;
    }

    public List <String> get_SymptomList() {
        return this.symptomList;
    }
}

