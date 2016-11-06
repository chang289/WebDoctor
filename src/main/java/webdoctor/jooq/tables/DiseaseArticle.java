/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;

import webdoctor.jooq.Webdoctor;
import webdoctor.jooq.tables.records.DiseaseArticleRecord;


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
public class DiseaseArticle extends TableImpl<DiseaseArticleRecord> {

    private static final long serialVersionUID = 1050879401;

    /**
     * The reference instance of <code>webdoctor.disease_article</code>
     */
    public static final DiseaseArticle DISEASE_ARTICLE = new DiseaseArticle();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DiseaseArticleRecord> getRecordType() {
        return DiseaseArticleRecord.class;
    }

    /**
     * The column <code>webdoctor.disease_article.disease_id</code>.
     */
    public final TableField<DiseaseArticleRecord, UInteger> DISEASE_ID = createField("disease_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>webdoctor.disease_article.article_id</code>.
     */
    public final TableField<DiseaseArticleRecord, UInteger> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * Create a <code>webdoctor.disease_article</code> table reference
     */
    public DiseaseArticle() {
        this("disease_article", null);
    }

    /**
     * Create an aliased <code>webdoctor.disease_article</code> table reference
     */
    public DiseaseArticle(String alias) {
        this(alias, DISEASE_ARTICLE);
    }

    private DiseaseArticle(String alias, Table<DiseaseArticleRecord> aliased) {
        this(alias, aliased, null);
    }

    private DiseaseArticle(String alias, Table<DiseaseArticleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Webdoctor.WEBDOCTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiseaseArticle as(String alias) {
        return new DiseaseArticle(alias, this);
    }

    /**
     * Rename this table
     */
    public DiseaseArticle rename(String name) {
        return new DiseaseArticle(name, null);
    }
}
