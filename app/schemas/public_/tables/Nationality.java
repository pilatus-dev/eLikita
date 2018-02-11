/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables;


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
import schemas.public_.tables.records.NationalityRecord;


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
public class Nationality extends TableImpl<NationalityRecord> {

    private static final long serialVersionUID = -1186731091;

    /**
     * The reference instance of <code>public.nationality</code>
     */
    public static final Nationality NATIONALITY = new Nationality();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NationalityRecord> getRecordType() {
        return NationalityRecord.class;
    }

    /**
     * The column <code>public.nationality.id</code>.
     */
    public final TableField<NationalityRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.nationality.country_birth</code>.
     */
    public final TableField<NationalityRecord, String> COUNTRY_BIRTH = createField("country_birth", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.nationality.nationality</code>.
     */
    public final TableField<NationalityRecord, String> NATIONALITY_ = createField("nationality", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.nationality.second_nationality</code>.
     */
    public final TableField<NationalityRecord, String> SECOND_NATIONALITY = createField("second_nationality", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.nationality.student_fk</code>.
     */
    public final TableField<NationalityRecord, Long> STUDENT_FK = createField("student_fk", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.nationality</code> table reference
     */
    public Nationality() {
        this("nationality", null);
    }

    /**
     * Create an aliased <code>public.nationality</code> table reference
     */
    public Nationality(String alias) {
        this(alias, NATIONALITY);
    }

    private Nationality(String alias, Table<NationalityRecord> aliased) {
        this(alias, aliased, null);
    }

    private Nationality(String alias, Table<NationalityRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<NationalityRecord> getPrimaryKey() {
        return Keys.NATIONALITY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NationalityRecord>> getKeys() {
        return Arrays.<UniqueKey<NationalityRecord>>asList(Keys.NATIONALITY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Nationality as(String alias) {
        return new Nationality(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Nationality rename(String name) {
        return new Nationality(name, null);
    }
}