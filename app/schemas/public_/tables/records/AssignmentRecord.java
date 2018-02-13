/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.public_.tables.Assignment;


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
public class AssignmentRecord extends UpdatableRecordImpl<AssignmentRecord> implements Record7<Long, String, String, Long, Long, Long, Timestamp> {

    private static final long serialVersionUID = 1647695151;

    /**
     * Setter for <code>public.assignment.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.assignment.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.assignment.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.assignment.title</code>.
     */
    @Size(max = 50)
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.assignment.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.assignment.description</code>.
     */
    @Size(max = 50)
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.assignment.course_fk</code>.
     */
    public void setCourseFk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.assignment.course_fk</code>.
     */
    public Long getCourseFk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.assignment.batch_fk</code>.
     */
    public void setBatchFk(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.assignment.batch_fk</code>.
     */
    public Long getBatchFk() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.assignment.subject_fk</code>.
     */
    public void setSubjectFk(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.assignment.subject_fk</code>.
     */
    public Long getSubjectFk() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.assignment.date_submission</code>.
     */
    public void setDateSubmission(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.assignment.date_submission</code>.
     */
    public Timestamp getDateSubmission() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Long, Long, Long, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Long, Long, Long, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Assignment.ASSIGNMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Assignment.ASSIGNMENT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Assignment.ASSIGNMENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Assignment.ASSIGNMENT.COURSE_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Assignment.ASSIGNMENT.BATCH_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Assignment.ASSIGNMENT.SUBJECT_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Assignment.ASSIGNMENT.DATE_SUBMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
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
    public Long value4() {
        return getCourseFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getBatchFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getSubjectFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getDateSubmission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value4(Long value) {
        setCourseFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value5(Long value) {
        setBatchFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value6(Long value) {
        setSubjectFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord value7(Timestamp value) {
        setDateSubmission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentRecord values(Long value1, String value2, String value3, Long value4, Long value5, Long value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssignmentRecord
     */
    public AssignmentRecord() {
        super(Assignment.ASSIGNMENT);
    }

    /**
     * Create a detached, initialised AssignmentRecord
     */
    public AssignmentRecord(Long id, String title, String description, Long courseFk, Long batchFk, Long subjectFk, Timestamp dateSubmission) {
        super(Assignment.ASSIGNMENT);

        set(0, id);
        set(1, title);
        set(2, description);
        set(3, courseFk);
        set(4, batchFk);
        set(5, subjectFk);
        set(6, dateSubmission);
    }
}