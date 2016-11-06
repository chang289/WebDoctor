package webdoctor.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.service.Search;

/**
 * Created by IAN on 2016/10/9.
 */


@Controller
public class SearchController {

    @Autowired
    Search search;
    String name;



    @RequestMapping(path="/DepartmentPage", method = RequestMethod.GET)
    public String departmentPage() {
        return "departmentPage.html";
    }

    @RequestMapping(path="ModePage", method = RequestMethod.GET)
    public String modePage() {
        return "modePage.html";
    }

    @RequestMapping(path="LoginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "loginPage.html";
    }

    @RequestMapping(path="SymptomPage", method = RequestMethod.GET)
    public String symptomPage() {
        return "symptomPage.html";
    }

    @RequestMapping(path="/Getdescription", method = RequestMethod.POST)
    public @ResponseBody String description() {
        Gson gson = new Gson();
        Disease disease = search.diseaseByName(name);
        return gson.toJson(disease);
    }

    @RequestMapping(path = "/searchByName", method= RequestMethod.POST)
    public @ResponseBody String searchByName(@RequestBody Disease disease) {
        System.out.println(disease.getName());
        String json = search.searchByName(disease.getName());
        System.out.println(json);
        return json;
    }

    @RequestMapping(path = "/searchByTags", method=RequestMethod.POST)
    public @ResponseBody String searchByTags(@RequestBody String[] symptoms) {
        for (int i = 0; i < symptoms.length; i++){
            System.out.println(symptoms[i]);
        }
        System.out.println(symptoms.length);
        Symptom[] symptomList = new Symptom[symptoms.length];
        for (int i = 0; i < symptoms.length; i++) {
            symptomList[i] = new Symptom();
            System.out.println(i);
            System.out.println(symptoms[i]);
            symptomList[i].setName(symptoms[i]);
        }
        return search.searchByTags(symptomList);
    }

    @RequestMapping(path = "/symptomsByDepartment", method=RequestMethod.POST, produces=("application/json"))
    public @ResponseBody String searchByDepartment(@RequestBody String department) {
        String s = search.searchByDepartment(department.substring(1, department.length()-1));
//        System.out.println(s);
        return s;
    }

    @RequestMapping(path="/diseaseDescriptionPage", method = RequestMethod.GET)
    public String diseaseDescriptionPage() {
        return "DiseaseDescriptionPage.html";
    }

    @RequestMapping(path="/getDisease", method=RequestMethod.POST)
    public @ResponseBody String getDisease(@RequestBody String diseaseName) {

//        System.out.println(name);
        diseaseName = diseaseName.substring(1,diseaseName.length()-1);
        this.name = diseaseName;
        return name;
    }


}