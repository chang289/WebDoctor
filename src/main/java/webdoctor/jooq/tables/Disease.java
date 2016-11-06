/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import webdoctor.jooq.Keys;
import webdoctor.jooq.Webdoctor;
import webdoctor.jooq.tables.records.DiseaseRecord;


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
public class Disease extends TableImpl<DiseaseRecord> {

    private static final long serialVersionUID = -1980996256;

    /**
     * The reference instance of <code>webdoctor.disease</code>
     */
    public static final Disease DISEASE = new Disease();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DiseaseRecord> getRecordType() {
        return DiseaseRecord.class;
    }

    /**
     * The column <code>webdoctor.disease.id</code>.
     */
    public final TableField<DiseaseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>webdoctor.disease.name</code>.
     */
    public final TableField<DiseaseRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>webdoctor.disease.description</code>.
     */
    public final TableField<DiseaseRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(10000), this, "");

    /**
     * The column <code>webdoctor.disease.department</code>.
     */
    public final TableField<DiseaseRecord, String> DEPARTMENT = createField("department", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>webdoctor.disease</code> table reference
     */
    public Disease() {
        this("disease", null);
    }

    /**
     * Create an aliased <code>webdoctor.disease</code> table reference
     */
    public Disease(String alias) {
        this(alias, DISEASE);
    }

    private Disease(String alias, Table<DiseaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Disease(String alias, Table<DiseaseRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DiseaseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DISEASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DiseaseRecord> getPrimaryKey() {
        return Keys.KEY_DISEASE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DiseaseRecord>> getKeys() {
        return Arrays.<UniqueKey<DiseaseRecord>>asList(Keys.KEY_DISEASE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Disease as(String alias) {
        return new Disease(alias, this);
    }

    /**
     * Rename this table
     */
    public Disease rename(String name) {
        return new Disease(name, null);
    }
}
