/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */package com.mycompany.biz.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.stategen.framework.annotation.Wrap;

import com.mycompany.biz.service.UploadFileService;
/**
 * UploadFileController
 * <pre>
 * database table: upload_file
 * database table comments: UploadFile
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，因此该类可以修改任何部分
 * 在虚类中最好不要定义@RequestMapping，考虑到多个继承后不知道是哪端被调用了。
 * </pre>
 */

@RequestMapping("/api/uploadFile")
@Wrap
public abstract class UploadFileControllerBase {

    @Resource
    protected UploadFileService uploadFileService;

}


