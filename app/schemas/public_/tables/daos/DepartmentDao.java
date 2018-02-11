/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.public_.tables.Department;
import schemas.public_.tables.records.DepartmentRecord;


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
public class DepartmentDao extends DAOImpl<DepartmentRecord, schemas.public_.tables.pojos.Department, Long> {

    /**
     * Create a new DepartmentDao without any configuration
     */
    public DepartmentDao() {
        super(Department.DEPARTMENT, schemas.public_.tables.pojos.Department.class);
    }

    /**
     * Create a new DepartmentDao with an attached configuration
     */
    public DepartmentDao(Configuration configuration) {
        super(Department.DEPARTMENT, schemas.public_.tables.pojos.Department.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.public_.tables.pojos.Department object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Department> fetchById(Long... values) {
        return fetch(Department.DEPARTMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.public_.tables.pojos.Department fetchOneById(Long value) {
        return fetchOne(Department.DEPARTMENT.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Department> fetchByCode(String... values) {
        return fetch(Department.DEPARTMENT.CODE, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Department> fetchByDescription(String... values) {
        return fetch(Department.DEPARTMENT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Department> fetchByName(String... values) {
        return fetch(Department.DEPARTMENT.NAME, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Department> fetchByStatus(String... values) {
        return fetch(Department.DEPARTMENT.STATUS, values);
    }
}