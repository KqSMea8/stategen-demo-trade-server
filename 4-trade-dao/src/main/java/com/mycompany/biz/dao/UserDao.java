/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.User;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

/**
 * UserDao
 * <pre>
 * database table: user
 * database table comments: User
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public interface UserDao {

	/**
    <pre>
    &#64;ApiParam() String userId,
    &#64;ApiParam() String username,
    &#64;ApiParam() String password,
    &#64;ApiParam() String roleType,
    &#64;ApiParam() String name,
    &#64;ApiParam() String nickName,
    &#64;ApiParam() Integer age,
    &#64;ApiParam() String address,
    &#64;ApiParam() String avatarImgId,
    &#64;ApiParam() String email,
    &#64;ApiParam() Date valiDatetime,
    &#64;ApiParam() Date birthdayDate,
    &#64;ApiParam() Date workTime,
    &#64;ApiParam() String provinceId,
    &#64;ApiParam() String cityId,
    &#64;ApiParam() StatusEnum status,
    &#64;ApiParam() Long grade,
    &#64;ApiParam() Boolean sex,
    &#64;ApiParam() String postAddressId
    ,&#64;ApiParam(hidden = true) User user
    
    </pre>
	 * 
	 * sql:insert into user ( create_time , update_time , delete_flag , user_id , username , password , role_type , name , nickName , age , address , avatar_img_id , email , vali_datetime , birthday_date , work_time , province_id , city_id , status , grade , sex , post_address_id ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
	 */
	public User insert(User user) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户ID") String userId
    
    </pre>
	 * 
	 * sql:UPDATE user SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and user_id = ?
	 */
	public String delete(String userId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户名") String username
    
    </pre>
	 * 
	 * sql:UPDATE user SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and username = ?
	 */
	public Long deleteByUsername(String username) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("邮箱") String email
    
    </pre>
	 * 
	 * sql:UPDATE user SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and email = ?
	 */
	public Long deleteByEmail(String email) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String username,
    &#64;ApiParam() String password,
    &#64;ApiParam() String roleType,
    &#64;ApiParam() String name,
    &#64;ApiParam() String nickName,
    &#64;ApiParam() Integer age,
    &#64;ApiParam() String address,
    &#64;ApiParam() String avatarImgId,
    &#64;ApiParam() String email,
    &#64;ApiParam() Date valiDatetime,
    &#64;ApiParam() Date birthdayDate,
    &#64;ApiParam() Date workTime,
    &#64;ApiParam() String provinceId,
    &#64;ApiParam() String cityId,
    &#64;ApiParam() StatusEnum status,
    &#64;ApiParam() Long grade,
    &#64;ApiParam() Boolean sex,
    &#64;ApiParam() String postAddressId,
    &#64;ApiParam() String userId
    ,&#64;ApiParam(hidden = true) User user
    
    </pre>
	 * 
	 * sql:UPDATE user SET update_time= CURRENT_TIMESTAMP(6) , username = ? , password = ? , role_type = ? , name = ? , nickName = ? , age = ? , address = ? , avatar_img_id = ? , email = ? , vali_datetime = ? , birthday_date = ? , work_time = ? , province_id = ? , city_id = ? , status = ? , grade = ? , sex = ? , post_address_id = ? where delete_flag = 0 and user_id = ?
	 */
	public User update(User user) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户ID") String userId
    
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and a.user_id = ?
	 */
	public User getUserByUserId(String userId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户名") String username
    
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and a.username = ?
	 */
	public User getUserByUsername(String username) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("邮箱") String email
    
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and a.email = ?
	 */
	public User getUserByEmail(String email) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String userId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="userIds") ArrayList&lt;String&gt; userIds,
    &#64;ApiParam() String username,
    &#64;ApiParam() String usernameLike,
    &#64;ApiParam() String password,
    &#64;ApiParam() String passwordLike,
    &#64;ApiParam() String roleType,
    &#64;ApiParam()&#64;RequestParam(required =false,name="roleTypes") ArrayList&lt;String&gt; roleTypes,
    &#64;ApiParam() String name,
    &#64;ApiParam() String nameLike,
    &#64;ApiParam() String nickName,
    &#64;ApiParam() String nickNameLike,
    &#64;ApiParam() Integer ageMin,
    &#64;ApiParam() Integer ageMax,
    &#64;ApiParam() String address,
    &#64;ApiParam() String addressLike,
    &#64;ApiParam() String avatarImgId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="avatarImgIds") ArrayList&lt;String&gt; avatarImgIds,
    &#64;ApiParam() String email,
    &#64;ApiParam() String emailLike,
    &#64;ApiParam() Date valiDatetimeMin,
    &#64;ApiParam() Date valiDatetimeMax,
    &#64;ApiParam() Date birthdayDateMin,
    &#64;ApiParam() Date birthdayDateMax,
    &#64;ApiParam() Date workTimeMin,
    &#64;ApiParam() Date workTimeMax,
    &#64;ApiParam() String provinceId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="provinceIds") ArrayList&lt;String&gt; provinceIds,
    &#64;ApiParam() String cityId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="cityIds") ArrayList&lt;String&gt; cityIds,
    &#64;ApiParam() StatusEnum status,
    &#64;ApiParam()&#64;RequestParam(required =false,name="statuss") ArrayList&lt;StatusEnum&gt; statuss,
    &#64;ApiParam() Long gradeMin,
    &#64;ApiParam() Long gradeMax,
    &#64;ApiParam() String postAddressId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="postAddressIds") ArrayList&lt;String&gt; postAddressIds,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax
    ,&#64;ApiParam(hidden = true) User user
    ,Pagination pagination
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and a.user_id=? and a.user_id in ( ? ) and a.username=? and a.username like CONCAT('%',?,'%') and a.password=? and a.password like CONCAT('%',?,'%') and a.role_type=? and a.role_type in ( ? ) and a.name=? and a.name like CONCAT('%',?,'%') and a.nickName=? and a.nickName like CONCAT('%',?,'%') and a.age >=? and a.age <? and a.address=? and a.address like CONCAT('%',?,'%') and a.avatar_img_id=? and a.avatar_img_id in ( ? ) and a.email=? and a.email like CONCAT('%',?,'%') and a.vali_datetime >=? and a.vali_datetime <? and a.birthday_date >=? and a.birthday_date <? and a.work_time >=? and a.work_time <? and a.province_id=? and a.province_id in ( ? ) and a.city_id=? and a.city_id in ( ? ) and a.status=? and a.status in ( ? ) and a.grade >=? and a.grade <? and a.post_address_id=? and a.post_address_id in ( ? ) and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.update_time desc, a.create_time desc
	 */
	public PageList<User> getUserPageList(User user, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户ID")&#64;RequestParam(required =false,name="userIds") ArrayList&lt;String&gt; userIds
    
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and 1=0 and a.user_id in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<User> getUsersByUserIds(java.util.List<String> userIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户名")&#64;RequestParam(required =false,name="usernames") ArrayList&lt;String&gt; usernames
    
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and 1=0 and a.username in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<User> getUsersByUsernames(java.util.List<String> usernames) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("邮箱")&#64;RequestParam(required =false,name="emails") ArrayList&lt;String&gt; emails
    
    </pre>
	 * 
	 * sql:select a.user_id, a.username, a.password, a.role_type, a.name, a.nickName, a.age, a.address, a.avatar_img_id, a.email, a.vali_datetime, a.birthday_date, a.work_time, a.province_id, a.city_id, a.status, a.grade, a.sex, a.post_address_id, a.create_time, a.update_time, a.delete_flag from user a where a.delete_flag = 0 and 1=0 and a.email in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<User> getUsersByEmails(java.util.List<String> emails) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户ID")&#64;RequestParam(required =false,name="userIds") ArrayList&lt;String&gt; userIds
    
    </pre>
	 * 
	 * sql:UPDATE user SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and user_id in ( ? )
	 */
	public java.util.List<String> deleteByUserIds(java.util.List<String> userIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("用户名")&#64;RequestParam(required =false,name="usernames") ArrayList&lt;String&gt; usernames
    
    </pre>
	 * 
	 * sql:UPDATE user SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and username in ( ? )
	 */
	public Long deleteByUsernames(java.util.List<String> usernames) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("邮箱")&#64;RequestParam(required =false,name="emails") ArrayList&lt;String&gt; emails
    
    </pre>
	 * 
	 * sql:UPDATE user SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and email in ( ? )
	 */
	public Long deleteByEmails(java.util.List<String> emails) throws DataAccessException;
	

}



