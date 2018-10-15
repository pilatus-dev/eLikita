/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.public_.tables.Batch;
import schemas.public_.tables.records.BatchRecord;


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
public class BatchDao extends DAOImpl<BatchRecord, schemas.public_.tables.pojos.Batch, Long> {

    /**
     * Create a new BatchDao without any configuration
     */
    public BatchDao() {
        super(Batch.BATCH, schemas.public_.tables.pojos.Batch.class);
    }

    /**
     * Create a new BatchDao with an attached configuration
     */
    public BatchDao(Configuration configuration) {
        super(Batch.BATCH, schemas.public_.tables.pojos.Batch.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.public_.tables.pojos.Batch object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>batch_name IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchByBatchName(String... values) {
        return fetch(Batch.BATCH.BATCH_NAME, values);
    }

    /**
     * Fetch records that have <code>end_date IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchByEndDate(Timestamp... values) {
        return fetch(Batch.BATCH.END_DATE, values);
    }

    /**
     * Fetch records that have <code>max_student IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchByMaxStudent(Long... values) {
        return fetch(Batch.BATCH.MAX_STUDENT, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchByStartDate(Timestamp... values) {
        return fetch(Batch.BATCH.START_DATE, values);
    }

    /**
     * Fetch records that have <code>course_fk IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchByCourseFk(Long... values) {
        return fetch(Batch.BATCH.COURSE_FK, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchById(Long... values) {
        return fetch(Batch.BATCH.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.public_.tables.pojos.Batch fetchOneById(Long value) {
        return fetchOne(Batch.BATCH.ID, value);
    }

    /**
     * Fetch records that have <code>course_id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.Batch> fetchByCourseId(Long... values) {
        return fetch(Batch.BATCH.COURSE_ID, values);
    }
}
