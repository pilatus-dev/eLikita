/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schemas.public_.Keys;
import schemas.public_.Public;
import schemas.public_.tables.records.ApplicationRecord;


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
public class Application extends TableImpl<ApplicationRecord> {

    private static final long serialVersionUID = 1729588153;

    /**
     * The reference instance of <code>public.application</code>
     */
    public static final Application APPLICATION = new Application();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationRecord> getRecordType() {
        return ApplicationRecord.class;
    }

    /**
     * The column <code>public.application.id</code>.
     */
    public final TableField<ApplicationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.application.course_fk</code>.
     */
    public final TableField<ApplicationRecord, Long> COURSE_FK = createField("course_fk", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.application.student_fk</code>.
     */
    public final TableField<ApplicationRecord, Long> STUDENT_FK = createField("student_fk", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.application</code> table reference
     */
    public Application() {
        this("application", null);
    }

    /**
     * Create an aliased <code>public.application</code> table reference
     */
    public Application(String alias) {
        this(alias, APPLICATION);
    }

    private Application(String alias, Table<ApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Application(String alias, Table<ApplicationRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ApplicationRecord> getPrimaryKey() {
        return Keys.APPLICATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationRecord>>asList(Keys.APPLICATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApplicationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApplicationRecord, ?>>asList(Keys.APPLICATION__FKRK3CWVBYTQ5JOFLCGGYWT626H, Keys.APPLICATION__FKCVV4YY9T46FTI1B0QVP70OD0H);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Application as(String alias) {
        return new Application(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Application rename(String name) {
        return new Application(name, null);
    }
}