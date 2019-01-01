/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.domain;

import java.text.SimpleDateFormat;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;

import org.stategen.framework.annotation.ChangeBy;
import org.stategen.framework.annotation.Editor;
import org.stategen.framework.annotation.ReferConfig;
import org.stategen.framework.lite.enums.EditorType;

import com.mycompany.biz.enums.TopicType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Topic
 * <pre>
 * database table: topic
 * database table comments: Topic
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅不可以修改dalgen生成的属生(field)类型 ,方法(Method)返回值类型和参数类型
 * 不建议使@Data,其hashCode有问题
 * </pre>
 */
@Getter
@Setter
public class Topic implements java.io.Serializable, IAuthored {

    private User author;

    private Long replyCount;

    private City city;

    private Province province;

    private static final long serialVersionUID = -5216457518046898601L;

    /***topicId   db_column: topic_id VARCHAR */
    @ApiModelProperty("topicId")
    @Id
    @Max(64)
    @Editor(EditorType.Hidden.class)
    private String topicId;

    /***authorId   db_column: author_id VARCHAR */
    @ApiModelProperty("authorId")
    @Max(64)
    private String authorId;

    /***topicType   db_column: topic_type VARCHAR */
    @ApiModelProperty("topicType")
    private TopicType topicType;

    /***content   db_column: content LONGVARCHAR */
    @ApiModelProperty("content")
    @Max(65535)
    @Editor(EditorType.Textarea.class)
    private String content;

    /***title   db_column: title VARCHAR */
    @ApiModelProperty("title")
    @Max(64)
    private String title;

    /***lastReplyAt   db_column: last_reply_at TIMESTAMP */
    @ApiModelProperty("lastReplyAt")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date lastReplyAt;

    /***good   db_column: good BIGINT */
    @ApiModelProperty("good")
    private Long good;

    /***top   db_column: top BIGINT */
    @ApiModelProperty("top")
    private Long top;

    /***visitCount   db_column: visit_count BIGINT */
    @ApiModelProperty("visitCount")
    private Long visitCount;

    /***testTimestamp   db_column: test_timestamp TIMESTAMP */
    @ApiModelProperty("testTimestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date testTimestamp;

    /***testDatetime   db_column: test_datetime TIMESTAMP */
    @ApiModelProperty("testDatetime")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date testDatetime;

    /***测式日期   db_column: test_date DATE */
    @ApiModelProperty("测式日期")
    @Temporal(TemporalType.DATE)
    private java.util.Date testDate;

    /***测试时间   db_column: test_time TIME */
    @ApiModelProperty("测试时间")
    @Temporal(TemporalType.TIME)
    private java.util.Date testTime;

    /***provinceId   db_column: province_id VARCHAR */
    @ApiModelProperty("provinceId")
    @Max(64)
    @ReferConfig()
    private String provinceId;

    /***cityId   db_column: city_id VARCHAR */
    @ApiModelProperty("cityId")
    @Max(64)
    @ReferConfig()
    @ChangeBy("provinceId")
    private String cityId;

    /***创建时间   db_column: create_time TIMESTAMP */
    @ApiModelProperty(value = "创建时间", hidden = true)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createTime;

    /***更新时间   db_column: update_time TIMESTAMP */
    @ApiModelProperty(value = "更新时间", hidden = true)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateTime;

    /***是否删除(0:正常，1删除)   db_column: delete_flag INTEGER */
    @ApiModelProperty(value = "是否删除(0:正常，1删除)", hidden = true)
    private Integer deleteFlag;

    /*----------------getter & setter ignore by lombok -------------------*/
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd H:m:ss.SSS");
        StringBuffer sb = new StringBuffer(1024);
        sb.append('{');
        sb.append("topicIds=").append(topicIds).append('\n');
        sb.append("authorIds=").append(authorIds).append('\n');
        sb.append("topicTypes=").append(topicTypes).append('\n');
        sb.append("contentLike=").append(contentLike).append('\n');
        sb.append("titleLike=").append(titleLike).append('\n');
        sb.append("lastReplyAtMin=").append(lastReplyAtMin != null ? df.format(lastReplyAtMin) : null).append('\n');
        sb.append("lastReplyAtMax=").append(lastReplyAtMax != null ? df.format(lastReplyAtMax) : null).append('\n');
        sb.append("goodMin=").append(goodMin).append('\n');
        sb.append("goodMax=").append(goodMax).append('\n');
        sb.append("topMin=").append(topMin).append('\n');
        sb.append("topMax=").append(topMax).append('\n');
        sb.append("visitCountMin=").append(visitCountMin).append('\n');
        sb.append("visitCountMax=").append(visitCountMax).append('\n');
        sb.append("testTimestampMin=").append(testTimestampMin != null ? df.format(testTimestampMin) : null).append('\n');
        sb.append("testTimestampMax=").append(testTimestampMax != null ? df.format(testTimestampMax) : null).append('\n');
        sb.append("testDatetimeMin=").append(testDatetimeMin != null ? df.format(testDatetimeMin) : null).append('\n');
        sb.append("testDatetimeMax=").append(testDatetimeMax != null ? df.format(testDatetimeMax) : null).append('\n');
        sb.append("testDateMin=").append(testDateMin != null ? df.format(testDateMin) : null).append('\n');
        sb.append("testDateMax=").append(testDateMax != null ? df.format(testDateMax) : null).append('\n');
        sb.append("testTimeMin=").append(testTimeMin != null ? df.format(testTimeMin) : null).append('\n');
        sb.append("testTimeMax=").append(testTimeMax != null ? df.format(testTimeMax) : null).append('\n');
        sb.append("provinceIds=").append(provinceIds).append('\n');
        sb.append("cityIds=").append(cityIds).append('\n');
        sb.append("createTimeMin=").append(createTimeMin != null ? df.format(createTimeMin) : null).append('\n');
        sb.append("createTimeMax=").append(createTimeMax != null ? df.format(createTimeMax) : null).append('\n');
        sb.append("updateTimeMin=").append(updateTimeMin != null ? df.format(updateTimeMin) : null).append('\n');
        sb.append("updateTimeMax=").append(updateTimeMax != null ? df.format(updateTimeMax) : null).append('\n');
        sb.append("topicId=").append(topicId).append('\n');
        sb.append("authorId=").append(authorId).append('\n');
        sb.append("topicType=").append(topicType).append('\n');
        sb.append("content=").append(content).append('\n');
        sb.append("title=").append(title).append('\n');
        sb.append("lastReplyAt=").append(lastReplyAt != null ? df.format(lastReplyAt) : null).append('\n');
        sb.append("good=").append(good).append('\n');
        sb.append("top=").append(top).append('\n');
        sb.append("visitCount=").append(visitCount).append('\n');
        sb.append("testTimestamp=").append(testTimestamp != null ? df.format(testTimestamp) : null).append('\n');
        sb.append("testDatetime=").append(testDatetime != null ? df.format(testDatetime) : null).append('\n');
        sb.append("testDate=").append(testDate != null ? df.format(testDate) : null).append('\n');
        sb.append("testTime=").append(testTime != null ? df.format(testTime) : null).append('\n');
        sb.append("provinceId=").append(provinceId).append('\n');
        sb.append("cityId=").append(cityId).append('\n');
        sb.append("createTime=").append(createTime != null ? df.format(createTime) : null).append('\n');
        sb.append("updateTime=").append(updateTime != null ? df.format(updateTime) : null).append('\n');
        sb.append("deleteFlag=").append(deleteFlag);
        sb.append('}');
        return sb.toString();
    }

