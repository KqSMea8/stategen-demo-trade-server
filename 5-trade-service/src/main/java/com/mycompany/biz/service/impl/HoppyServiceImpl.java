/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
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

import com.mycompany.biz.dao.HoppyDao;
import com.mycompany.biz.domain.Hoppy;
import com.mycompany.biz.service.HoppyService;

/**
 * HoppyServiceImpl
 * <pre>
 * database table: hoppy
 * database table comments: Hoppy
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 新生成的类中的方法，只有在不同名的情况下才会被追加到该类下，
 * 因此该类可以修改任何部分
 * </pre>
 */
public class HoppyServiceImpl implements HoppyService {

    @Resource(name = "hoppyDao")
    HoppyDao hoppyDao;

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#insert
     * @see com.mycompany.biz.service.HoppyService#insert
     */
    @Override
    public Hoppy insert(Hoppy hoppy) {
        return hoppyDao.insert(hoppy);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#delete
     * @see com.mycompany.biz.service.HoppyService#delete
     */
    @Override
    public Integer delete(Integer hoppyId) {
        return hoppyDao.delete(hoppyId);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#update
     * @see com.mycompany.biz.service.HoppyService#update
     */
    @Override
    public Hoppy update(Hoppy hoppy) {
        return hoppyDao.update(hoppy);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#getHoppyByHoppyId
     * @see com.mycompany.biz.service.HoppyService#getHoppyByHoppyId
     */
    @Override
    public Hoppy getHoppyByHoppyId(Integer hoppyId) {
        return hoppyDao.getHoppyByHoppyId(hoppyId);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#getHoppyPageList
     * @see com.mycompany.biz.service.HoppyService#getHoppyPageList
     */
    @Override
    public PageList<Hoppy> getHoppyPageList(Hoppy hoppy, int pageSize, int pageNum) {
        return hoppyDao.getHoppyPageList(hoppy, pageSize, pageNum);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#getHoppysByHoppyIds
     * @see com.mycompany.biz.service.HoppyService#getHoppysByHoppyIds
     */
    @Override
    public List<Hoppy> getHoppysByHoppyIds(java.util.List<Integer> hoppyIds) {
        return hoppyDao.getHoppysByHoppyIds(hoppyIds);
    }

    /**
     * 
     * @see com.mycompany.biz.dao.HoppyDao#deleteByHoppyIds
     * @see com.mycompany.biz.service.HoppyService#deleteByHoppyIds
     */
    @Override
    public java.util.List<Integer> deleteByHoppyIds(java.util.List<Integer> hoppyIds) {
        return hoppyDao.deleteByHoppyIds(hoppyIds);
    }

    /*** 保存hoppy,有id时更新，没有id时插入,并带回新的id，返回 hoppy*/
    @Override
    public Hoppy saveHoppy(Hoppy hoppy) {
        if (hoppy != null) {
            java.lang.Integer hoppyId = hoppy.getHoppyId();
            if (hoppyId != null) {
                insert(hoppy);
            } else {
                update(hoppy);
            }
        }
        return hoppy;
    }

    /*** 批量保存hoppys,有id时更新，没有id时插入,并带回新的id，返回 hoppys*/
    @Override
    public List<Hoppy> saveHoppys(List<Hoppy> hoppys) {
        for (Hoppy hoppy : hoppys) {
            this.saveHoppy(hoppy);
        }
        return hoppys;
    }

    @Override
    public <D> void assignBeanTo(Collection<D> dests, Function<? super D, Integer> destGetMethod, BiConsumer<D, Hoppy> destSetMethod) {
        if (CollectionUtil.isNotEmpty(dests)) {
            Set<Integer> hoppyIds = CollectionUtil.toSet(dests, destGetMethod);
            List<Hoppy> hoppys = this.getHoppysByHoppyIds(new ArrayList<Integer>(hoppyIds));
            if (CollectionUtil.isNotEmpty(hoppys)) {
                CollectionUtil.setModelByList(dests, hoppys, destGetMethod, destSetMethod, Hoppy::getHoppyId);
            }
        }
    }
}