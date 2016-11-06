/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.types.UInteger;


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

<<<<<<< HEAD
    private static final long serialVersionUID = 732273634;

    private UInteger  id;
=======
    private static final long serialVersionUID = 819413992;

    private UInteger  id;
    private Integer   authorId;
>>>>>>> yibin
    private String    title;
    private Timestamp timeStamp;
    private String    content;

    public Article() {}

    public Article(Article value) {
        this.id = value.id;
<<<<<<< HEAD
=======
        this.authorId = value.authorId;
>>>>>>> yibin
        this.title = value.title;
        this.timeStamp = value.timeStamp;
        this.content = value.content;
    }

    public Article(
        UInteger  id,
<<<<<<< HEAD
=======
        Integer   authorId,
>>>>>>> yibin
        String    title,
        Timestamp timeStamp,
        String    content
    ) {
        this.id = id;
<<<<<<< HEAD
=======
        this.authorId = authorId;
>>>>>>> yibin
        this.title = title;
        this.timeStamp = timeStamp;
        this.content = content;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

<<<<<<< HEAD
=======
    public Integer getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

>>>>>>> yibin
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Article (");

        sb.append(id);
<<<<<<< HEAD
=======
        sb.append(", ").append(authorId);
>>>>>>> yibin
        sb.append(", ").append(title);
        sb.append(", ").append(timeStamp);
        sb.append(", ").append(content);

        sb.append(")");
        return sb.toString();
    }
}
