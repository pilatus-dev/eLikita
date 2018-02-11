/*
 * This file is generated by jOOQ.
*/
package schemas.referential.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schemas.referential.tables.RCategory;


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
public class RCategoryRecord extends UpdatableRecordImpl<RCategoryRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = -646825282;

    /**
     * Setter for <code>referential.r_category.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>referential.r_category.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>referential.r_category.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>referential.r_category.name</code>.
     */
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>referential.r_category.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>referential.r_category.description</code>.
     */
    @Size(max = 50)
    public String getDescription() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return RCategory.R_CATEGORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RCategory.R_CATEGORY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RCategory.R_CATEGORY.DESCRIPTION;
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCategoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCategoryRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCategoryRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCategoryRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RCategoryRecord
     */
    public RCategoryRecord() {
        super(RCategory.R_CATEGORY);
    }

    /**
     * Create a detached, initialised RCategoryRecord
     */
    public RCategoryRecord(Long id, String name, String description) {
        super(RCategory.R_CATEGORY);

        set(0, id);
        set(1, name);
        set(2, description);
    }
}