/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.RoleMenu;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

/**
 * RoleMenuDao
 * <pre>
 * database table: role_menu
 * database table comments: RoleMenu
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public interface RoleMenuDao {

	/**
    <pre>
    &#64;ApiParam() Long id,
    &#64;ApiParam() String roleId,
    &#64;ApiParam() Long menuId,
    &#64;ApiParam(hidden = true) RoleMenu roleMenu,
    
    </pre>
	 * 
	 * sql:insert into role_menu ( create_time , update_time , delete_flag , id , role_id , menu_id ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?)
	 */
	public RoleMenu insert(RoleMenu roleMenu) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id") Long id,
    
    </pre>
	 * 
	 * sql:UPDATE role_menu SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and id = ?
	 */
	public Long delete(Long id) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String roleId,
    &#64;ApiParam() Long menuId,
    &#64;ApiParam() Long id,
    &#64;ApiParam(hidden = true) RoleMenu roleMenu,
    
    </pre>
	 * 
	 * sql:UPDATE role_menu SET update_time= CURRENT_TIMESTAMP(6) , role_id = ? , menu_id = ? where delete_flag = 0 and id = ?
	 */
	public RoleMenu update(RoleMenu roleMenu) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id") Long id,
    
    </pre>
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.delete_flag = 0 and a.id = ?
	 */
	public RoleMenu getRoleMenuById(Long id) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam()&#64;RequestParam(required =false,name="ids") ArrayList&lt;Long&gt; ids,
    &#64;ApiParam()&#64;RequestParam(required =false,name="roleIds") ArrayList&lt;String&gt; roleIds,
    &#64;ApiParam()&#64;RequestParam(required =false,name="menuIds") ArrayList&lt;Long&gt; menuIds,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax,
    &#64;ApiParam(hidden = true) RoleMenu roleMenu,
    &#64;ApiParam(hidden = true) Pagination pagination
    </pre>
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.delete_flag = 0 and a.id in ( ? ) and a.role_id in ( ? ) and a.menu_id in ( ? ) and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1
	 */
	public PageList<RoleMenu> getRoleMenuPageListByDefaultQuery(RoleMenu roleMenu, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id")&#64;RequestParam(required =false,name="ids") ArrayList&lt;Long&gt; ids,
    
    </pre>
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.delete_flag = 0 and a.id in ( ? )
	 */
	public List<RoleMenu> getRoleMenusByIds(java.util.List<Long> ids) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("id")&#64;RequestParam(required =false,name="ids") ArrayList&lt;Long&gt; ids,
    
    </pre>
	 * 
	 * sql:UPDATE role_menu SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and id in ( ? )
	 */
	public java.util.List<Long> deleteByIds(java.util.List<Long> ids) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("menuId")&#64;RequestParam(required =false,name="menuIds") ArrayList&lt;Long&gt; menuIds,
    
    </pre>
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.menu_id in ( ? ) and a.delete_flag = 0
	 */
	public List<RoleMenu> getRoleMenusByMenuIds(java.util.List<Long> menuIds) throws DataAccessException;
	

}



