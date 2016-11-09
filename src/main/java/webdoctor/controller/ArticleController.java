package webdoctor.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.service.ArticleService;
import webdoctor.service.Authorization;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.jooq.tables.pojos.Comment;
import webdoctor.jooq.tables.pojos.Article;

/**
 * Created by Yibih on 2016/11/6.
 */

@Controller
public class ArticleController {
    @Autowired
    ArticleService article;
    Comment comment;

    @RequestMapping(path = "/ArticlePostPage", method = RequestMethod.POST)
    public String ArticlePostPage() {return "ArticlePost.html";}

    @RequestMapping(path = "/ArticleEditPage", method = RequestMethod.POST)
    public String ArticleEditPage() {return "ArticleEdit.html";}

    @RequestMapping(path = "/ArticlePage", method = RequestMethod.POST)
    public String ArticlePage() {return "Article.html";}


}
