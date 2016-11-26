/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import webdoctor.jooq.tables.Disease;


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
public class DiseaseRecord extends UpdatableRecordImpl<DiseaseRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 741128145;

    /**
     * Setter for <code>webdoctor.disease.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>webdoctor.disease.id</code>.
     */
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>webdoctor.disease.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>webdoctor.disease.name</code>.
     */
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>webdoctor.disease.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>webdoctor.disease.description</code>.
     */
    @Size(max = 16777215)
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>webdoctor.disease.department</code>.
     */
    public void setDepartment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>webdoctor.disease.department</code>.
     */
    @Size(max = 50)
    public String getDepartment() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Disease.DISEASE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Disease.DISEASE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Disease.DISEASE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Disease.DISEASE.DEPARTMENT;
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDepartment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiseaseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiseaseRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiseaseRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiseaseRecord value4(String value) {
        setDepartment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiseaseRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DiseaseRecord
     */
    public DiseaseRecord() {
        super(Disease.DISEASE);
    }

    /**
     * Create a detached, initialised DiseaseRecord
     */
    public DiseaseRecord(Integer id, String name, String description, String department) {
        super(Disease.DISEASE);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, department);
    }
}
