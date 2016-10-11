/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import webdoctor.jooq.Keys;
import webdoctor.jooq.Webdoctor;
import webdoctor.jooq.tables.records.SymptomRecord;


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
public class Symptom extends TableImpl<SymptomRecord> {

    private static final long serialVersionUID = 293609644;

    /**
     * The reference instance of <code>webdoctor.symptom</code>
     */
    public static final Symptom SYMPTOM = new Symptom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SymptomRecord> getRecordType() {
        return SymptomRecord.class;
    }

    /**
     * The column <code>webdoctor.symptom.id</code>.
     */
    public final TableField<SymptomRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>webdoctor.symptom.name</code>.
     */
    public final TableField<SymptomRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>webdoctor.symptom.department</code>.
     */
    public final TableField<SymptomRecord, String> DEPARTMENT = createField("department", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>webdoctor.symptom</code> table reference
     */
    public Symptom() {
        this("symptom", null);
    }

    /**
     * Create an aliased <code>webdoctor.symptom</code> table reference
     */
    public Symptom(String alias) {
        this(alias, SYMPTOM);
    }

    private Symptom(String alias, Table<SymptomRecord> aliased) {
        this(alias, aliased, null);
    }

    private Symptom(String alias, Table<SymptomRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SymptomRecord> getPrimaryKey() {
        return Keys.KEY_SYMPTOM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SymptomRecord>> getKeys() {
        return Arrays.<UniqueKey<SymptomRecord>>asList(Keys.KEY_SYMPTOM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Symptom as(String alias) {
        return new Symptom(alias, this);
    }

    /**
     * Rename this table
     */
    public Symptom rename(String name) {
        return new Symptom(name, null);
    }
}
