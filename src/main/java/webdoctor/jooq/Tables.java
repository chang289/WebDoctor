/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq;


import javax.annotation.Generated;

import webdoctor.jooq.tables.Disease;
import webdoctor.jooq.tables.DiseaseSymptom;
import webdoctor.jooq.tables.Symptom;
import webdoctor.jooq.tables.User;


/**
 * Convenience access to all tables in webdoctor
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>webdoctor.disease</code>.
     */
    public static final Disease DISEASE = webdoctor.jooq.tables.Disease.DISEASE;

    /**
     * The table <code>webdoctor.disease_symptom</code>.
     */
    public static final DiseaseSymptom DISEASE_SYMPTOM = webdoctor.jooq.tables.DiseaseSymptom.DISEASE_SYMPTOM;

    /**
     * The table <code>webdoctor.symptom</code>.
     */
    public static final Symptom SYMPTOM = webdoctor.jooq.tables.Symptom.SYMPTOM;

    /**
     * The table <code>webdoctor.user</code>.
     */
    public static final User USER = webdoctor.jooq.tables.User.USER;
}
