/*
 * This file is generated by jOOQ.
*/
package schemas.administrator.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.administrator.tables.ContactPersonStudent;
import schemas.administrator.tables.records.ContactPersonStudentRecord;


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
public class ContactPersonStudentDao extends DAOImpl<ContactPersonStudentRecord, schemas.administrator.tables.pojos.ContactPersonStudent, Long> {

    /**
     * Create a new ContactPersonStudentDao without any configuration
     */
    public ContactPersonStudentDao() {
        super(ContactPersonStudent.CONTACT_PERSON_STUDENT, schemas.administrator.tables.pojos.ContactPersonStudent.class);
    }

    /**
     * Create a new ContactPersonStudentDao with an attached configuration
     */
    public ContactPersonStudentDao(Configuration configuration) {
        super(ContactPersonStudent.CONTACT_PERSON_STUDENT, schemas.administrator.tables.pojos.ContactPersonStudent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.administrator.tables.pojos.ContactPersonStudent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.ContactPersonStudent> fetchById(Long... values) {
        return fetch(ContactPersonStudent.CONTACT_PERSON_STUDENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.administrator.tables.pojos.ContactPersonStudent fetchOneById(Long value) {
        return fetchOne(ContactPersonStudent.CONTACT_PERSON_STUDENT.ID, value);
    }

    /**
     * Fetch records that have <code>contact_person_fk IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.ContactPersonStudent> fetchByContactPersonFk(Long... values) {
        return fetch(ContactPersonStudent.CONTACT_PERSON_STUDENT.CONTACT_PERSON_FK, values);
    }

    /**
     * Fetch records that have <code>student_fk IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.ContactPersonStudent> fetchByStudentFk(String... values) {
        return fetch(ContactPersonStudent.CONTACT_PERSON_STUDENT.STUDENT_FK, values);
    }

    /**
     * Fetch records that have <code>contact_person_type_fk IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.ContactPersonStudent> fetchByContactPersonTypeFk(Long... values) {
        return fetch(ContactPersonStudent.CONTACT_PERSON_STUDENT.CONTACT_PERSON_TYPE_FK, values);
    }
}