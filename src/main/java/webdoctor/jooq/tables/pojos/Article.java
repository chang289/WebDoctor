/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Article implements Serializable {

    private static final long serialVersionUID = -2068433567;

    private Integer   id;
    private String    authorName;
    private String    title;
    private Timestamp timeStamp;
    private String    content;
    private String    disease;

    public Article() {}

    public Article(Article value) {
        this.id = value.id;
        this.authorName = value.authorName;
        this.title = value.title;
        this.timeStamp = value.timeStamp;
        this.content = value.content;
        this.disease = value.disease;
    }

    public Article(
        Integer   id,
        String    authorName,
        String    title,
        Timestamp timeStamp,
        String    content,
        String    disease
    ) {
        this.id = id;
        this.authorName = authorName;
        this.title = title;
        this.timeStamp = timeStamp;
        this.content = content;
        this.disease = disease;
    }

    @NotNull
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Size(max = 20)
    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Size(max = 1000)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Size(max = 16777215)
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Size(max = 50)
    public String getDisease() {
        return this.disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Article (");

        sb.append(id);
        sb.append(", ").append(authorName);
        sb.append(", ").append(title);
        sb.append(", ").append(timeStamp);
        sb.append(", ").append(content);
        sb.append(", ").append(disease);

        sb.append(")");
        return sb.toString();
    }
}
