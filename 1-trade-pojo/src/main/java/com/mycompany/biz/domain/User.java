/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.domain;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.stategen.framework.annotation.ChangeBy;
import org.stategen.framework.annotation.Editor;
import org.stategen.framework.annotation.OptionConfig;
import org.stategen.framework.lite.enums.EditorType;

import com.alibaba.fastjson.annotation.JSONField;
import com.mycompany.biz.enums.StatusEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * User
 * <pre>
 * database table: user
 * database table comments: User
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅不可以修改dalgen生成的属生(field)类型 ,方法(Method)返回值类型和参数类型
 * 不建议使@Data,其hashCode有问题
 * </pre>
 */
@Getter
@Setter
public class User implements java.io.Serializable {

    @ApiModelProperty("用户可访问的节点")
    private List<Long> visitsIds;

    private Province province;

    private City city;

    //用id存储到表中
    @OptionConfig
    @Editor(EditorType.CheckboxGroup.class)
    @ApiModelProperty("爱好 ids")
    private List<Long> hoppyIds;

    private static final long serialVersionUID = -5216457518046898601L;

    /***用户ID   db_column: user_id VARCHAR */
    @ApiModelProperty("用户ID")
    @Id
    @Max(64)
    private String userId;

    /***用户名   db_column: username VARCHAR */
    @ApiModelProperty("用户名")
    @NotNull
    @Max(64)
    private String username;

    /***密码，测试，明文   db_column: password VARCHAR */
    @ApiModelProperty("密码，测试，明文")
    @Max(64)
    @JSONField(serialize = false)
    private transient String password;

    /***用户角色 ADMIN,DEFAULT,DEVELOPER   db_column: role_type VARCHAR */
    @ApiModelProperty("用户角色 ADMIN,DEFAULT,DEVELOPER")
    @Max(32)
    private String roleType;

    /***姓名   db_column: name VARCHAR */
    @ApiModelProperty("姓名")
    @Max(64)
    private String name;

    /***别名   db_column: nickName VARCHAR */
    @ApiModelProperty("别名")
    @Max(32)
    private String nickName;

    /***年龄   db_column: age INTEGER */
    @ApiModelProperty("年龄")
    private Integer age;

    /***详细地址   db_column: address VARCHAR */
    @ApiModelProperty("详细地址")
    @Max(255)
    private String address;

    /***头像   db_column: avatar_img VARCHAR */
    @ApiModelProperty("头像")
    @Max(255)
    @Editor(EditorType.Image.class)
    private String avatarImg;

    /***邮箱   db_column: email VARCHAR */
    @ApiModelProperty("邮箱")
    @NotNull
    @Email
    @Max(128)
    private String email;

    /***认证时间   db_column: vali_datetime TIMESTAMP */
    @ApiModelProperty("认证时间")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date valiDatetime;

    /***出生日期   db_column: birthday_date DATE */
    @ApiModelProperty("出生日期")
    @Temporal(TemporalType.DATE)
    private java.util.Date birthdayDate;

    /***工作时间   db_column: work_time TIME */
    @ApiModelProperty("工作时间")
    @Temporal(TemporalType.TIME)
    private java.util.Date workTime;

    /***省份 ID   db_column: province_id VARCHAR */
    @ApiModelProperty("省份 ID")
    @Max(64)
    @OptionConfig
    private String provinceId;

    /***城市 ID   db_column: city_id VARCHAR */
    @ApiModelProperty("城市 ID")
    @Max(64)
    @OptionConfig()
    @ChangeBy("provinceId")
    private String cityId;

    /***状态 enum   db_column: status VARCHAR */
    @ApiModelProperty("状态 enum")
    @Max(64)
    private StatusEnum status;

    /***级别   db_column: grade BIGINT */
    @ApiModelProperty("级别")
    private Long grade;

    /***性别   db_column: sex BIT */
    @ApiModelProperty("性别")
    private Boolean sex;

    /***邮寄地址 ID   db_column: post_address_id VARCHAR */
    @ApiModelProperty("邮寄地址 ID")
    @Max(64)
    private String postAddressId;

    /***创建时间   db_column: create_time TIMESTAMP */
    @ApiModelProperty(value = "创建时间", hidden = true)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createTime;

