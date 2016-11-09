package webdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.service.DescriptionService;

/**
 * Created by IAN on 2016/11/8.
 */
@Controller
public class DescriptionController {

    @Autowired
    DescriptionService DS;

    @RequestMapping(path = "/EditDescriptionPage", method= RequestMethod.GET)
    public String editDiscriptionPage() {
        return "editDiscriptionPage.html";
    }

    @RequestMapping(path = "CreateDescription", method = RequestMethod.POST)
    public @ResponseBody int CreateDescription(@RequestBody Disease disease){
        return DS.descriptionCreate(disease);
    }

    @RequestMapping(path = "EditDescription", method = RequestMethod.POST)
    public @ResponseBody int EditDescription(@RequestBody Disease disease){
        return DS.descriptionEdit(disease);
    }
}
