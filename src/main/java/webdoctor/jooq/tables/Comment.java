/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;

import webdoctor.jooq.Webdoctor;
import webdoctor.jooq.tables.records.CommentRecord;


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
public class Comment extends TableImpl<CommentRecord> {

    private static final long serialVersionUID = 1586326070;

    /**
     * The reference instance of <code>webdoctor.comment</code>
     */
    public static final Comment COMMENT = new Comment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentRecord> getRecordType() {
        return CommentRecord.class;
    }

    /**
     * The column <code>webdoctor.comment.id</code>.
     */
    public final TableField<CommentRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>webdoctor.comment.user_id</code>.
     */
    public final TableField<CommentRecord, UInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>webdoctor.comment.article_id</code>.
     */
    public final TableField<CommentRecord, UInteger> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>webdoctor.comment.time_stamp</code>.
     */
    public final TableField<CommentRecord, Timestamp> TIME_STAMP = createField("time_stamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>webdoctor.comment.content</code>.
     */
    public final TableField<CommentRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>webdoctor.comment</code> table reference
     */
    public Comment() {
        this("comment", null);
    }

    /**
     * Create an aliased <code>webdoctor.comment</code> table reference
     */
    public Comment(String alias) {
        this(alias, COMMENT);
    }

    private Comment(String alias, Table<CommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comment(String alias, Table<CommentRecord> aliased, Field<?>[] parameters) {
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
    public Comment as(String alias) {
        return new Comment(alias, this);
    }

    /**
     * Rename this table
     */
    public Comment rename(String name) {
        return new Comment(name, null);
    }
}
