package webdoctor.helperClass;

/**
 * Created by IAN on 2016/11/26.
 */
public class ArticleWithTime {
    private int id;
    private String authorName;
    private String title;
    private String timeStamp;
    private String content;
    private String disease;

    public void setId(int id) {
        this.id = id;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setdisease(String disease) {
        this.disease = disease;
    }
}
