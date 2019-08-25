/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.public_.tables.RoUsers;
import schemas.public_.tables.records.RoUsersRecord;


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
public class RoUsersDao extends DAOImpl<RoUsersRecord, schemas.public_.tables.pojos.RoUsers, Long> {

    /**
     * Create a new RoUsersDao without any configuration
     */
    public RoUsersDao() {
        super(RoUsers.RO_USERS, schemas.public_.tables.pojos.RoUsers.class);
    }

    /**
     * Create a new RoUsersDao with an attached configuration
     */
    public RoUsersDao(Configuration configuration) {
        super(RoUsers.RO_USERS, schemas.public_.tables.pojos.RoUsers.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.public_.tables.pojos.RoUsers object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchById(Long... values) {
        return fetch(RoUsers.RO_USERS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.public_.tables.pojos.RoUsers fetchOneById(Long value) {
        return fetchOne(RoUsers.RO_USERS.ID, value);
    }

    /**
     * Fetch records that have <code>user IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByUser(String... values) {
        return fetch(RoUsers.RO_USERS.USER, values);
    }

    /**
     * Fetch records that have <code>user_type IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByUserType(String... values) {
        return fetch(RoUsers.RO_USERS.USER_TYPE, values);
    }

    /**
     * Fetch records that have <code>comptable IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByComptable(String... values) {
        return fetch(RoUsers.RO_USERS.COMPTABLE, values);
    }

    /**
     * Fetch records that have <code>service IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByService(String... values) {
        return fetch(RoUsers.RO_USERS.SERVICE, values);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByUserName(String... values) {
        return fetch(RoUsers.RO_USERS.USER_NAME, values);
    }

    /**
     * Fetch records that have <code>date_created IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByDateCreated(Timestamp... values) {
        return fetch(RoUsers.RO_USERS.DATE_CREATED, values);
    }

    /**
     * Fetch records that have <code>disable_date IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByDisableDate(Timestamp... values) {
        return fetch(RoUsers.RO_USERS.DISABLE_DATE, values);
    }

    /**
     * Fetch records that have <code>disabled IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByDisabled(Boolean... values) {
        return fetch(RoUsers.RO_USERS.DISABLED, values);
    }

    /**
     * Fetch records that have <code>granted_process IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByGrantedProcess(String... values) {
        return fetch(RoUsers.RO_USERS.GRANTED_PROCESS, values);
    }

    /**
     * Fetch records that have <code>granted_numbering IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.RoUsers> fetchByGrantedNumbering(String... values) {
        return fetch(RoUsers.RO_USERS.GRANTED_NUMBERING, values);
    }
}