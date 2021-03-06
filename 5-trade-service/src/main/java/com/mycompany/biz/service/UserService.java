/*
 * Copyright (c) 2016 - 2116 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mycompany.biz.service;

import java.util.List;

import org.stategen.framework.lite.PageList;
import org.stategen.framework.util.AssignSerice;

import com.mycompany.biz.domain.User;

/**
 * UserServiceFacade
 * <pre>
 * database table: user
 * database table comments: User
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public interface UserService extends AssignSerice<User, String>, UserServiceTrade {

    //<#--
    /*** 保存user,有id时更新，没有id时插入,并带回新的id，返回 user*/
    public User saveUser(User user);

    /*** 批量保存users,有id时更新，没有id时插入,并带回新的id，返回 users*/
    public List<User> saveUsers(List<User> users);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#insert
     */
    public User insert(User user);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#deleteByEmail
     */
    public Long deleteByEmail(String email);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#update
     */
    public User update(User user);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUserByUserId
     */
    public User getUserByUserId(String userId);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUserByEmail
     */
    public User getUserByEmail(String email);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUsersByUserIds
     */
    public List<User> getUsersByUserIds(java.util.List<String> userIds);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUsersByEmails
     */
    public List<User> getUsersByEmails(java.util.List<String> emails);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#deleteByUserIds
     */
    public List<String> deleteByUserIds(java.util.List<String> userIds);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#deleteByEmails
     */
    public Long deleteByEmails(java.util.List<String> emails);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#delete
     */
    public String delete(String userId);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#deleteByUsername
     */
    public Long deleteByUsername(String username);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUserByUsername
     */
    public User getUserByUsername(String username);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUsersByUsernames
     */
    public List<User> getUsersByUsernames(java.util.List<String> usernames);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#deleteByUsernames
     */
    public Long deleteByUsernames(java.util.List<String> usernames);

    /**
     * 
     * @see com.mycompany.biz.dao.UserDao#getUserPageList
     */
    public PageList<User> getUserPageList(User user, int pageSize, int pageNum);
    //-->
    //
}
