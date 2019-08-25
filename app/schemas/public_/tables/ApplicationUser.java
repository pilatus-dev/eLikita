/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schemas.public_.Keys;
import schemas.public_.Public;
import schemas.public_.tables.records.ApplicationUserRecord;


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
public class ApplicationUser extends TableImpl<ApplicationUserRecord> {

    private static final long serialVersionUID = 1593620096;

    /**
     * The reference instance of <code>public.application_user</code>
     */
    public static final ApplicationUser APPLICATION_USER = new ApplicationUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationUserRecord> getRecordType() {
        return ApplicationUserRecord.class;
    }

    /**
     * The column <code>public.application_user.id</code>.
     */
    public final TableField<ApplicationUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.application_user.email</code>.
     */
    public final TableField<ApplicationUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.application_user.password_</code>.
     */
    public final TableField<ApplicationUserRecord, String> PASSWORD_ = createField("password_", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>public.application_user.is_active</code>.
     */
    public final TableField<ApplicationUserRecord, Boolean> IS_ACTIVE = createField("is_active", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.application_user.meta_data</code>.
     */
    public final TableField<ApplicationUserRecord, String> META_DATA = createField("meta_data", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>public.application_user.last_update</code>.
     */
    public final TableField<ApplicationUserRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.application_user.is_admin</code>.
     */
    public final TableField<ApplicationUserRecord, Boolean> IS_ADMIN = createField("is_admin", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.application_user.patient_fk</code>.
     */
    public final TableField<ApplicationUserRecord, Long> PATIENT_FK = createField("patient_fk", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.application_user.name_</code>.
     */
    public final TableField<ApplicationUserRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>public.application_user</code> table reference
     */
    public ApplicationUser() {
        this("application_user", null);
    }

    /**
     * Create an aliased <code>public.application_user</code> table reference
     */
    public ApplicationUser(String alias) {
        this(alias, APPLICATION_USER);
    }

    private ApplicationUser(String alias, Table<ApplicationUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicationUser(String alias, Table<ApplicationUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationUserRecord> getPrimaryKey() {
        return Keys.APPLICATION_USER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationUserRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationUserRecord>>asList(Keys.APPLICATION_USER_PK, Keys.APPLICATION_USER_UQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationUser as(String alias) {
        return new ApplicationUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicationUser rename(String name) {
        return new ApplicationUser(name, null);
    }
}