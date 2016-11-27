package webdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webdoctor.helperClass.UserArticle;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.service.FavouriteService;
import webdoctor.service.UserService;

/**
 * Created by IAN on 2016/11/27.
 */
@Controller
public class FavouriteController {

    @Autowired
    FavouriteService fs;

    @RequestMapping(path = "/addFavourite", method = RequestMethod.POST)
    public @ResponseBody
    int setFavourite(@RequestBody UserArticle ua) {
        return fs.setFavourite(ua);
    }

    @RequestMapping(path = "deleteFavourite", method = RequestMethod.POST)
    public @ResponseBody int deleteFavourite(@RequestBody UserArticle ua) {
        return fs.deleteFavourite(ua);
    }

    @RequestMapping(path = "getFavourite", method = RequestMethod.POST)
    public @ResponseBody Article[] getFavourite(@RequestBody User user) {
        return fs.getFavourite(user);
    }
}
