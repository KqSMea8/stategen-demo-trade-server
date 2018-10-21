/*
 * Copyright (c) 2016 - 2116 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mycompany.biz.service;

import java.util.List;
import org.stategen.framework.lite.PageList;

import com.mycompany.biz.domain.UserRole;

/**
 * UserRoleServiceFacade
 * <pre>
 * database table: user_role
 * database table comments: UserRole
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public interface UserRoleService extends UserRoleServiceFacade {

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#insert
     */
    public UserRole insert(UserRole userRole);

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#update
     */
    public UserRole update(UserRole userRole);

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#getUserRoleById
     */
    public UserRole getUserRoleById(Long id);

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#getUserRolePageListByDefaultQuery
     */
    public PageList<UserRole> getUserRolePageListByDefaultQuery(UserRole userRole, int pageSize, int pageNum);

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#getUserRolesByIds
     */
    public List<UserRole> getUserRolesByIds(java.util.List<Long> ids);

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#deleteByIds
     */
    public List<Long> deleteByIds(java.util.List<Long> ids);

    /*** 保存userRole,有id时更新，没有id时插入,并带回新的id，返回 userRole*/
    public UserRole saveUserRole(UserRole userRole);

    /*** 批量保存userRoles,有id时更新，没有id时插入,并带回新的id，返回 userRoles*/
    public List<UserRole> saveUserRoles(List<UserRole> userRoles);

    /**
     * 
     * @see com.mycompany.biz.dao.UserRoleDao#delete
     */
    public Long delete(Long id);
}
