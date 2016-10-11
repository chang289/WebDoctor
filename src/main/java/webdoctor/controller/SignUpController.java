package webdoctor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IAN on 2016/10/10.
 */
@RestController
public class SignUpController {

    @RequestMapping(path="/SignUp", method= RequestMethod.PUT)
    public int SignUp() {
        return 0;
    }

    @RequestMapping(path="/Login", method=RequestMethod.GET)
    public int Login() {
        return 0;
    }
}
