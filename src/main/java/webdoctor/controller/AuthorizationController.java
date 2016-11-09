package webdoctor.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.service.Authorization;
import webdoctor.jooq.tables.pojos.User;

/**
 * Created by Yibin Wu on 2016/10/9.
 */


@Controller
public class AuthorizationController {

    @Autowired
    Authorization A;

    @RequestMapping(path = "/CertificationPage", method = RequestMethod.GET)
    public String certificationPage() {
        return "authorityPage.html";
    }

    @RequestMapping(path = "/Certification", method = RequestMethod.POST)
    public @ResponseBody int Certification(@RequestBody User user) {
        return A.authorize(user);
    }



}