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
import schemas.public_.tables.records.SyllabusRecord;


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
public class Syllabus extends TableImpl<SyllabusRecord> {

    private static final long serialVersionUID = 654787788;

    /**
     * The reference instance of <code>public.syllabus</code>
     */
    public static final Syllabus SYLLABUS = new Syllabus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SyllabusRecord> getRecordType() {
        return SyllabusRecord.class;
    }

    /**
     * The column <code>public.syllabus.id</code>.
     */
    public final TableField<SyllabusRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.syllabus.description</code>.
     */
    public final TableField<SyllabusRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>public.syllabus</code> table reference
     */
    public Syllabus() {
        this("syllabus", null);
    }

    /**
     * Create an aliased <code>public.syllabus</code> table reference
     */
    public Syllabus(String alias) {
        this(alias, SYLLABUS);
    }

    private Syllabus(String alias, Table<SyllabusRecord> aliased) {
        this(alias, aliased, null);
    }

    private Syllabus(String alias, Table<SyllabusRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SyllabusRecord> getPrimaryKey() {
        return Keys.SYLLABUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SyllabusRecord>> getKeys() {
        return Arrays.<UniqueKey<SyllabusRecord>>asList(Keys.SYLLABUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syllabus as(String alias) {
        return new Syllabus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syllabus rename(String name) {
        return new Syllabus(name, null);
    }
}