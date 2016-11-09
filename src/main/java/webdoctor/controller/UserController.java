package webdoctor.controller;

import com.google.gson.Gson;
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
    Gson gson = new Gson();
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

    @RequestMapping(path="/UserPage", method = RequestMethod.GET)
    public String userPage() {
        return "userPage.html";
    }

    @RequestMapping(path = "/UserPage", method = RequestMethod.POST)
    public @ResponseBody String getUser(@RequestBody User user) {
        System.out.println("username:"+user.getUsername());
        User res = li.getUser(user);
        if (res == null) {
            return null;
        }
        else {
            return gson.toJson(res);
        }
    }


    @RequestMapping(path="/SignUp", method = RequestMethod.POST)
    public @ResponseBody int SignUp(@RequestBody User user) {
        return li.signUp(user);

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
