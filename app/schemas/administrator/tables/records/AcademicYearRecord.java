/*
 * This file is generated by jOOQ.
*/
package schemas.administrator.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.administrator.tables.AcademicYear;


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
public class AcademicYearRecord extends UpdatableRecordImpl<AcademicYearRecord> implements Record6<Long, String, String, String, String, String> {

    private static final long serialVersionUID = -1422504058;

    /**
     * Setter for <code>administrator.academic_year.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>administrator.academic_year.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>administrator.academic_year.start_year</code>.
     */
    public void setStartYear(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>administrator.academic_year.start_year</code>.
     */
    @Size(max = 4)
    public String getStartYear() {
        return (String) get(1);
    }

    /**
     * Setter for <code>administrator.academic_year.end_year</code>.
     */
    public void setEndYear(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>administrator.academic_year.end_year</code>.
     */
    @Size(max = 4)
    public String getEndYear() {
        return (String) get(2);
    }

    /**
     * Setter for <code>administrator.academic_year.start_month</code>.
     */
    public void setStartMonth(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>administrator.academic_year.start_month</code>.
     */
    @Size(max = 10)
    public String getStartMonth() {
        return (String) get(3);
    }

    /**
     * Setter for <code>administrator.academic_year.end_month</code>.
     */
    public void setEndMonth(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>administrator.academic_year.end_month</code>.
     */
    @Size(max = 10)
    public String getEndMonth() {
        return (String) get(4);
    }

    /**
     * Setter for <code>administrator.academic_year.status</code>.
     */
    public void setStatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>administrator.academic_year.status</code>.
     */
    @Size(max = 15)
    public String getStatus() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AcademicYear.ACADEMIC_YEAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AcademicYear.ACADEMIC_YEAR.START_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AcademicYear.ACADEMIC_YEAR.END_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AcademicYear.ACADEMIC_YEAR.START_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AcademicYear.ACADEMIC_YEAR.END_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AcademicYear.ACADEMIC_YEAR.STATUS;
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
        return getStartYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEndYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStartMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEndMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value2(String value) {
        setStartYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value3(String value) {
        setEndYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value4(String value) {
        setStartMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value5(String value) {
        setEndMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value6(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord values(Long value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AcademicYearRecord
     */
    public AcademicYearRecord() {
        super(AcademicYear.ACADEMIC_YEAR);
    }

    /**
     * Create a detached, initialised AcademicYearRecord
     */
    public AcademicYearRecord(Long id, String startYear, String endYear, String startMonth, String endMonth, String status) {
        super(AcademicYear.ACADEMIC_YEAR);

        set(0, id);
        set(1, startYear);
        set(2, endYear);
        set(3, startMonth);
        set(4, endMonth);
        set(5, status);
    }
}