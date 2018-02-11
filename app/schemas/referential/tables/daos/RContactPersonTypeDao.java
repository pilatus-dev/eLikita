/*
 * This file is generated by jOOQ.
*/
package schemas.referential.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.referential.tables.RContactPersonType;
import schemas.referential.tables.records.RContactPersonTypeRecord;


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
public class RContactPersonTypeDao extends DAOImpl<RContactPersonTypeRecord, schemas.referential.tables.pojos.RContactPersonType, Long> {

    /**
     * Create a new RContactPersonTypeDao without any configuration
     */
    public RContactPersonTypeDao() {
        super(RContactPersonType.R_CONTACT_PERSON_TYPE, schemas.referential.tables.pojos.RContactPersonType.class);
    }

    /**
     * Create a new RContactPersonTypeDao with an attached configuration
     */
    public RContactPersonTypeDao(Configuration configuration) {
        super(RContactPersonType.R_CONTACT_PERSON_TYPE, schemas.referential.tables.pojos.RContactPersonType.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.referential.tables.pojos.RContactPersonType object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.referential.tables.pojos.RContactPersonType> fetchById(Long... values) {
        return fetch(RContactPersonType.R_CONTACT_PERSON_TYPE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.referential.tables.pojos.RContactPersonType fetchOneById(Long value) {
        return fetchOne(RContactPersonType.R_CONTACT_PERSON_TYPE.ID, value);
    }

    /**
     * Fetch records that have <code>type_name IN (values)</code>
     */
    public List<schemas.referential.tables.pojos.RContactPersonType> fetchByTypeName(String... values) {
        return fetch(RContactPersonType.R_CONTACT_PERSON_TYPE.TYPE_NAME, values);
    }
}