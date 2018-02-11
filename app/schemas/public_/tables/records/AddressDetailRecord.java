/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.public_.tables.AddressDetail;


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
public class AddressDetailRecord extends UpdatableRecordImpl<AddressDetailRecord> implements Record14<String, String, String, String, Long, String, String, Long, Long, String, Long, String, String, Timestamp> {

    private static final long serialVersionUID = 717988464;

    /**
     * Setter for <code>public.address_detail.city</code>.
     */
    public void setCity(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.address_detail.city</code>.
     */
    @Size(max = 255)
    public String getCity() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.address_detail.postcode</code>.
     */
    public void setPostcode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.address_detail.postcode</code>.
     */
    @Size(max = 255)
    public String getPostcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.address_detail.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.address_detail.address</code>.
     */
    @Size(max = 255)
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.address_detail.region</code>.
     */
    public void setRegion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.address_detail.region</code>.
     */
    @Size(max = 255)
    public String getRegion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.address_detail.id</code>.
     */
    public void setId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.address_detail.id</code>.
     */
    public Long getId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.address_detail.student_fk</code>.
     */
    public void setStudentFk(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.address_detail.student_fk</code>.
     */
    @Size(max = 30)
    public String getStudentFk() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.address_detail.permanent_address</code>.
     */
    public void setPermanentAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.address_detail.permanent_address</code>.
     */
    @Size(max = 255)
    public String getPermanentAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.address_detail.primary_number</code>.
     */
    public void setPrimaryNumber(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.address_detail.primary_number</code>.
     */
    public Long getPrimaryNumber() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.address_detail.home_number</code>.
     */
    public void setHomeNumber(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.address_detail.home_number</code>.
     */
    public Long getHomeNumber() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.address_detail.email</code>.
     */
    public void setEmail(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.address_detail.email</code>.
     */
    @Size(max = 50)
    public String getEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.address_detail.country_fk</code>.
     */
    public void setCountryFk(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.address_detail.country_fk</code>.
     */
    public Long getCountryFk() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>public.address_detail.country</code>.
     */
    public void setCountry(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.address_detail.country</code>.
     */
    @Size(max = 255)
    public String getCountry() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.address_detail.present_address</code>.
     */
    public void setPresentAddress(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.address_detail.present_address</code>.
     */
    @Size(max = 255)
    public String getPresentAddress() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.address_detail.valid_until</code>.
     */
    public void setValidUntil(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.address_detail.valid_until</code>.
     */
    public Timestamp getValidUntil() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, Long, String, String, Long, Long, String, Long, String, String, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, Long, String, String, Long, Long, String, Long, String, String, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AddressDetail.ADDRESS_DETAIL.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AddressDetail.ADDRESS_DETAIL.POSTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AddressDetail.ADDRESS_DETAIL.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AddressDetail.ADDRESS_DETAIL.REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return AddressDetail.ADDRESS_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AddressDetail.ADDRESS_DETAIL.STUDENT_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AddressDetail.ADDRESS_DETAIL.PERMANENT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return AddressDetail.ADDRESS_DETAIL.PRIMARY_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return AddressDetail.ADDRESS_DETAIL.HOME_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return AddressDetail.ADDRESS_DETAIL.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return AddressDetail.ADDRESS_DETAIL.COUNTRY_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return AddressDetail.ADDRESS_DETAIL.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return AddressDetail.ADDRESS_DETAIL.PRESENT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return AddressDetail.ADDRESS_DETAIL.VALID_UNTIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStudentFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPermanentAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getPrimaryNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getHomeNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getCountryFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPresentAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getValidUntil();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value1(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value2(String value) {
        setPostcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value3(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value4(String value) {
        setRegion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value5(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value6(String value) {
        setStudentFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value7(String value) {
        setPermanentAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value8(Long value) {
        setPrimaryNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value9(Long value) {
        setHomeNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value10(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value11(Long value) {
        setCountryFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value12(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value13(String value) {
        setPresentAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord value14(Timestamp value) {
        setValidUntil(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressDetailRecord values(String value1, String value2, String value3, String value4, Long value5, String value6, String value7, Long value8, Long value9, String value10, Long value11, String value12, String value13, Timestamp value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressDetailRecord
     */
    public AddressDetailRecord() {
        super(AddressDetail.ADDRESS_DETAIL);
    }

    /**
     * Create a detached, initialised AddressDetailRecord
     */
    public AddressDetailRecord(String city, String postcode, String address, String region, Long id, String studentFk, String permanentAddress, Long primaryNumber, Long homeNumber, String email, Long countryFk, String country, String presentAddress, Timestamp validUntil) {
        super(AddressDetail.ADDRESS_DETAIL);

        set(0, city);
        set(1, postcode);
        set(2, address);
        set(3, region);
        set(4, id);
        set(5, studentFk);
        set(6, permanentAddress);
        set(7, primaryNumber);
        set(8, homeNumber);
        set(9, email);
        set(10, countryFk);
        set(11, country);
        set(12, presentAddress);
        set(13, validUntil);
    }
}