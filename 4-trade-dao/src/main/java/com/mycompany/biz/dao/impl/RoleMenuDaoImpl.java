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

import com.mycompany.biz.dao.RoleMenuDao;
import com.mycompany.biz.domain.RoleMenu;

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
public class RoleMenuDaoImpl extends SqlMapClientDaoSupport implements RoleMenuDao {

    /**
	 * 
	 * sql:insert into role_menu ( create_time , update_time , delete_flag , id , role_id , menu_id ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?)
	 */
    public RoleMenu insert(RoleMenu roleMenu) throws DataAccessException {
        if (roleMenu == null) {
            throw new IllegalArgumentException("Can't insert a null data object into db.");
        }
        getSqlMapClientTemplate().insert("insert.RoleMenu.trade", roleMenu);
        return roleMenu;
    }

    /**
	 * 
	 * sql:UPDATE role_menu SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and id = ?
	 */
    public Long delete(Long id) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("id", id);
        getSqlMapClientTemplate().update("delete.RoleMenu.trade", params);
        return id;
    }

    /**
	 * 
	 * sql:UPDATE role_menu SET update_time= CURRENT_TIMESTAMP(6) , role_id = ? , menu_id = ? where delete_flag = 0 and id = ?
	 */
    public RoleMenu update(RoleMenu roleMenu) throws DataAccessException {
        if (roleMenu == null) {
            throw new IllegalArgumentException("Can't update by a null data object.");
        }
        getSqlMapClientTemplate().update("update.RoleMenu.trade", roleMenu);
        return roleMenu;
    }

    /**
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.delete_flag = 0 and a.id = ?
	 */
    public RoleMenu getRoleMenuById(Long id) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("id", id);
        return (RoleMenu) getSqlMapClientTemplate().queryForObject("getRoleMenuById.RoleMenu.trade", params);
    }

    /**
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.delete_flag = 0 and a.id=? and a.id in ( ? ) and a.role_id=? and a.role_id in ( ? ) and a.menu_id=? and a.menu_id in ( ? ) and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.update_time desc, a.create_time desc
	 */
    @SuppressWarnings("unchecked")
    public PageList<RoleMenu> getRoleMenuPageList(RoleMenu roleMenu, int pageSize, int pageNum) throws DataAccessException {
        return (PageList<RoleMenu>) PageQueryUtils.pageQuery(getSqlMapClientTemplate(), "getRoleMenuPageList.RoleMenu.trade", roleMenu, pageNum, pageSize);
    }

    /**
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.delete_flag = 0 and 1=0 and a.id in ( ? ) order by a.update_time desc, a.create_time desc
	 */
    @SuppressWarnings("unchecked")
    public List<RoleMenu> getRoleMenusByIds(java.util.List<Long> ids) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("ids", ids);
        return (List<RoleMenu>) getSqlMapClientTemplate().queryForList("getRoleMenusByIds.RoleMenu.trade", params);
    }

    /**
	 * 
	 * sql:UPDATE role_menu SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and id in ( ? )
	 */
    public java.util.List<Long> deleteByIds(java.util.List<Long> ids) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("ids", ids);
        getSqlMapClientTemplate().update("deleteByIds.RoleMenu.trade", params);
        return ids;
    }

    /**
	 * 
	 * sql:select a.id, a.role_id, a.menu_id, a.create_time, a.update_time, a.delete_flag from role_menu a where a.menu_id in ( ? ) and a.delete_flag = 0
	 */
    @SuppressWarnings("unchecked")
    public List<RoleMenu> getRoleMenusByMenuIds(java.util.List<Long> menuIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("menuIds", menuIds);
        return (List<RoleMenu>) getSqlMapClientTemplate().queryForList("getRoleMenusByMenuIds.RoleMenu.trade", params);
    }
}
