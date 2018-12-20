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
import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * UserHoppy
 * <pre>
 * database table: user_hoppy
 * database table comments: UserHoppy
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅不可以修改dalgen生成的属生(field)类型 ,方法(Method)返回值类型和参数类型
 * 不建议使@Data,其hashCode有问题
 * </pre>
 */
@Getter
@Setter
public class UserHoppy implements java.io.Serializable {

    private static final long serialVersionUID = -5216457518046898601L;

    /***id   db_column: id INTEGER */
    @ApiModelProperty("id")
    @Id
    private Integer id;

    /***用户ID   db_column: user_id VARCHAR */
    @ApiModelProperty("用户ID")
    @Max(64)
    private String userId;

    /***hoppyId   db_column: hoppy_id INTEGER */
    @ApiModelProperty("hoppyId")
    private Integer hoppyId;

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
        sb.append("ids=").append(ids).append('\n');
        sb.append("userIds=").append(userIds).append('\n');
        sb.append("hoppyIds=").append(hoppyIds).append('\n');
        sb.append("createTimeMin=").append(createTimeMin != null ? df.format(createTimeMin) : null).append('\n');
        sb.append("createTimeMax=").append(createTimeMax != null ? df.format(createTimeMax) : null).append('\n');
        sb.append("updateTimeMin=").append(updateTimeMin != null ? df.format(updateTimeMin) : null).append('\n');
        sb.append("updateTimeMax=").append(updateTimeMax != null ? df.format(updateTimeMax) : null).append('\n');
        sb.append("id=").append(id).append('\n');
        sb.append("userId=").append(userId).append('\n');
        sb.append("hoppyId=").append(hoppyId).append('\n');
        sb.append("createTime=").append(createTime != null ? df.format(createTime) : null).append('\n');
        sb.append("updateTime=").append(updateTime != null ? df.format(updateTime) : null).append('\n');
        sb.append("deleteFlag=").append(deleteFlag);
        sb.append('}');
        return sb.toString();
    }

    /*** ids in getUserHoppyPageList */
    @ApiModelProperty("ids")
    private transient java.util.List<Integer> ids;

    /*** 用户IDs in getUserHoppyPageList */
    @ApiModelProperty("用户IDs")
    private transient java.util.List<String> userIds;

    /*** hoppyIds in getUserHoppyPageList */
    @ApiModelProperty("hoppyIds")
    private transient java.util.List<Integer> hoppyIds;

    /*** 创建时间Min in getUserHoppyPageList */
    @ApiModelProperty("创建时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMin;

    /*** 创建时间Max in getUserHoppyPageList */
    @ApiModelProperty("创建时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMax;

    /*** 更新时间Min in getUserHoppyPageList */
    @ApiModelProperty("更新时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMin;

    /*** 更新时间Max in getUserHoppyPageList */
    @ApiModelProperty("更新时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMax;
}