package webdoctor.controller;

import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;

/**
 * Created by IAN on 2016/10/9.
 */


@RestController
public class SearchController {

    @RequestMapping(path = "/searchByName", method= RequestMethod.GET)
    public @ResponseBody String searchByName(@RequestBody Disease disease) {
        System.out.println("success");
        return "searchByName";
    }

    @RequestMapping(path = "/searchByTags", method=RequestMethod.GET)
    public @ResponseBody String searchByTags(@RequestBody Disease[] diseases) {
        return "searchByTags";
    }

    @RequestMapping(path = "/symptomsByDepartment", method=RequestMethod.GET)
    public @ResponseBody String searchByDepartment(@RequestBody String department) {
        System.out.println(department);
        return "success";
    }
}