    /*** topicIds in getTopicPageList */
    @ApiModelProperty("topicIds")
    private transient java.util.List<String> topicIds;

    /*** authorIds in getTopicPageList */
    @ApiModelProperty("authorIds")
    private transient java.util.List<String> authorIds;

    /*** topicTypes in getTopicPageList */
    @ApiModelProperty("topicTypes")
    private transient java.util.List<com.mycompany.biz.enums.TopicType> topicTypes;

    /*** contentLike in getTopicPageList */
    @ApiModelProperty("contentLike")
    private transient String contentLike;

    /*** titleLike in getTopicPageList */
    @ApiModelProperty("titleLike")
    private transient String titleLike;

    /*** lastReplyAtMin in getTopicPageList */
    @ApiModelProperty("lastReplyAtMin")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date lastReplyAtMin;

    /*** lastReplyAtMax in getTopicPageList */
    @ApiModelProperty("lastReplyAtMax")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date lastReplyAtMax;

    /*** goodMin in getTopicPageList */
    @ApiModelProperty("goodMin")
    private transient Long goodMin;

    /*** goodMax in getTopicPageList */
    @ApiModelProperty("goodMax")
    private transient Long goodMax;

    /*** topMin in getTopicPageList */
    @ApiModelProperty("topMin")
    private transient Long topMin;

    /*** topMax in getTopicPageList */
    @ApiModelProperty("topMax")
    private transient Long topMax;

    /*** visitCountMin in getTopicPageList */
    @ApiModelProperty("visitCountMin")
    private transient Long visitCountMin;

    /*** visitCountMax in getTopicPageList */
    @ApiModelProperty("visitCountMax")
    private transient Long visitCountMax;

    /*** testTimestampMin in getTopicPageList */
    @ApiModelProperty("testTimestampMin")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date testTimestampMin;

    /*** testTimestampMax in getTopicPageList */
    @ApiModelProperty("testTimestampMax")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date testTimestampMax;

    /*** testDatetimeMin in getTopicPageList */
    @ApiModelProperty("testDatetimeMin")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date testDatetimeMin;

    /*** testDatetimeMax in getTopicPageList */
    @ApiModelProperty("testDatetimeMax")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date testDatetimeMax;

    /*** 测式日期Min in getTopicPageList */
    @ApiModelProperty("测式日期Min")
    @Temporal(TemporalType.DATE)
    private transient java.util.Date testDateMin;

    /*** 测式日期Max in getTopicPageList */
    @ApiModelProperty("测式日期Max")
    @Temporal(TemporalType.DATE)
    private transient java.util.Date testDateMax;

    /*** 测试时间Min in getTopicPageList */
    @ApiModelProperty("测试时间Min")
    @Temporal(TemporalType.TIME)
    private transient java.util.Date testTimeMin;

    /*** 测试时间Max in getTopicPageList */
    @ApiModelProperty("测试时间Max")
    @Temporal(TemporalType.TIME)
    private transient java.util.Date testTimeMax;

    /*** provinceIds in getTopicPageList */
    @ApiModelProperty("provinceIds")
    @ReferConfig()
    private transient java.util.List<String> provinceIds;

    /*** cityIds in getTopicPageList */
    @ApiModelProperty("cityIds")
    @ReferConfig()
    private transient java.util.List<String> cityIds;

    /*** 创建时间Min in getTopicPageList */
    @ApiModelProperty("创建时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMin;

    /*** 创建时间Max in getTopicPageList */
    @ApiModelProperty("创建时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMax;

    /*** 更新时间Min in getTopicPageList */
    @ApiModelProperty("更新时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMin;

    /*** 更新时间Max in getTopicPageList */
    @ApiModelProperty("更新时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMax;
}