    /***更新时间   db_column: update_time TIMESTAMP */
    @ApiModelProperty(value = "更新时间", hidden = true)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateTime;

    /***是否删除 (0:正常，1删除)   db_column: delete_flag INTEGER */
    @ApiModelProperty(value = "是否删除 (0:正常，1删除)", hidden = true)
    private Integer deleteFlag;

    /*----------------getter & setter ignore by lombok -------------------*/
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd H:m:ss.SSS");
        StringBuffer sb = new StringBuffer(1024);
        sb.append('{');
        sb.append("userIds=").append(userIds).append('\n');
        sb.append("usernameLike=").append(usernameLike).append('\n');
        sb.append("passwordLike=").append(passwordLike).append('\n');
        sb.append("roleTypes=").append(roleTypes).append('\n');
        sb.append("nameLike=").append(nameLike).append('\n');
        sb.append("nickNameLike=").append(nickNameLike).append('\n');
        sb.append("ageMin=").append(ageMin).append('\n');
        sb.append("ageMax=").append(ageMax).append('\n');
        sb.append("addressLike=").append(addressLike).append('\n');
        sb.append("emailLike=").append(emailLike).append('\n');
        sb.append("valiDatetimeMin=").append(valiDatetimeMin != null ? df.format(valiDatetimeMin) : null).append('\n');
        sb.append("valiDatetimeMax=").append(valiDatetimeMax != null ? df.format(valiDatetimeMax) : null).append('\n');
        sb.append("birthdayDateMin=").append(birthdayDateMin != null ? df.format(birthdayDateMin) : null).append('\n');
        sb.append("birthdayDateMax=").append(birthdayDateMax != null ? df.format(birthdayDateMax) : null).append('\n');
        sb.append("workTimeMin=").append(workTimeMin != null ? df.format(workTimeMin) : null).append('\n');
        sb.append("workTimeMax=").append(workTimeMax != null ? df.format(workTimeMax) : null).append('\n');
        sb.append("provinceIds=").append(provinceIds).append('\n');
        sb.append("cityIds=").append(cityIds).append('\n');
        sb.append("statuss=").append(statuss).append('\n');
        sb.append("gradeMin=").append(gradeMin).append('\n');
        sb.append("gradeMax=").append(gradeMax).append('\n');
        sb.append("postAddressIds=").append(postAddressIds).append('\n');
        sb.append("createTimeMin=").append(createTimeMin != null ? df.format(createTimeMin) : null).append('\n');
        sb.append("createTimeMax=").append(createTimeMax != null ? df.format(createTimeMax) : null).append('\n');
        sb.append("updateTimeMin=").append(updateTimeMin != null ? df.format(updateTimeMin) : null).append('\n');
        sb.append("updateTimeMax=").append(updateTimeMax != null ? df.format(updateTimeMax) : null).append('\n');
        sb.append("userId=").append(userId).append('\n');
        sb.append("username=").append(username).append('\n');
        sb.append("password=").append(password).append('\n');
        sb.append("roleType=").append(roleType).append('\n');
        sb.append("name=").append(name).append('\n');
        sb.append("nickName=").append(nickName).append('\n');
        sb.append("age=").append(age).append('\n');
        sb.append("address=").append(address).append('\n');
        sb.append("avatarImg=").append(avatarImg).append('\n');
        sb.append("email=").append(email).append('\n');
        sb.append("valiDatetime=").append(valiDatetime != null ? df.format(valiDatetime) : null).append('\n');
        sb.append("birthdayDate=").append(birthdayDate != null ? df.format(birthdayDate) : null).append('\n');
        sb.append("workTime=").append(workTime != null ? df.format(workTime) : null).append('\n');
        sb.append("provinceId=").append(provinceId).append('\n');
        sb.append("cityId=").append(cityId).append('\n');
        sb.append("status=").append(status).append('\n');
        sb.append("grade=").append(grade).append('\n');
        sb.append("sex=").append(sex).append('\n');
        sb.append("postAddressId=").append(postAddressId).append('\n');
        sb.append("createTime=").append(createTime != null ? df.format(createTime) : null).append('\n');
        sb.append("updateTime=").append(updateTime != null ? df.format(updateTime) : null).append('\n');
        sb.append("deleteFlag=").append(deleteFlag);
        sb.append('}');
        return sb.toString();
    }

    /*** 用户IDs in getUserPageList */
    @ApiModelProperty("用户IDs")
    private transient java.util.List<String> userIds;

    /*** 用户名Like in getUserPageList */
    @ApiModelProperty("用户名Like")
    private transient String usernameLike;

    /*** 密码，测试，明文Like in getUserPageList */
    @ApiModelProperty("密码Like")
    private transient String passwordLike;

    /*** 用户角色 ADMIN,DEFAULT,DEVELOPERs in getUserPageList */
    @ApiModelProperty("用户角色s")
    private transient java.util.List<String> roleTypes;

    /*** 用户名nameLike in getUserPageList */
    @ApiModelProperty("用户名nameLike")
    private transient String nameLike;

    /*** 别名Like in getUserPageList */
    @ApiModelProperty("nickNameLike")
    private transient String nickNameLike;

    /*** 年龄Min in getUserPageList */
    @ApiModelProperty("ageMin")
    private transient Integer ageMin;

    /*** 年龄Max in getUserPageList */
    @ApiModelProperty("ageMax")
    private transient Integer ageMax;

    /*** 详细地址Like in getUserPageList */
    @ApiModelProperty("addressLike")
    private transient String addressLike;

    /*** 邮箱Like in getUserPageList */
    @ApiModelProperty("邮箱Like")
    private transient String emailLike;

    /*** 认证时间Min in getUserPageList */
    @ApiModelProperty("认证时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date valiDatetimeMin;

    /*** 认证时间Max in getUserPageList */
    @ApiModelProperty("认证时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date valiDatetimeMax;

    /*** 出生日期Min in getUserPageList */
    @ApiModelProperty("出生日期Min")
    @Temporal(TemporalType.DATE)
    private transient java.util.Date birthdayDateMin;

    /*** 出生日期Max in getUserPageList */
    @ApiModelProperty("出生日期Max")
    @Temporal(TemporalType.DATE)
    private transient java.util.Date birthdayDateMax;

    /*** 工作时间Min in getUserPageList */
    @ApiModelProperty("工作时间Min")
    @Temporal(TemporalType.TIME)
    private transient java.util.Date workTimeMin;

    /*** 工作时间Max in getUserPageList */
    @ApiModelProperty("工作时间Max")
    @Temporal(TemporalType.TIME)
    private transient java.util.Date workTimeMax;

    /*** 省份 IDs in getUserPageList */
    @ApiModelProperty("省份s")
    @OptionConfig
    private transient java.util.List<String> provinceIds;

    /*** 城市 IDs in getUserPageList */
    @ApiModelProperty("城市s")
    @OptionConfig()
    @ChangeBy("provinceId")
    private transient java.util.List<String> cityIds;

    /*** 状态 enums in getUserPageList */
    @ApiModelProperty("状态s")
    @Editor(EditorType.CheckboxGroup.class)
    private transient java.util.List<com.mycompany.biz.enums.StatusEnum> statuss;

    /*** 级别Min in getUserPageList */
    @ApiModelProperty("gradeMin")
    private transient Long gradeMin;

    /*** 级别Max in getUserPageList */
    @ApiModelProperty("gradeMax")
    private transient Long gradeMax;

    /*** 邮寄地址 IDs in getUserPageList */
    @ApiModelProperty("postAddressIds")
    private transient java.util.List<String> postAddressIds;

    /*** 创建时间Min in getUserPageList */
    @ApiModelProperty("创建时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMin;

    /*** 创建时间Max in getUserPageList */
    @ApiModelProperty("创建时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMax;

    /*** 更新时间Min in getUserPageList */
    @ApiModelProperty("更新时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMin;

    /*** 更新时间Max in getUserPageList */
    @ApiModelProperty("更新时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMax;

    public List<Long> getVisitsIds() {
        return visitsIds;
    }

    public void setVisitsIds(List<Long> visitsIds) {
        this.visitsIds = visitsIds;
    }
}
