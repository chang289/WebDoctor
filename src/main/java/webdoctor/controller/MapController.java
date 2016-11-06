package webdoctor.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Yibih on 2016/11/6.
 */


@Controller
public class MapController {

    @RequestMapping(path = "/MapPage", method = RequestMethod.GET)
    public String mapPage() {return "mapPage.html";}
}
