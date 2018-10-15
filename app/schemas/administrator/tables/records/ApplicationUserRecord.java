/*
 * This file is generated by jOOQ.
*/
package schemas.administrator.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.administrator.tables.ApplicationUser;


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
public class ApplicationUserRecord extends UpdatableRecordImpl<ApplicationUserRecord> implements Record8<Long, String, String, String, Boolean, String, Timestamp, Boolean> {

    private static final long serialVersionUID = 1792809663;

    /**
     * Setter for <code>administrator.application_user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>administrator.application_user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>administrator.application_user.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>administrator.application_user.name</code>.
     */
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>administrator.application_user.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>administrator.application_user.email</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>administrator.application_user.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>administrator.application_user.password</code>.
     */
    @Size(max = 100)
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>administrator.application_user.is_active</code>.
     */
    public void setIsActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>administrator.application_user.is_active</code>.
     */
    public Boolean getIsActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>administrator.application_user.meta_data</code>.
     */
    public void setMetaData(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>administrator.application_user.meta_data</code>.
     */
    @Size(max = 100)
    public String getMetaData() {
        return (String) get(5);
    }

    /**
     * Setter for <code>administrator.application_user.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>administrator.application_user.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>administrator.application_user.is_admin</code>.
     */
    public void setIsAdmin(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>administrator.application_user.is_admin</code>.
     */
    public Boolean getIsAdmin() {
        return (Boolean) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, Boolean, String, Timestamp, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, Boolean, String, Timestamp, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
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
        return ApplicationUser.APPLICATION_USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ApplicationUser.APPLICATION_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ApplicationUser.APPLICATION_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return ApplicationUser.APPLICATION_USER.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ApplicationUser.APPLICATION_USER.META_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ApplicationUser.APPLICATION_USER.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return ApplicationUser.APPLICATION_USER.IS_ADMIN;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMetaData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsAdmin();
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
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value5(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value6(String value) {
        setMetaData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value7(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord value8(Boolean value) {
        setIsAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUserRecord values(Long value1, String value2, String value3, String value4, Boolean value5, String value6, Timestamp value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
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
    public ApplicationUserRecord(Long id, String name, String email, String password, Boolean isActive, String metaData, Timestamp lastUpdate, Boolean isAdmin) {
        super(ApplicationUser.APPLICATION_USER);

        set(0, id);
        set(1, name);
        set(2, email);
        set(3, password);
        set(4, isActive);
        set(5, metaData);
        set(6, lastUpdate);
        set(7, isAdmin);
    }
}
