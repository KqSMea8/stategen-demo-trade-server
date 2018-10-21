/*
 * Copyright (c) 2016 - 2116 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mycompany.biz.service;

import java.util.List;
import org.stategen.framework.lite.PageList;

import com.mycompany.biz.domain.RoleMenu;

/**
 * RoleMenuServiceFacade
 * <pre>
 * database table: role_menu
 * database table comments: RoleMenu
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public interface RoleMenuService extends RoleMenuServiceFacade {

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#insert
     */
    public RoleMenu insert(RoleMenu roleMenu);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#update
     */
    public RoleMenu update(RoleMenu roleMenu);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenuById
     */
    public RoleMenu getRoleMenuById(Long id);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenuPageListByDefaultQuery
     */
    public PageList<RoleMenu> getRoleMenuPageListByDefaultQuery(RoleMenu roleMenu, int pageSize, int pageNum);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenusByIds
     */
    public List<RoleMenu> getRoleMenusByIds(java.util.List<Long> ids);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#deleteByIds
     */
    public List<Long> deleteByIds(java.util.List<Long> ids);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenusByMenuIds
     */
    public List<RoleMenu> getRoleMenusByMenuIds(java.util.List<Long> menuIds);

    /*** 保存roleMenu,有id时更新，没有id时插入,并带回新的id，返回 roleMenu*/
    public RoleMenu saveRoleMenu(RoleMenu roleMenu);

    /*** 批量保存roleMenus,有id时更新，没有id时插入,并带回新的id，返回 roleMenus*/
    public List<RoleMenu> saveRoleMenus(List<RoleMenu> roleMenus);

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#delete
     */
    public Long delete(Long id);
}
