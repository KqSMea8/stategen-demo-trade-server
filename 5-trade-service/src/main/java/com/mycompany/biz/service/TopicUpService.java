/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.service;

import java.util.List;

import org.stategen.framework.lite.PageList;
import org.stategen.framework.util.AssignSerice;

import com.mycompany.biz.domain.TopicUp;

/**
 * TopicUpService
 * <pre>
 * database table: topic_up
 * database table comments: TopicUp
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public interface TopicUpService extends TopicUpServiceFacade, AssignSerice<TopicUp, String> {

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#insert
     */
    public TopicUp insert(TopicUp topicUp);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#delete
     */
    public String delete(String upId);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#update
     */
    public TopicUp update(TopicUp topicUp);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#getTopicUpByUpId
     */
    public TopicUp getTopicUpByUpId(String upId);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#getTopicUpsByUpIds
     */
    public List<TopicUp> getTopicUpsByUpIds(java.util.List<String> upIds);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#deleteByUpIds
     */
    public java.util.List<String> deleteByUpIds(java.util.List<String> upIds);

    /*** 保存topicUp,有id时更新，没有id时插入,并带回新的id，返回 topicUp*/
    public TopicUp saveTopicUp(TopicUp topicUp);

    /*** 批量保存topicUps,有id时更新，没有id时插入,并带回新的id，返回 topicUps*/
    public List<TopicUp> saveTopicUps(List<TopicUp> topicUps);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#getTopicUpsGroupCountByTopicIds
     */
    public List<TopicUp> getTopicUpsGroupCountByTopicIds(java.util.List<String> objectIds, String authorId);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#getTopicUpByObjectIdAndAuthorId
     */
    public List<TopicUp> getTopicUpByObjectIdAndAuthorId(String objectId, String authorId);

    /**
     * 
     * @see com.mycompany.biz.dao.TopicUpDao#getTopicUpPageList
     */
    public PageList<TopicUp> getTopicUpPageList(TopicUp topicUp, int pageSize, int pageNum);
}
