package webdoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;

/**
 * Created by IAN on 2016/10/9.
 */


@Controller
public class SearchController {

    @RequestMapping(path="/DepartmentPage", method = RequestMethod.GET)
    public String departmentPage() {
        return "departmentPage.html";
    }

    @RequestMapping(path = "/searchByName", method= RequestMethod.GET)
    public @ResponseBody String searchByName(@RequestBody Disease disease) {
        System.out.println("success");
        return "searchByName";
    }

    @RequestMapping(path = "/searchByTags", method=RequestMethod.GET)
    public @ResponseBody String searchByTags(@RequestBody Disease[] diseases) {
        return "searchByTags";
    }

    @RequestMapping(path = "/symptomsByDepartment", method=RequestMethod.POST)
    public @ResponseBody Symptom searchByDepartment(@RequestBody String department) {
        System.out.println(department);
        Symptom s = new Symptom();
        s.setId(1);
        s.setDepartment("dick");
        s.setName("dickache");
        return s;
    }

}