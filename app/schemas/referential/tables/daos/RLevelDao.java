/*
 * This file is generated by jOOQ.
*/
package schemas.referential.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.referential.tables.RLevel;
import schemas.referential.tables.records.RLevelRecord;


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
public class RLevelDao extends DAOImpl<RLevelRecord, schemas.referential.tables.pojos.RLevel, Long> {

    /**
     * Create a new RLevelDao without any configuration
     */
    public RLevelDao() {
        super(RLevel.R_LEVEL, schemas.referential.tables.pojos.RLevel.class);
    }

    /**
     * Create a new RLevelDao with an attached configuration
     */
    public RLevelDao(Configuration configuration) {
        super(RLevel.R_LEVEL, schemas.referential.tables.pojos.RLevel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.referential.tables.pojos.RLevel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.referential.tables.pojos.RLevel> fetchById(Long... values) {
        return fetch(RLevel.R_LEVEL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.referential.tables.pojos.RLevel fetchOneById(Long value) {
        return fetchOne(RLevel.R_LEVEL.ID, value);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<schemas.referential.tables.pojos.RLevel> fetchByLevel(String... values) {
        return fetch(RLevel.R_LEVEL.LEVEL, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<schemas.referential.tables.pojos.RLevel> fetchByDescription(String... values) {
        return fetch(RLevel.R_LEVEL.DESCRIPTION, values);
    }
}