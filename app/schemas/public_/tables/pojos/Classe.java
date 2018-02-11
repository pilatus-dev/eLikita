/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.pojos;


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
public class Classe implements Serializable {

    private static final long serialVersionUID = -1419438382;

    private Long      id;
    private String    name_;
    private Long      classTypeFk;
    private Long      levelFk;
    private String    description;
    private Timestamp startDate;
    private Timestamp endDate;
    private Boolean   completed;
    private Long      studentNumber;
    private Long      classNumber;
    private String    studentNo;
    private Long      lecturerFk;
    private Long      moduleFk;

    public Classe() {}

    public Classe(Classe value) {
        this.id = value.id;
        this.name_ = value.name_;
        this.classTypeFk = value.classTypeFk;
        this.levelFk = value.levelFk;
        this.description = value.description;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.completed = value.completed;
        this.studentNumber = value.studentNumber;
        this.classNumber = value.classNumber;
        this.studentNo = value.studentNo;
        this.lecturerFk = value.lecturerFk;
        this.moduleFk = value.moduleFk;
    }

    public Classe(
        Long      id,
        String    name_,
        Long      classTypeFk,
        Long      levelFk,
        String    description,
        Timestamp startDate,
        Timestamp endDate,
        Boolean   completed,
        Long      studentNumber,
        Long      classNumber,
        String    studentNo,
        Long      lecturerFk,
        Long      moduleFk
    ) {
        this.id = id;
        this.name_ = name_;
        this.classTypeFk = classTypeFk;
        this.levelFk = levelFk;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = completed;
        this.studentNumber = studentNumber;
        this.classNumber = classNumber;
        this.studentNo = studentNo;
        this.lecturerFk = lecturerFk;
        this.moduleFk = moduleFk;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Size(max = 15)
    public String getName_() {
        return this.name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public Long getClassTypeFk() {
        return this.classTypeFk;
    }

    public void setClassTypeFk(Long classTypeFk) {
        this.classTypeFk = classTypeFk;
    }

    public Long getLevelFk() {
        return this.levelFk;
    }

    public void setLevelFk(Long levelFk) {
        this.levelFk = levelFk;
    }

    @Size(max = 50)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Long getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getClassNumber() {
        return this.classNumber;
    }

    public void setClassNumber(Long classNumber) {
        this.classNumber = classNumber;
    }

    @Size(max = 255)
    public String getStudentNo() {
        return this.studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public Long getLecturerFk() {
        return this.lecturerFk;
    }

    public void setLecturerFk(Long lecturerFk) {
        this.lecturerFk = lecturerFk;
    }

    public Long getModuleFk() {
        return this.moduleFk;
    }

    public void setModuleFk(Long moduleFk) {
        this.moduleFk = moduleFk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Classe (");

        sb.append(id);
        sb.append(", ").append(name_);
        sb.append(", ").append(classTypeFk);
        sb.append(", ").append(levelFk);
        sb.append(", ").append(description);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(completed);
        sb.append(", ").append(studentNumber);
        sb.append(", ").append(classNumber);
        sb.append(", ").append(studentNo);
        sb.append(", ").append(lecturerFk);
        sb.append(", ").append(moduleFk);

        sb.append(")");
        return sb.toString();
    }
}