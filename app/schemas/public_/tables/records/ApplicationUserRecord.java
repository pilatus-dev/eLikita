/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.public_.tables.ApplicationUser;


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
public class ApplicationUserRecord extends UpdatableRecordImpl<ApplicationUserRecord> implements Record9<Long, String, String, Boolean, String, Timestamp, Boolean, Long, String> {

    private static final long serialVersionUID = -534617200;

    /**
     * Setter for <code>public.application_user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.application_user.id</code>.
     */
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.application_user.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.application_user.email</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.application_user.password_</code>.
     */
    public void setPassword_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.application_user.password_</code>.
     */
    @Size(max = 100)
    public String getPassword_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.application_user.is_active</code>.
     */
    public void setIsActive(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.application_user.is_active</code>.
     */
    public Boolean getIsActive() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.application_user.meta_data</code>.
     */
    public void setMetaData(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.application_user.meta_data</code>.
     */
    @Size(max = 100)
    public String getMetaData() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.application_user.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.application_user.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>public.application_user.is_admin</code>.
     */
    public void setIsAdmin(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.application_user.is_admin</code>.
     */
    public Boolean getIsAdmin() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.application_user.patient_fk</code>.
     */
    public void setPatientFk(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.application_user.patient_fk</code>.
     */
    public Long getPatientFk() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.application_user.name_</code>.
     */
    public void setName_(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.application_user.name_</code>.
     */
    @Size(max = 50)
    public String getName_() {
        return (String) get(8);
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
    public Row9<Long, String, String, Boolean, String, Timestamp, Boolean, Long, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, Boolean, String, Timestamp, Boolean, Long, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ApplicationUser.APPLICATION_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ApplicationUser.APPLICATION_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ApplicationUser.APPLICATION_USER.PASSWORD_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return ApplicationUser.APPLICATION_USER.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ApplicationUser.APPLICATION_USER.META_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ApplicationUser.APPLICATION_USER.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return ApplicationUser.APPLICATION_USER.IS_ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return ApplicationUser.APPLICATION_USER.PATIENT_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ApplicationUser.APPLICATION_USER.NAME_;
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
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMetaData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getPatientFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value3(String value) {
        setPassword_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value4(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value5(String value) {
        setMetaData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value6(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value7(Boolean value) {
        setIsAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value8(Long value) {
        setPatientFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value9(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord values(Long value1, String value2, String value3, Boolean value4, String value5, Timestamp value6, Boolean value7, Long value8, String value9) {
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
     * Create a detached ApplicationUserRecord
     */
    public ApplicationUserRecord() {
        super(ApplicationUser.APPLICATION_USER);
    }

    /**
     * Create a detached, initialised ApplicationUserRecord
     */
    public ApplicationUserRecord(Long id, String email, String password_, Boolean isActive, String metaData, Timestamp lastUpdate, Boolean isAdmin, Long patientFk, String name_) {
        super(ApplicationUser.APPLICATION_USER);

        set(0, id);
        set(1, email);
        set(2, password_);
        set(3, isActive);
        set(4, metaData);
        set(5, lastUpdate);
        set(6, isAdmin);
        set(7, patientFk);
        set(8, name_);
    }
}