/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.public_.tables.ApplicationDetail;
import schemas.public_.tables.records.ApplicationDetailRecord;


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
public class ApplicationDetailDao extends DAOImpl<ApplicationDetailRecord, schemas.public_.tables.pojos.ApplicationDetail, Long> {

    /**
     * Create a new ApplicationDetailDao without any configuration
     */
    public ApplicationDetailDao() {
        super(ApplicationDetail.APPLICATION_DETAIL, schemas.public_.tables.pojos.ApplicationDetail.class);
    }

    /**
     * Create a new ApplicationDetailDao with an attached configuration
     */
    public ApplicationDetailDao(Configuration configuration) {
        super(ApplicationDetail.APPLICATION_DETAIL, schemas.public_.tables.pojos.ApplicationDetail.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.public_.tables.pojos.ApplicationDetail object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>admission_officer IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByAdmissionOfficer(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.ADMISSION_OFFICER, values);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByCode(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.CODE, values);
    }

    /**
     * Fetch a unique record that has <code>code = value</code>
     */
    public schemas.public_.tables.pojos.ApplicationDetail fetchOneByCode(String value) {
        return fetchOne(ApplicationDetail.APPLICATION_DETAIL.CODE, value);
    }

    /**
     * Fetch records that have <code>course_fk IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByCourseFk(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.COURSE_FK, values);
    }

    /**
     * Fetch records that have <code>faculty IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByFaculty(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.FACULTY, values);
    }

    /**
     * Fetch records that have <code>finish_date IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByFinishDate(Timestamp... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.FINISH_DATE, values);
    }

    /**
     * Fetch records that have <code>location_ IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByLocation_(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.LOCATION_, values);
    }

    /**
     * Fetch records that have <code>mode_of_attendance IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByModeOfAttendance(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.MODE_OF_ATTENDANCE, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByStartDate(Timestamp... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.START_DATE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByStatus(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.STATUS, values);
    }

    /**
     * Fetch records that have <code>batch_fk IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByBatchFk(Long... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.BATCH_FK, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchById(Long... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.public_.tables.pojos.ApplicationDetail fetchOneById(Long value) {
        return fetchOne(ApplicationDetail.APPLICATION_DETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>academic_year IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByAcademicYear(String... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.ACADEMIC_YEAR, values);
    }

    /**
     * Fetch records that have <code>campus_fk IN (values)</code>
     */
    public List<schemas.public_.tables.pojos.ApplicationDetail> fetchByCampusFk(Long... values) {
        return fetch(ApplicationDetail.APPLICATION_DETAIL.CAMPUS_FK, values);
    }
}
