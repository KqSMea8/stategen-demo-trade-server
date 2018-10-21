/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.UserRole;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

/**
 * UserRoleDao
 * <pre>
 * database table: user_role
 * database table comments: UserRole
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public interface UserRoleDao {

	/**
    <pre>
    &#64;ApiParam() Long id,
    &#64;ApiParam() String userId,
    &#64;ApiParam() String roleId,
    &#64;ApiParam() String roleType,
    &#64;ApiParam(hidden = true) UserRole userRole,
    
    </pre>
	 * 
	 * sql:insert into user_role ( create_time , update_time , delete_flag , id , user_id , role_id , role_type ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?,?)
	 */
	public UserRole insert(UserRole userRole) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id") Long id,
    
    </pre>
	 * 
	 * sql:UPDATE user_role SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and id = ?
	 */
	public Long delete(Long id) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String userId,
    &#64;ApiParam() String roleId,
    &#64;ApiParam() String roleType,
    &#64;ApiParam() Long id,
    &#64;ApiParam(hidden = true) UserRole userRole,
    
    </pre>
	 * 
	 * sql:UPDATE user_role SET update_time= CURRENT_TIMESTAMP(6) , user_id = ? , role_id = ? , role_type = ? where delete_flag = 0 and id = ?
	 */
	public UserRole update(UserRole userRole) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id") Long id,
    
    </pre>
	 * 
	 * sql:select a.id, a.user_id, a.role_id, a.role_type, a.create_time, a.update_time, a.delete_flag from user_role a where a.delete_flag = 0 and a.id = ?
	 */
	public UserRole getUserRoleById(Long id) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam()&#64;RequestParam(required =false,name="ids") ArrayList&lt;Long&gt; ids,
    &#64;ApiParam()&#64;RequestParam(required =false,name="userIds") ArrayList&lt;String&gt; userIds,
    &#64;ApiParam()&#64;RequestParam(required =false,name="roleIds") ArrayList&lt;String&gt; roleIds,
    &#64;ApiParam()&#64;RequestParam(required =false,name="roleTypes") ArrayList&lt;String&gt; roleTypes,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax,
    &#64;ApiParam(hidden = true) UserRole userRole,
    &#64;ApiParam(hidden = true) Pagination pagination
    </pre>
	 * 
	 * sql:select a.id, a.user_id, a.role_id, a.role_type, a.create_time, a.update_time, a.delete_flag from user_role a where a.delete_flag = 0 and a.id in ( ? ) and a.user_id in ( ? ) and a.role_id in ( ? ) and a.role_type in ( ? ) and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1
	 */
	public PageList<UserRole> getUserRolePageListByDefaultQuery(UserRole userRole, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id")&#64;RequestParam(required =false,name="ids") ArrayList&lt;Long&gt; ids,
    
    </pre>
	 * 
	 * sql:select a.id, a.user_id, a.role_id, a.role_type, a.create_time, a.update_time, a.delete_flag from user_role a where a.delete_flag = 0 and a.id in ( ? )
	 */
	public List<UserRole> getUserRolesByIds(java.util.List<Long> ids) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id")&#64;RequestParam(required =false,name="ids") ArrayList&lt;Long&gt; ids,
    
    </pre>
	 * 
	 * sql:UPDATE user_role SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and id in ( ? )
	 */
	public java.util.List<Long> deleteByIds(java.util.List<Long> ids) throws DataAccessException;
	

}



