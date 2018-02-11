/*
 * This file is generated by jOOQ.
*/
package schemas.administrator.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class StudentPresence implements Serializable {

    private static final long serialVersionUID = -778516397;

    private String    studentFk;
    private String    classScheduleFk;
    private Boolean   present;
    private Timestamp dates;
    private String    additionalInfo;
    private Long      id;

    public StudentPresence() {}

    public StudentPresence(StudentPresence value) {
        this.studentFk = value.studentFk;
        this.classScheduleFk = value.classScheduleFk;
        this.present = value.present;
        this.dates = value.dates;
        this.additionalInfo = value.additionalInfo;
        this.id = value.id;
    }

    public StudentPresence(
        String    studentFk,
        String    classScheduleFk,
        Boolean   present,
        Timestamp dates,
        String    additionalInfo,
        Long      id
    ) {
        this.studentFk = studentFk;
        this.classScheduleFk = classScheduleFk;
        this.present = present;
        this.dates = dates;
        this.additionalInfo = additionalInfo;
        this.id = id;
    }

    @Size(max = 50)
    public String getStudentFk() {
        return this.studentFk;
    }

    public void setStudentFk(String studentFk) {
        this.studentFk = studentFk;
    }

    @Size(max = 50)
    public String getClassScheduleFk() {
        return this.classScheduleFk;
    }

    public void setClassScheduleFk(String classScheduleFk) {
        this.classScheduleFk = classScheduleFk;
    }

    public Boolean getPresent() {
        return this.present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public Timestamp getDates() {
        return this.dates;
    }

    public void setDates(Timestamp dates) {
        this.dates = dates;
    }

    @Size(max = 50)
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StudentPresence (");

        sb.append(studentFk);
        sb.append(", ").append(classScheduleFk);
        sb.append(", ").append(present);
        sb.append(", ").append(dates);
        sb.append(", ").append(additionalInfo);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}