/*
 * Copyright (c) 2016 - 2116 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mycompany.biz.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.stategen.framework.annotation.Wrap;

import com.mycompany.biz.service.RoleMenuService;

@RequestMapping("/api/roleMenu")
@Wrap
public abstract class RoleMenuControllerBase {

    @Resource
    protected RoleMenuService roleMenuService;
}
