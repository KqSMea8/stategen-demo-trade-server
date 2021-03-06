/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.TopicUp;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

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
public interface TopicUpDao {

	/**
    <pre>
    &#64;ApiParam() String upId,
    &#64;ApiParam() String objectId,
    &#64;ApiParam() String authorId
    ,&#64;ApiParam(hidden = true) TopicUp topicUp
    
    </pre>
	 * 
	 * sql:insert into topic_up ( create_time , update_time , delete_flag , up_id , object_id , author_id ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?)
	 */
	public TopicUp insert(TopicUp topicUp) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("upId") String upId
    
    </pre>
	 * 
	 * sql:UPDATE topic_up SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and up_id = ?
	 */
	public String delete(String upId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String objectId,
    &#64;ApiParam() String authorId,
    &#64;ApiParam() String upId
    ,&#64;ApiParam(hidden = true) TopicUp topicUp
    
    </pre>
	 * 
	 * sql:UPDATE topic_up SET update_time= CURRENT_TIMESTAMP(6) , object_id = ? , author_id = ? where delete_flag = 0 and up_id = ?
	 */
	public TopicUp update(TopicUp topicUp) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("upId") String upId
    
    </pre>
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and a.up_id = ?
	 */
	public TopicUp getTopicUpByUpId(String upId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String upId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="upIds") ArrayList&lt;String&gt; upIds,
    &#64;ApiParam() String objectId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="objectIds") ArrayList&lt;String&gt; objectIds,
    &#64;ApiParam() String authorId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="authorIds") ArrayList&lt;String&gt; authorIds,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax
    ,&#64;ApiParam(hidden = true) TopicUp topicUp
    ,Pagination pagination
    </pre>
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and a.up_id=? and a.up_id in ( ? ) and a.object_id=? and a.object_id in ( ? ) and a.author_id=? and a.author_id in ( ? ) and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.update_time desc, a.create_time desc
	 */
	public PageList<TopicUp> getTopicUpPageList(TopicUp topicUp, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("upId")&#64;RequestParam(required =false,name="upIds") ArrayList&lt;String&gt; upIds
    
    </pre>
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and 1=0 and a.up_id in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<TopicUp> getTopicUpsByUpIds(java.util.List<String> upIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("upId")&#64;RequestParam(required =false,name="upIds") ArrayList&lt;String&gt; upIds
    
    </pre>
	 * 
	 * sql:UPDATE topic_up SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and up_id in ( ? )
	 */
	public java.util.List<String> deleteByUpIds(java.util.List<String> upIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("objectId")&#64;RequestParam(required =false,name="objectIds") ArrayList&lt;String&gt; objectIds,
    &#64;ApiParam("authorId") String authorId
    
    </pre>
	 * 
	 * sql:SELECT tu.object_id, COUNT(*) AS upCount FROM topic_up tu LEFT JOIN topic_reply tr ON tr.reply_id = tu.object_id WHERE tu.delete_flag=0 and tr.delete_flag=0 and tu.object_id in ( ? ) and 1=0 and tu.author_id =? GROUP BY tu.object_id
	 */
	public List<TopicUp> getTopicUpsGroupCountByTopicIds(java.util.List<String> objectIds, String authorId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("objectId") String objectId,
    &#64;ApiParam("authorId") String authorId
    
    </pre>
	 * 
	 * sql:select a.up_id, a.object_id, a.author_id, a.create_time, a.update_time, a.delete_flag from topic_up a where a.delete_flag = 0 and a.object_id=? and a.author_id=?
	 */
	public List<TopicUp> getTopicUpByObjectIdAndAuthorId(String objectId, String authorId) throws DataAccessException;
	

}



