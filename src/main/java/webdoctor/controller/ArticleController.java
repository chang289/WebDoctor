package webdoctor.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.jooq.tables.pojos.Disease;
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
    ArticleService articleService;
    Comment comment;

    @RequestMapping(path = "/ArticlePostPage", method = RequestMethod.GET)
    public String ArticlePostPage() {return "articlePost.html";}

    @RequestMapping(path = "/ArticleCreate", method = RequestMethod.POST)
    public @ResponseBody int createArticle(@RequestBody Article article){
        System.out.println(article);
        articleService.postArticle(article);
        return 1;
    }

    @RequestMapping(path = "/ArticleEditPage", method = RequestMethod.GET)
    public String ArticleEditPage() {
        return "articleEdit.html";
    }

    @RequestMapping(path = "/ArticlePage", method = RequestMethod.GET)
    public String ArticlePage() {return "article.html";}

    @RequestMapping(path = "/SendDisease", method = RequestMethod.POST)
    public @ResponseBody String sendDisease(@RequestBody Disease disease) {
        System.out.println("list: "+articleService.getRelatedArticle(disease));
        return "";
    }
}
