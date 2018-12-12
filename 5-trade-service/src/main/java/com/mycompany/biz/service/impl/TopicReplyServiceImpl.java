/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.stategen.framework.lite.PageList;
import org.stategen.framework.util.CollectionUtil;
import org.stategen.framework.util.StringUtil;

import com.mycompany.biz.dao.TopicReplyDao;
import com.mycompany.biz.domain.TopicReply;
import com.mycompany.biz.domain.TopicUp;
import com.mycompany.biz.service.TopicReplyService;
import com.mycompany.biz.service.TopicUpService;
import com.mycompany.biz.service.UserService;

/**
 * TopicReplyServiceImpl
 * <pre>
 * database table: topic_reply
 * database table comments: TopicReply
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public class TopicReplyServiceImpl implements TopicReplyService {

    @Resource(name = "topicReplyDao")
    TopicReplyDao topicReplyDao;

    @Resource
    TopicUpService topicUpService;

    @Resource
    UserService userService;

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#insert
     * @see com.mycompany.biz.service.TopicReplyService#insert
     */
    @Override
    public TopicReply insert(TopicReply topicReply) {
        return topicReplyDao.insert(topicReply);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#delete
     * @see com.mycompany.biz.service.TopicReplyService#delete
     */
    @Override
    public String delete(String replyId) {
        return topicReplyDao.delete(replyId);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#update
     * @see com.mycompany.biz.service.TopicReplyService#update
     */
    @Override
    public TopicReply update(TopicReply topicReply) {
        return topicReplyDao.update(topicReply);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#getTopicReplyByReplyId
     * @see com.mycompany.biz.service.TopicReplyService#getTopicReplyByReplyId
     */
    @Override
    public TopicReply getTopicReplyByReplyId(String replyId) {
        return topicReplyDao.getTopicReplyByReplyId(replyId);
    }

    @Override
    public void assignRepliesExtraProperties(String authorId, List<TopicReply> replies) {
        userService.setTopicsAuthor(replies);
        List<String> replyIds = CollectionUtil.toList(replies, TopicReply::getReplyId);
        List<TopicUp> topicUpCounts = this.topicUpService.getTopicUpsGroupCountByTopicIds(replyIds, null);
        Map<String, TopicUp> upCountMap = CollectionUtil.toMap(topicUpCounts, TopicUp::getObjectId);
        CollectionUtil.setFeildToFieldByMap(replies, upCountMap, TopicReply::getReplyId, TopicUp::getUpCount, TopicReply::setUpCount);
        if (StringUtil.isNotEmpty(authorId)) {
            topicUpCounts = this.topicUpService.getTopicUpsGroupCountByTopicIds(replyIds, authorId);
            upCountMap = CollectionUtil.toMap(topicUpCounts, TopicUp::getObjectId);
            for (TopicReply tr : replies) {
                tr.setIsUped(upCountMap.containsKey(tr.getReplyId()));
            }
        }
    }

    @Override
    public TopicReply replyUp(String replyId, String authorId) {
        List<TopicUp> topicUps = this.topicUpService.getTopicUpByObjectIdAndAuthorId(replyId, authorId);
        if (CollectionUtil.isNotEmpty(topicUps)) {
            topicUpService.deleteByUpIds(CollectionUtil.toList(topicUps, TopicUp::getUpId));
        } else {
            TopicUp topicUp = new TopicUp();
            topicUp.setObjectId(replyId);
            topicUp.setAuthorId(authorId);
            this.topicUpService.insert(topicUp);
        }
        TopicReply topicReply = this.getTopicReplyByReplyId(replyId);
        if (topicReply != null) {
            this.assignRepliesExtraProperties(authorId, Arrays.asList(topicReply));
        }
        return topicReply;
    }

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#getTopicReplysByReplyIds
     * @see com.mycompany.biz.service.TopicReplyService#getTopicReplysByReplyIds
     */
    @Override
    public List<TopicReply> getTopicReplysByReplyIds(java.util.List<String> replyIds) {
        return topicReplyDao.getTopicReplysByReplyIds(replyIds);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#deleteByReplyIds
     * @see com.mycompany.biz.service.TopicReplyService#deleteByReplyIds
     */
    @Override
    public java.util.List<String> deleteByReplyIds(java.util.List<String> replyIds) {
        return topicReplyDao.deleteByReplyIds(replyIds);
    }

    /*** 保存topicReply,有id时更新，没有id时插入,并带回新的id，返回 topicReply*/
    @Override
    public TopicReply saveTopicReply(TopicReply topicReply) {
        if (topicReply != null) {
            java.lang.String replyId = topicReply.getReplyId();
            if (StringUtil.isBlank(replyId)) {
                insert(topicReply);
            } else {
                update(topicReply);
            }
        }
        return topicReply;
    }

    /*** 批量保存topicReplys,有id时更新，没有id时插入,并带回新的id，返回 topicReplys*/
    @Override
    public List<TopicReply> saveTopicReplys(List<TopicReply> topicReplys) {
        for (TopicReply topicReply : topicReplys) {
            this.saveTopicReply(topicReply);
        }
        return topicReplys;
    }

    /**
     * 
     * @see com.mycompany.biz.dao.TopicReplyDao#getTopicReplyPageList
     * @see com.mycompany.biz.service.TopicReplyService#getTopicReplyPageList
     */
    @Override
    public PageList<TopicReply> getTopicReplyPageList(TopicReply topicReply, String authorId, int pageSize, int pageNum) {
        PageList<TopicReply> topicReplyList = topicReplyDao.getTopicReplyPageList(topicReply, pageSize, pageNum);
        List<TopicReply> replies = topicReplyList.getItems();
        assignRepliesExtraProperties(authorId, replies);
        return topicReplyList;
    }
}
