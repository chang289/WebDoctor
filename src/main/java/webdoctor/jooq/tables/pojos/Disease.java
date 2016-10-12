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
public class Disease implements Serializable {

    private static final long serialVersionUID = 1814279982;

    private Integer id;
    private String  name;
    private String  description;
    private String  department;

    public Disease() {}

    public Disease(Disease value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.department = value.department;
    }

    public Disease(
        Integer id,
        String  name,
        String  description,
        String  department
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Size(max = 200)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        StringBuilder sb = new StringBuilder("Disease (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(department);

        sb.append(")");
        return sb.toString();
    }
}