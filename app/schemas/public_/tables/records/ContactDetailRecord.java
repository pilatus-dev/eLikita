/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.public_.tables.ContactDetail;


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
public class ContactDetailRecord extends UpdatableRecordImpl<ContactDetailRecord> implements Record9<String, String, String, String, String, Long, Long, String, Long> {

    private static final long serialVersionUID = -2044562117;

    /**
     * Setter for <code>public.contact_detail.email</code>.
     */
    public void setEmail(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.contact_detail.email</code>.
     */
    @Size(max = 255)
    public String getEmail() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.contact_detail.ermergency_address</code>.
     */
    public void setErmergencyAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.contact_detail.ermergency_address</code>.
     */
    @Size(max = 255)
    public String getErmergencyAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.contact_detail.ermergency_name</code>.
     */
    public void setErmergencyName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.contact_detail.ermergency_name</code>.
     */
    @Size(max = 255)
    public String getErmergencyName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.contact_detail.ermergency_relation</code>.
     */
    public void setErmergencyRelation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.contact_detail.ermergency_relation</code>.
     */
    @Size(max = 255)
    public String getErmergencyRelation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.contact_detail.ermergency_number</code>.
     */
    public void setErmergencyNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.contact_detail.ermergency_number</code>.
     */
    @Size(max = 255)
    public String getErmergencyNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.contact_detail.primary_phoneno</code>.
     */
    public void setPrimaryPhoneno(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.contact_detail.primary_phoneno</code>.
     */
    public Long getPrimaryPhoneno() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.contact_detail.secondary_phoneno</code>.
     */
    public void setSecondaryPhoneno(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.contact_detail.secondary_phoneno</code>.
     */
    public Long getSecondaryPhoneno() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.contact_detail.skype_address</code>.
     */
    public void setSkypeAddress(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.contact_detail.skype_address</code>.
     */
    @Size(max = 255)
    public String getSkypeAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.contact_detail.id</code>.
     */
    public void setId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.contact_detail.id</code>.
     */
    @NotNull
    public Long getId() {
        return (Long) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, Long, Long, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, Long, Long, String, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ContactDetail.CONTACT_DETAIL.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ContactDetail.CONTACT_DETAIL.ERMERGENCY_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ContactDetail.CONTACT_DETAIL.ERMERGENCY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ContactDetail.CONTACT_DETAIL.ERMERGENCY_RELATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ContactDetail.CONTACT_DETAIL.ERMERGENCY_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return ContactDetail.CONTACT_DETAIL.PRIMARY_PHONENO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return ContactDetail.CONTACT_DETAIL.SECONDARY_PHONENO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ContactDetail.CONTACT_DETAIL.SKYPE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return ContactDetail.CONTACT_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getErmergencyAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getErmergencyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getErmergencyRelation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getErmergencyNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getPrimaryPhoneno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getSecondaryPhoneno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSkypeAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value1(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value2(String value) {
        setErmergencyAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value3(String value) {
        setErmergencyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value4(String value) {
        setErmergencyRelation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value5(String value) {
        setErmergencyNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value6(Long value) {
        setPrimaryPhoneno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value7(Long value) {
        setSecondaryPhoneno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value8(String value) {
        setSkypeAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord value9(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactDetailRecord values(String value1, String value2, String value3, String value4, String value5, Long value6, Long value7, String value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContactDetailRecord
     */
    public ContactDetailRecord() {
        super(ContactDetail.CONTACT_DETAIL);
    }

    /**
     * Create a detached, initialised ContactDetailRecord
     */
    public ContactDetailRecord(String email, String ermergencyAddress, String ermergencyName, String ermergencyRelation, String ermergencyNumber, Long primaryPhoneno, Long secondaryPhoneno, String skypeAddress, Long id) {
        super(ContactDetail.CONTACT_DETAIL);

        set(0, email);
        set(1, ermergencyAddress);
        set(2, ermergencyName);
        set(3, ermergencyRelation);
        set(4, ermergencyNumber);
        set(5, primaryPhoneno);
        set(6, secondaryPhoneno);
        set(7, skypeAddress);
        set(8, id);
    }
}
