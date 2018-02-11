/*
 * This file is generated by jOOQ.
*/
package schemas.administrator.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContactPersonStudent implements Serializable {

    private static final long serialVersionUID = 631385326;

    private Long   id;
    private Long   contactPersonFk;
    private String studentFk;
    private Long   contactPersonTypeFk;

    public ContactPersonStudent() {}

    public ContactPersonStudent(ContactPersonStudent value) {
        this.id = value.id;
        this.contactPersonFk = value.contactPersonFk;
        this.studentFk = value.studentFk;
        this.contactPersonTypeFk = value.contactPersonTypeFk;
    }

    public ContactPersonStudent(
        Long   id,
        Long   contactPersonFk,
        String studentFk,
        Long   contactPersonTypeFk
    ) {
        this.id = id;
        this.contactPersonFk = contactPersonFk;
        this.studentFk = studentFk;
        this.contactPersonTypeFk = contactPersonTypeFk;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContactPersonFk() {
        return this.contactPersonFk;
    }

    public void setContactPersonFk(Long contactPersonFk) {
        this.contactPersonFk = contactPersonFk;
    }

    @Size(max = 50)
    public String getStudentFk() {
        return this.studentFk;
    }

    public void setStudentFk(String studentFk) {
        this.studentFk = studentFk;
    }

    public Long getContactPersonTypeFk() {
        return this.contactPersonTypeFk;
    }

    public void setContactPersonTypeFk(Long contactPersonTypeFk) {
        this.contactPersonTypeFk = contactPersonTypeFk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContactPersonStudent (");

        sb.append(id);
        sb.append(", ").append(contactPersonFk);
        sb.append(", ").append(studentFk);
        sb.append(", ").append(contactPersonTypeFk);

        sb.append(")");
        return sb.toString();
    }
}