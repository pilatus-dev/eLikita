/*
 * This file is generated by jOOQ.
*/
package schemas.administrator.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import schemas.administrator.tables.LogInfo;
import schemas.administrator.tables.records.LogInfoRecord;


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
public class LogInfoDao extends DAOImpl<LogInfoRecord, schemas.administrator.tables.pojos.LogInfo, Long> {

    /**
     * Create a new LogInfoDao without any configuration
     */
    public LogInfoDao() {
        super(LogInfo.LOG_INFO, schemas.administrator.tables.pojos.LogInfo.class);
    }

    /**
     * Create a new LogInfoDao with an attached configuration
     */
    public LogInfoDao(Configuration configuration) {
        super(LogInfo.LOG_INFO, schemas.administrator.tables.pojos.LogInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(schemas.administrator.tables.pojos.LogInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.LogInfo> fetchById(Long... values) {
        return fetch(LogInfo.LOG_INFO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public schemas.administrator.tables.pojos.LogInfo fetchOneById(Long value) {
        return fetchOne(LogInfo.LOG_INFO.ID, value);
    }

    /**
     * Fetch records that have <code>log_name IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.LogInfo> fetchByLogName(String... values) {
        return fetch(LogInfo.LOG_INFO.LOG_NAME, values);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.LogInfo> fetchByCode(String... values) {
        return fetch(LogInfo.LOG_INFO.CODE, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<schemas.administrator.tables.pojos.LogInfo> fetchByDescription(String... values) {
        return fetch(LogInfo.LOG_INFO.DESCRIPTION, values);
    }
}
