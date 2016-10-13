package webdoctor.controller;

import org.jooq.DSLContext;
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

    @RequestMapping(path="/DepartmentPage", method = RequestMethod.GET)
    public String departmentPage() {
        return "departmentPage.html";
    }

    @RequestMapping(path = "/searchByName", method= RequestMethod.GET)
    public @ResponseBody String searchByName(@RequestBody Disease disease) {
        System.out.println("success");
        return "searchByName";
    }

    @RequestMapping(path = "/searchByTags", method=RequestMethod.PUT)
    public @ResponseBody String searchByTags(@RequestBody Symptom[] symptoms) {
        for (int i = 0; i < symptoms.length; i++) {
            System.out.println(symptoms[i].getName());
        }
        return "searchByTags";
    }

    @RequestMapping(path = "/symptomsByDepartment", method=RequestMethod.POST, produces=("application/json"))
    public @ResponseBody String searchByDepartment(@RequestBody String department) {
        String s = search.searchByDepartment(department.substring(1, department.length()-1));
        System.out.println(s);
        return s;
    }

}