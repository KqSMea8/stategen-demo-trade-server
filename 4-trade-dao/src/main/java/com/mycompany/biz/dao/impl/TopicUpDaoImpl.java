/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.stategen.framework.ibatis.util.PageQueryUtils;
import org.stategen.framework.lite.PageList;

import com.mycompany.biz.dao.TopicUpDao;
import com.mycompany.biz.domain.TopicUp;

/**
 * TopicUpDao
 * <pre>
 * database table: topic_up
 * database table comments: TopicUp
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public class TopicUpDaoImpl extends SqlMapClientDaoSupport implements TopicUpDao {

    /**
	 * 
	 * sql:insert into topic_up ( create_time , update_time , delete_flag , up_id , object_id , author_id ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?)
	 */
    public TopicUp insert(TopicUp topicUp) throws DataAccessException {
        if (topicUp == null) {
            throw new IllegalArgumentException("Can't insert a null data object into db.");
        }
        getSqlMapClientTemplate().insert("insert.TopicUp.trade", topicUp);
        return topicUp;
    }

    /**
	 * 
	 * sql:UPDATE topic_up SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and up_id = ?
	 */
    public String delete(String upId) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("upId", upId);
        getSqlMapClientTemplate().update("delete.TopicUp.trade", params);
        return upId;
    }

    /**
	 * 
	 * sql:UPDATE topic_up SET update_time= CURRENT_TIMESTAMP(6) , object_id = ? , author_id = ? where delete_flag = 0 and up_id = ?
	 */
    public TopicUp update(TopicUp topicUp) throws DataAccessException {
        if (topicUp == null) {
            throw new IllegalArgumentException("Can't update by a null data object.");
        }
        getSqlMapClientTemplate().update("update.TopicUp.trade", topicUp);
        return topicUp;
    }

    /**
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and a.up_id = ?
	 */
    public TopicUp getTopicUpByUpId(String upId) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("upId", upId);
        return (TopicUp) getSqlMapClientTemplate().queryForObject("getTopicUpByUpId.TopicUp.trade", params);
    }

    /**
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and a.up_id=? and a.up_id in ( ? ) and a.object_id=? and a.object_id in ( ? ) and a.author_id=? and a.author_id in ( ? ) and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1
	 */
    @SuppressWarnings("unchecked")
    public PageList<TopicUp> getTopicUpPageListByDefaultQuery(TopicUp topicUp, int pageSize, int pageNum) throws DataAccessException {
        return (PageList<TopicUp>) PageQueryUtils.pageQuery(getSqlMapClientTemplate(), "getTopicUpPageListByDefaultQuery.TopicUp.trade", topicUp, pageNum, pageSize);
    }

    /**
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and 1=0 and a.up_id in ( ? )
	 */
    @SuppressWarnings("unchecked")
    public List<TopicUp> getTopicUpsByUpIds(java.util.List<String> upIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("upIds", upIds);
        return (List<TopicUp>) getSqlMapClientTemplate().queryForList("getTopicUpsByUpIds.TopicUp.trade", params);
    }

    /**
	 * 
	 * sql:UPDATE topic_up SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and up_id in ( ? )
	 */
    public java.util.List<String> deleteByUpIds(java.util.List<String> upIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("upIds", upIds);
        getSqlMapClientTemplate().update("deleteByUpIds.TopicUp.trade", params);
        return upIds;
    }

    /**
	 * 
	 * sql:SELECT tu.object_id, COUNT(*) AS upCount FROM topic_up tu LEFT JOIN topic_reply tr ON tr.reply_id = tu.object_id WHERE tu.delete_flag=0 and tr.delete_flag=0 and tu.object_id in ( ? ) and 1=0 and tu.author_id =? GROUP BY tu.object_id
	 */
    @SuppressWarnings("unchecked")
    public List<TopicUp> getTopicUpsGroupCountByTopicIds(java.util.List<String> objectIds, String authorId) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(2);
        params.put("objectIds", objectIds);
        params.put("authorId", authorId);
        return (List<TopicUp>) getSqlMapClientTemplate().queryForList("getTopicUpsGroupCountByTopicIds.TopicUp.trade", params);
    }

    /**
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and a.object_id=? and a.author_id=?
	 */
    @SuppressWarnings("unchecked")
    public List<TopicUp> getTopicUpByObjectIdAndAuthorId(String objectId, String authorId) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(2);
        params.put("objectId", objectId);
        params.put("authorId", authorId);
        return (List<TopicUp>) getSqlMapClientTemplate().queryForList("getTopicUpByObjectIdAndAuthorId.TopicUp.trade", params);
    }
}