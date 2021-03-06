/*
 * Copyright (c) 2016 - 2116 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mycompany.biz.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Resource;

import org.stategen.framework.lite.PageList;
import org.stategen.framework.util.CollectionUtil;
import org.stategen.framework.util.StringUtil;

import com.mycompany.biz.dao.RoleMenuDao;
import com.mycompany.biz.domain.RoleMenu;
import com.mycompany.biz.service.RoleMenuService;

/**
 * RoleMenuServiceImpl
 * <pre>
 * database table: role_menu
 * database table comments: RoleMenu
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public class RoleMenuServiceImpl implements RoleMenuService {

    //<#--
    @Resource(name = "roleMenuDao")
    RoleMenuDao roleMenuDao;

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#insert
     * @see com.mycompany.biz.service.RoleMenuService#insert
     */
    @Override
    public RoleMenu insert(RoleMenu roleMenu) {
        return roleMenuDao.insert(roleMenu);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#update
     * @see com.mycompany.biz.service.RoleMenuService#update
     */
    @Override
    public RoleMenu update(RoleMenu roleMenu) {
        return roleMenuDao.update(roleMenu);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenuById
     * @see com.mycompany.biz.service.RoleMenuService#getRoleMenuById
     */
    @Override
    public RoleMenu getRoleMenuById(Long id) {
        return roleMenuDao.getRoleMenuById(id);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenusByIds
     * @see com.mycompany.biz.service.RoleMenuService#getRoleMenusByIds
     */
    @Override
    public List<RoleMenu> getRoleMenusByIds(java.util.List<Long> ids) {
        return roleMenuDao.getRoleMenusByIds(ids);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#deleteByIds
     * @see com.mycompany.biz.service.RoleMenuService#deleteByIds
     */
    @Override
    public List<Long> deleteByIds(java.util.List<Long> ids) {
        return roleMenuDao.deleteByIds(ids);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenusByMenuIds
     * @see com.mycompany.biz.service.RoleMenuService#getRoleMenusByMenuIds
     */
    @Override
    public List<RoleMenu> getRoleMenusByMenuIds(java.util.List<Long> menuIds) {
        return roleMenuDao.getRoleMenusByMenuIds(menuIds);
    }

    /*** 保存roleMenu,有id时更新，没有id时插入,并带回新的id，返回 roleMenu*/
    @Override
    public RoleMenu saveRoleMenu(RoleMenu roleMenu) {
        if (roleMenu != null) {
            java.lang.Long id = roleMenu.getId();
            if (id != null) {
                insert(roleMenu);
            } else {
                update(roleMenu);
            }
        }
        return roleMenu;
    }

    /*** 批量保存roleMenus,有id时更新，没有id时插入,并带回新的id，返回 roleMenus*/
    @Override
    public List<RoleMenu> saveRoleMenus(List<RoleMenu> roleMenus) {
        for (RoleMenu roleMenu : roleMenus) {
            this.saveRoleMenu(roleMenu);
        }
        return roleMenus;
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#delete
     * @see com.mycompany.biz.service.RoleMenuService#delete
     */
    @Override
    public Long delete(Long id) {
        return roleMenuDao.delete(id);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.RoleMenuDao#getRoleMenuPageList
     * @see com.mycompany.biz.service.RoleMenuService#getRoleMenuPageList
     */
    @Override
    public PageList<RoleMenu> getRoleMenuPageList(RoleMenu roleMenu, int pageSize, int pageNum) {
        return roleMenuDao.getRoleMenuPageList(roleMenu, pageSize, pageNum);
    }

    @Override
    public <D> void assignBeanTo(Collection<D> dests, Function<? super D, Long> destGetMethod, BiConsumer<D, RoleMenu> destSetMethod) {
        if (CollectionUtil.isNotEmpty(dests)) {
            Set<Long> ids = CollectionUtil.toSet(dests, destGetMethod);
            List<RoleMenu> roleMenus = this.getRoleMenusByIds(new ArrayList<Long>(ids));
            if (CollectionUtil.isNotEmpty(roleMenus)) {
                CollectionUtil.setModelByList(dests, roleMenus, destGetMethod, destSetMethod, RoleMenu::getId);
            }
        }
    }
    //-->
    //
}
