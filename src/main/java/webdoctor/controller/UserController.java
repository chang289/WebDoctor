package webdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.service.Authorization;
import webdoctor.service.UserService;

/**
 * Created by IAN on 2016/10/10.
 */
@Controller
public class UserController {

    @Autowired
    UserService li;

    @RequestMapping(path="/SignUpPage", method = RequestMethod.GET)
    public String SignUp() {
        return "signupPage.html";
    }

    @RequestMapping(path="/ChangeProfilePage", method = RequestMethod.GET)
    public String ChangeProfile() {
        return "ChangeProfilePage.html";
    }




    @RequestMapping(path="/SignUp", method = RequestMethod.POST)
    public @ResponseBody int SignUp(@RequestBody User user) {
        if(li.checkValid(user) == 0) {
            return li.signUp(user);
        }else {
            return 0;
        }
    }

    @RequestMapping(path="/Login", method=RequestMethod.POST)
    public @ResponseBody int Login(@RequestBody User user) {
        return li.login(user);
    }

    @RequestMapping(path="/ChangePassword", method=RequestMethod.POST)
    public @ResponseBody int ChangePassword(@RequestBody User user) {
        return li.changePassword(user);
    }

    @RequestMapping(path="/ChangeMail", method=RequestMethod.POST)
    public @ResponseBody int ChangeEmail(@RequestBody User user) {
        return li.changeEmail(user);
    }
}
