/**
 * This class is generated by jOOQ
 */
package webdoctor.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class Symptom implements Serializable {

    private static final long serialVersionUID = -840005457;

    private Integer id;
    private String  name;
    private String  department;

    public Symptom() {}

    public Symptom(Symptom value) {
        this.id = value.id;
        this.name = value.name;
        this.department = value.department;
    }

    public Symptom(
        Integer id,
        String  name,
        String  department
    ) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @NotNull
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Size(max = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(max = 50)
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Symptom (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(department);

        sb.append(")");
        return sb.toString();
    }
}
