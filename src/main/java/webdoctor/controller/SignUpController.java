package webdoctor.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.User;

/**
 * Created by IAN on 2016/10/10.
 */
@Controller
public class SignUpController {

    @RequestMapping(path="/SignUpPage", method = RequestMethod.GET)
    public String SignUp() {
        return "signupPage.html";
    }

    @RequestMapping(path="/SignUp", method= RequestMethod.POST)
    public @ResponseBody int SignUp(@RequestBody User user) {
        System.out.println("Success");
        System.out.println(user);

        return 1;
    }

    @RequestMapping(path="/Login", method=RequestMethod.GET)
    public int Login() {
        return 0;
    }
}
