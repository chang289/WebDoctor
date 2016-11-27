package webdoctor.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webdoctor.helperClass.ArticleWithTime;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.service.ArticleService;
import webdoctor.service.Authorization;
import webdoctor.jooq.tables.pojos.User;
import webdoctor.jooq.tables.pojos.Comment;
import webdoctor.jooq.tables.pojos.Article;
import webdoctor.service.Search;

/**
 * Created by Yibih on 2016/11/6.
 */

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @Autowired
    Search search;

    @RequestMapping(path = "/ArticlePostPage", method = RequestMethod.GET)
    public String ArticlePostPage() {return "articlePost.html";}

    @RequestMapping(path = "/ArticleCreate", method = RequestMethod.POST)
    public @ResponseBody int createArticle(@RequestBody Article article){
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
    public @ResponseBody ArticleWithTime[] sendDisease(@RequestBody Disease disease) {
        return articleService.getRelatedArticle(search.diseaseByName(disease.getName()));
    }

    @RequestMapping(path = "/ArticleImage", method = RequestMethod.POST)
    public @ResponseBody int articleImage() {
        System.out.println("gotit");
        return 1;
    }
}
