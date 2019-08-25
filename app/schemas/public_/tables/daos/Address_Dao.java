/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.public_.tables.Address_;
import schemas.public_.tables.records.Address_Record;


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
public class Address_Dao extends DAOImpl<Address_Record, schemas.public_.tables.pojos.Address_, Long> {

    /**
     * Create a new Address_Dao without any configuration
     */
    public Address_Dao() {
        super(Address_.ADDRESS_, schemas.public_.tables.pojos.Address_.class);
    }

    /**
     * Create a new Address_Dao with an attached configuration
     */
    public Address_Dao(Configuration configuration) {
        super(Address_.ADDRESS_, schemas.public_.tables.pojos.Address_.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.public_.tables.pojos.Address_ object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchById(Long... values) {
        return fetch(Address_.ADDRESS_.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.public_.tables.pojos.Address_ fetchOneById(Long value) {
        return fetchOne(Address_.ADDRESS_.ID, value);
    }

    /**
     * Fetch records that have <code>line_1 IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchByLine_1(String... values) {
        return fetch(Address_.ADDRESS_.LINE_1, values);
    }

    /**
     * Fetch records that have <code>line_2 IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchByLine_2(String... values) {
        return fetch(Address_.ADDRESS_.LINE_2, values);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchByCity(String... values) {
        return fetch(Address_.ADDRESS_.CITY, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchByState(String... values) {
        return fetch(Address_.ADDRESS_.STATE, values);
    }

    /**
     * Fetch records that have <code>country_fk IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchByCountryFk(Long... values) {
        return fetch(Address_.ADDRESS_.COUNTRY_FK, values);
    }

    /**
     * Fetch records that have <code>other_detail IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Address_> fetchByOtherDetail(String... values) {
        return fetch(Address_.ADDRESS_.OTHER_DETAIL, values);
    }
}