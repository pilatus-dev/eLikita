/*
 * This file is generated by jOOQ.
*/
package schemas.referential.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.referential.tables.RCountry;


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
public class RCountryRecord extends UpdatableRecordImpl<RCountryRecord> implements Record7<String, String, String, String, Long, Long, Long> {

    private static final long serialVersionUID = -329465584;

    /**
     * Setter for <code>referential.r_country.iso</code>.
     */
    public void setIso(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>referential.r_country.iso</code>.
     */
    @NotNull
    @Size(max = 2)
    public String getIso() {
        return (String) get(0);
    }

    /**
     * Setter for <code>referential.r_country.name_</code>.
     */
    public void setName_(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>referential.r_country.name_</code>.
     */
    @NotNull
    @Size(max = 80)
    public String getName_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>referential.r_country.nicename</code>.
     */
    public void setNicename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>referential.r_country.nicename</code>.
     */
    @NotNull
    @Size(max = 80)
    public String getNicename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>referential.r_country.iso3</code>.
     */
    public void setIso3(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>referential.r_country.iso3</code>.
     */
    @Size(max = 3)
    public String getIso3() {
        return (String) get(3);
    }

    /**
     * Setter for <code>referential.r_country.numcode</code>.
     */
    public void setNumcode(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>referential.r_country.numcode</code>.
     */
    public Long getNumcode() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>referential.r_country.phonecode</code>.
     */
    public void setPhonecode(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>referential.r_country.phonecode</code>.
     */
    @NotNull
    public Long getPhonecode() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>referential.r_country.id</code>.
     */
    public void setId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>referential.r_country.id</code>.
     */
    @NotNull
    public Long getId() {
        return (Long) get(6);
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
    public Row7<String, String, String, String, Long, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Long, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RCountry.R_COUNTRY.ISO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RCountry.R_COUNTRY.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RCountry.R_COUNTRY.NICENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RCountry.R_COUNTRY.ISO3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return RCountry.R_COUNTRY.NUMCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return RCountry.R_COUNTRY.PHONECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return RCountry.R_COUNTRY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getIso();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNicename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIso3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getNumcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getPhonecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value1(String value) {
        setIso(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value2(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value3(String value) {
        setNicename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value4(String value) {
        setIso3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value5(Long value) {
        setNumcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value6(Long value) {
        setPhonecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord value7(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCountryRecord values(String value1, String value2, String value3, String value4, Long value5, Long value6, Long value7) {
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
     * Create a detached RCountryRecord
     */
    public RCountryRecord() {
        super(RCountry.R_COUNTRY);
    }

    /**
     * Create a detached, initialised RCountryRecord
     */
    public RCountryRecord(String iso, String name_, String nicename, String iso3, Long numcode, Long phonecode, Long id) {
        super(RCountry.R_COUNTRY);

        set(0, iso);
        set(1, name_);
        set(2, nicename);
        set(3, iso3);
        set(4, numcode);
        set(5, phonecode);
        set(6, id);
    }
}
