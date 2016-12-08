package webdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.helperClass.Disease_Symptoms;
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



    @RequestMapping(path = "CreateSymptom", method = RequestMethod.POST)
    public @ResponseBody int CreateSymptom(@RequestBody Symptom S) {
        return DS.symptomCreate(S);
    }

    @RequestMapping(path = "CreateDescription", method = RequestMethod.POST)
    public @ResponseBody int CreateDescription(@RequestBody Disease_Symptoms D){

//        System.out.println(D);
//        System.out.println(D.getName());
//        System.out.println(D.getDescription());
//        System.out.println(D.getDepartment());

        return DS.descriptionCreate(D);

    }

    @RequestMapping(path = "CreateDescription", method = RequestMethod.GET)
    public @ResponseBody String getDSList(){
        String json = DS.getDSList();
        return json;
    }

    @RequestMapping(path = "/EditDescription", method = RequestMethod.POST)
    public @ResponseBody int EditDescription(@RequestBody Disease disease){
//        System.out.println("edit: "+disease.getName()+disease.getDescription());
        return DS.descriptionEdit(disease);
    }

    @RequestMapping(path = "/DeleteDescription", method = RequestMethod.POST)
    public @ResponseBody int deleteDescription(@RequestBody Disease disease) {
        return DS.deleteDescription(disease);
    }
}
