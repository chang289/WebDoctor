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

import webdoctor.jooq.Webdoctor;
import webdoctor.jooq.tables.records.DiseaseSymptomRecord;


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
public class DiseaseSymptom extends TableImpl<DiseaseSymptomRecord> {

    private static final long serialVersionUID = -1661191447;

    /**
     * The reference instance of <code>webdoctor.disease_symptom</code>
     */
    public static final DiseaseSymptom DISEASE_SYMPTOM = new DiseaseSymptom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DiseaseSymptomRecord> getRecordType() {
        return DiseaseSymptomRecord.class;
    }

    /**
     * The column <code>webdoctor.disease_symptom.tagid</code>.
     */
    public final TableField<DiseaseSymptomRecord, Integer> TAGID = createField("tagid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>webdoctor.disease_symptom.diseaseid</code>.
     */
    public final TableField<DiseaseSymptomRecord, Integer> DISEASEID = createField("diseaseid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>webdoctor.disease_symptom</code> table reference
     */
    public DiseaseSymptom() {
        this("disease_symptom", null);
    }

    /**
     * Create an aliased <code>webdoctor.disease_symptom</code> table reference
     */
    public DiseaseSymptom(String alias) {
        this(alias, DISEASE_SYMPTOM);
    }

    private DiseaseSymptom(String alias, Table<DiseaseSymptomRecord> aliased) {
        this(alias, aliased, null);
    }

    private DiseaseSymptom(String alias, Table<DiseaseSymptomRecord> aliased, Field<?>[] parameters) {
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
    public DiseaseSymptom as(String alias) {
        return new DiseaseSymptom(alias, this);
    }

    /**
     * Rename this table
     */
    public DiseaseSymptom rename(String name) {
        return new DiseaseSymptom(name, null);
    }
}
