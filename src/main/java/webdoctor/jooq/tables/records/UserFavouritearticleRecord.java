/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

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
public class UserFavouritearticleRecord extends TableRecordImpl<UserFavouritearticleRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1125472013;

    /**
     * Setter for <code>webdoctor.user_favouritearticle.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>webdoctor.user_favouritearticle.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>webdoctor.user_favouritearticle.article_id</code>.
     */
    public void setArticleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>webdoctor.user_favouritearticle.article_id</code>.
     */
    public Integer getArticleId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserFavouritearticle.USER_FAVOURITEARTICLE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserFavouritearticle.USER_FAVOURITEARTICLE.ARTICLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getArticleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserFavouritearticleRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserFavouritearticleRecord value2(Integer value) {
        setArticleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserFavouritearticleRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserFavouritearticleRecord
     */
    public UserFavouritearticleRecord() {
        super(UserFavouritearticle.USER_FAVOURITEARTICLE);
    }

    /**
     * Create a detached, initialised UserFavouritearticleRecord
     */
    public UserFavouritearticleRecord(Integer userId, Integer articleId) {
        super(UserFavouritearticle.USER_FAVOURITEARTICLE);

        set(0, userId);
        set(1, articleId);
    }
}
