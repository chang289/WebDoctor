package webdoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IAN on 2016/11/8.
 */
@Controller
public class DescriptionController {

    @RequestMapping(path = "/EditDescriptionPage", method= RequestMethod.GET)
    public String editDiscriptionPage() {
        return "editDiscriptionPage.html";
    }
}
