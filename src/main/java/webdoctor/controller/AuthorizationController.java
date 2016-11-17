package webdoctor.controller;

import com.google.api.services.gmail.model.Message;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.service.Authorization;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.service.EmailService;
import webdoctor.service.UserService;

/**
 * Created by Yibin Wu on 2016/10/9.
 */


@Controller
public class AuthorizationController {

    private final String from = "zhouyiyan1995@gmail.com";
    private final String subject = "Email from the god";

    @Autowired
    Authorization A;

    @Autowired
    UserService us;

    @Autowired
    EmailService es;

    @RequestMapping(path = "/CertificationPage", method = RequestMethod.GET)
    public String certificationPage() {
        return "authorityPage.html";
    }

    @RequestMapping(path = "/setAuthority", method = RequestMethod.POST)
    public @ResponseBody int Certification(@RequestBody User user) {
        return A.authorize(user);
    }

    @RequestMapping(path = "/Certification", method = RequestMethod.POST)
    public @ResponseBody int setAuthority(@RequestBody User user) {
        User data = us.getUser(user);
        String bodytext = "Damn son, you are the chosen one. Click on this link to save the world: \n" + "http://localhost:8080/Certification/" + user.getUsername() + "/" + user.getAuthority();
        System.out.println("authority: " + user.getAuthority());
        System.out.println(bodytext);
        Message message = es.sendEmail(data.getEmail(), from, subject, bodytext);
        if (data == null || message == null) {
            return 0;
        }
        else {
            return 1;
        }
    }

    @RequestMapping(path = "/Certification/{username}/{authority}", method = RequestMethod.GET)
    public void setAuthority(@PathVariable String username, @PathVariable String authority) {
        User user = new User();
        user.setUsername(username);
        user.setAuthority(authority);
        System.out.println("user: " + user);
        A.authorize(user);
    }
}