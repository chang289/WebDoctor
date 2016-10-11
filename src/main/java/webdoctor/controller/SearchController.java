package webdoctor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IAN on 2016/10/9.
 */


@RestController
public class SearchController {

    @RequestMapping(path = "/searchByName", method= RequestMethod.GET)
    public String searchByName() {
        System.out.println("success");
        return "searchByName";
    }

    @RequestMapping(path = "/searchByTags", method=RequestMethod.GET)
    public String searchByTags() {
        return "searchByTags";
    }
}