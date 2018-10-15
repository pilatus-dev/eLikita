/*
 * This file is generated by jOOQ.
*/
package schemas.referential.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schemas.referential.Keys;
import schemas.referential.Referential;
import schemas.referential.tables.records.REventTypeRecord;


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
public class REventType extends TableImpl<REventTypeRecord> {

    private static final long serialVersionUID = 1478567425;

    /**
     * The reference instance of <code>referential.r_event_type</code>
     */
    public static final REventType R_EVENT_TYPE = new REventType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<REventTypeRecord> getRecordType() {
        return REventTypeRecord.class;
    }

    /**
     * The column <code>referential.r_event_type.id</code>.
     */
    public final TableField<REventTypeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('referential.r_event_type_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>referential.r_event_type.event_type</code>.
     */
    public final TableField<REventTypeRecord, String> EVENT_TYPE = createField("event_type", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>referential.r_event_type</code> table reference
     */
    public REventType() {
        this("r_event_type", null);
    }

    /**
     * Create an aliased <code>referential.r_event_type</code> table reference
     */
    public REventType(String alias) {
        this(alias, R_EVENT_TYPE);
    }

    private REventType(String alias, Table<REventTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private REventType(String alias, Table<REventTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Referential.REFERENTIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<REventTypeRecord, Long> getIdentity() {
        return Keys.IDENTITY_R_EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<REventTypeRecord> getPrimaryKey() {
        return Keys.EVENT_TYPE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<REventTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<REventTypeRecord>>asList(Keys.EVENT_TYPE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public REventType as(String alias) {
        return new REventType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public REventType rename(String name) {
        return new REventType(name, null);
    }
}
