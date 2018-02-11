/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.public_.tables.Note;
import schemas.public_.tables.records.NoteRecord;


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
public class NoteDao extends DAOImpl<NoteRecord, schemas.public_.tables.pojos.Note, Long> {

    /**
     * Create a new NoteDao without any configuration
     */
    public NoteDao() {
        super(Note.NOTE, schemas.public_.tables.pojos.Note.class);
    }

    /**
     * Create a new NoteDao with an attached configuration
     */
    public NoteDao(Configuration configuration) {
        super(Note.NOTE, schemas.public_.tables.pojos.Note.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.public_.tables.pojos.Note object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchById(Long... values) {
        return fetch(Note.NOTE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.public_.tables.pojos.Note fetchOneById(Long value) {
        return fetchOne(Note.NOTE.ID, value);
    }

    /**
     * Fetch records that have <code>batch IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchByBatch(String... values) {
        return fetch(Note.NOTE.BATCH, values);
    }

    /**
     * Fetch records that have <code>course IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchByCourse(String... values) {
        return fetch(Note.NOTE.COURSE, values);
    }

    /**
     * Fetch records that have <code>attachment IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchByAttachment(String... values) {
        return fetch(Note.NOTE.ATTACHMENT, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchByDescription(Long... values) {
        return fetch(Note.NOTE.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchByTitle(Long... values) {
        return fetch(Note.NOTE.TITLE, values);
    }

    /**
     * Fetch records that have <code>subject IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Note> fetchBySubject(String... values) {
        return fetch(Note.NOTE.SUBJECT, values);
    }
}