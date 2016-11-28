package webdoctor.helperClass;


import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;

import java.util.*;

/**
 * Created by Yibin on 2016/11/14.
 */
public class Disease_Symptoms {
    private String name;
    private String description;
    private String department;
    private String symptoms;
    private Symptom[] newSymptoms;

    public void setName(String disease_name) {
        this.name = disease_name;
    }
    public void setDescription(String disease_description) {
        this.description = disease_description;
    }
    public void setDepartment(String disease_department) {
        this.department = disease_department;
    }
    public void setNewSymptoms(Symptom[] newSymptoms) { this.newSymptoms = newSymptoms; }
    public void setSymptoms(String symptomList) {
        this.symptoms = symptomList;
    }

    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDepartment() {
        return this.department;
    }
    public String getSymptoms() {
        return this.symptoms;
    }
    public Symptom[] getNewSymptoms() { return newSymptoms; }
}