/**
 * This class is generated by jOOQ
 */
package jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.tables.Disease;
import jooq.tables.Symptom;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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

    private static final long serialVersionUID = -1438701844;

    /**
     * The reference instance of <code>webdoctor</code>
     */
    public static final Webdoctor WEBDOCTOR = new Webdoctor();

    /**
     * The table <code>webdoctor.disease</code>.
     */
    public final Disease DISEASE = jooq.tables.Disease.DISEASE;

    /**
     * The table <code>webdoctor.symptom</code>.
     */
    public final Symptom SYMPTOM = jooq.tables.Symptom.SYMPTOM;

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
            Disease.DISEASE,
            Symptom.SYMPTOM);
    }
}
