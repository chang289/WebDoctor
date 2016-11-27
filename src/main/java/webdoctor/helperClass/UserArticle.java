package webdoctor.helperClass;

import webdoctor.jooq.tables.pojos.User;

/**
 * Created by IAN on 2016/11/27.
 */
public class UserArticle {
    private User user;
    private int articleId;

    public User getUser() {
        return user;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
}
