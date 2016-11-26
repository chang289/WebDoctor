/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import webdoctor.jooq.tables.Article;
import webdoctor.jooq.tables.Comment;
import webdoctor.jooq.tables.Disease;
import webdoctor.jooq.tables.DiseaseSymptom;
import webdoctor.jooq.tables.Symptom;
import webdoctor.jooq.tables.User;
import webdoctor.jooq.tables.UserFavouritearticle;


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
public class Webdoctor extends SchemaImpl {

    private static final long serialVersionUID = 1429730921;

    /**
     * The reference instance of <code>webdoctor</code>
     */
    public static final Webdoctor WEBDOCTOR = new Webdoctor();

    /**
     * The table <code>webdoctor.article</code>.
     */
    public final Article ARTICLE = webdoctor.jooq.tables.Article.ARTICLE;

    /**
     * The table <code>webdoctor.comment</code>.
     */
    public final Comment COMMENT = webdoctor.jooq.tables.Comment.COMMENT;

    /**
     * The table <code>webdoctor.disease</code>.
     */
    public final Disease DISEASE = webdoctor.jooq.tables.Disease.DISEASE;

    /**
     * The table <code>webdoctor.disease_symptom</code>.
     */
    public final DiseaseSymptom DISEASE_SYMPTOM = webdoctor.jooq.tables.DiseaseSymptom.DISEASE_SYMPTOM;

    /**
     * The table <code>webdoctor.symptom</code>.
     */
    public final Symptom SYMPTOM = webdoctor.jooq.tables.Symptom.SYMPTOM;

    /**
     * The table <code>webdoctor.user</code>.
     */
    public final User USER = webdoctor.jooq.tables.User.USER;

    /**
     * The table <code>webdoctor.user_favouritearticle</code>.
     */
    public final UserFavouritearticle USER_FAVOURITEARTICLE = webdoctor.jooq.tables.UserFavouritearticle.USER_FAVOURITEARTICLE;

    /**
     * No further instances allowed
     */
    private Webdoctor() {
        super("webdoctor", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Article.ARTICLE,
            Comment.COMMENT,
            Disease.DISEASE,
            DiseaseSymptom.DISEASE_SYMPTOM,
            Symptom.SYMPTOM,
            User.USER,
            UserFavouritearticle.USER_FAVOURITEARTICLE);
    }
}
