/**
 * This class is generated by jOOQ
 */
package jooq.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.tables.Symptom;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SymptomRecord extends UpdatableRecordImpl<SymptomRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 762465489;

    /**
     * Setter for <code>webdoctor.symptom.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>webdoctor.symptom.id</code>.
     */
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>webdoctor.symptom.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>webdoctor.symptom.name</code>.
     */
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>webdoctor.symptom.department</code>.
     */
    public void setDepartment(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>webdoctor.symptom.department</code>.
     */
    @Size(max = 50)
    public String getDepartment() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Symptom.SYMPTOM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Symptom.SYMPTOM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Symptom.SYMPTOM.DEPARTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDepartment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SymptomRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SymptomRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SymptomRecord value3(String value) {
        setDepartment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SymptomRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SymptomRecord
     */
    public SymptomRecord() {
        super(Symptom.SYMPTOM);
    }

    /**
     * Create a detached, initialised SymptomRecord
     */
    public SymptomRecord(Integer id, String name, String department) {
        super(Symptom.SYMPTOM);

        set(0, id);
        set(1, name);
        set(2, department);
    }
}
