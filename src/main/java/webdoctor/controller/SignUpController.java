package webdoctor.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
    public void SignUp(@RequestBody User user) {
        System.out.println("Success");
        System.out.println(user);

        return;
    }

    @RequestMapping(path="/Login", method=RequestMethod.GET)
    public int Login() {
        return 0;
    }
}
