/*
 * Copyright (c) 2016 - 2116 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mycompany.biz.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.stategen.framework.lite.PageList;

import com.mycompany.biz.dao.UserRoleDao;
import com.mycompany.biz.domain.UserRole;
import com.mycompany.biz.service.UserRoleService;

/**
 * UserRoleServiceImpl
 * <pre>
 * database table: user_role
 * database table comments: UserRole
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public class UserRoleServiceImpl implements UserRoleService {

    @Resource(name = "userRoleDao")
    UserRoleDao userRoleDao;

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#insert
     * @see com.mycompany.biz.service.UserRoleService#insert
     */
    @Override
    public UserRole insert(UserRole userRole) {
        return userRoleDao.insert(userRole);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#update
     * @see com.mycompany.biz.service.UserRoleService#update
     */
    @Override
    public UserRole update(UserRole userRole) {
        return userRoleDao.update(userRole);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#getUserRoleById
     * @see com.mycompany.biz.service.UserRoleService#getUserRoleById
     */
    @Override
    public UserRole getUserRoleById(Long id) {
        return userRoleDao.getUserRoleById(id);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#getUserRolesByIds
     * @see com.mycompany.biz.service.UserRoleService#getUserRolesByIds
     */
    @Override
    public List<UserRole> getUserRolesByIds(java.util.List<Long> ids) {
        return userRoleDao.getUserRolesByIds(ids);
    }

    /*** 保存userRole,有id时更新，没有id时插入,并带回新的id，返回 userRole*/
    @Override
    public UserRole saveUserRole(UserRole userRole) {
        if (userRole != null) {
            java.lang.Long id = userRole.getId();
            if (id != null) {
                insert(userRole);
            } else {
                update(userRole);
            }
        }
        return userRole;
    }

    /*** 批量保存userRoles,有id时更新，没有id时插入,并带回新的id，返回 userRoles*/
    @Override
    public List<UserRole> saveUserRoles(List<UserRole> userRoles) {
        for (UserRole userRole : userRoles) {
            this.saveUserRole(userRole);
        }
        return userRoles;
    }

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#delete
     * @see com.mycompany.biz.service.UserRoleService#delete
     */
    @Override
    public Long delete(Long id) {
        return userRoleDao.delete(id);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#deleteByIds
     * @see com.mycompany.biz.service.UserRoleService#deleteByIds
     */
    @Override
    public List<Long> deleteByIds(java.util.List<Long> ids) {
        return userRoleDao.deleteByIds(ids);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#getUserRolePageList
     * @see com.mycompany.biz.service.UserRoleService#getUserRolePageList
     */
    @Override
    public PageList<UserRole> getUserRolePageList(UserRole userRole, int pageSize, int pageNum) {
        return userRoleDao.getUserRolePageList(userRole, pageSize, pageNum);
    }
}
