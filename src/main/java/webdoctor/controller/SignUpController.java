package webdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.service.LogIn;
/**
 * Created by IAN on 2016/10/10.
 */
@Controller
public class SignUpController {

    @Autowired
    LogIn login;

    @RequestMapping(path="/SignUpPage", method = RequestMethod.GET)
    public String SignUp() {
        return "signupPage.html";
    }

    @RequestMapping(path="/SignUp", method= RequestMethod.GET)
    public @ResponseBody int SignUpCheck(@RequestBody User user) {
        return login.checkValid(user);
    }

    @RequestMapping(path="/SignUp", method = RequestMethod.POST)
    public @ResponseBody int SignUp(@RequestBody User user) {
        return login.signin(user);
    }

    @RequestMapping(path="/Login", method=RequestMethod.GET)
    public int Login() {
        return 0;
    }
}
