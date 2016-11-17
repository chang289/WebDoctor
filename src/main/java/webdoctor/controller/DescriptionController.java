package webdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.service.DescriptionService;

/**
 * Created by IAN on 2016/11/8.
 */
@Controller
public class DescriptionController {

    @Autowired
    DescriptionService DS;

    @RequestMapping(path = "/EditDescriptionPage", method= RequestMethod.GET)
    public String editDescriptionPage() {
        return "editDescriptionPage.html";
    }

    @RequestMapping(path = "/CreateDescriptionPage", method= RequestMethod.GET)
    public String createDescriptionPage() {
        return "createTextPage.html";
    }

    @RequestMapping(path = "CreateDescription", method = RequestMethod.POST)
    public @ResponseBody int CreateDescription(@RequestBody Disease disease, Symptom[] symptoms){
        return DS.descriptionCreate(disease,symptoms);
    }

    @RequestMapping(path = "CreateDescription", method = RequestMethod.GET)
    public @ResponseBody String getDSList(){
        String json = DS.getDSList();
        return json;
    }

    @RequestMapping(path = "/EditDescription", method = RequestMethod.POST)
    public @ResponseBody int EditDescription(@RequestBody Disease disease){
//        System.out.println("edit: "+disease.getName()+disease.getDescription());
        disease.setDescription(disease.getDescription().substring(3,disease.getDescription().length()-4));
        return DS.descriptionEdit(disease);
    }
}
