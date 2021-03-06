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

import com.mycompany.biz.dao.RegionDao;
import com.mycompany.biz.domain.Region;

/**
 * RegionDao
 * <pre>
 * database table: region
 * database table comments: Region
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public class RegionDaoImpl extends SqlMapClientDaoSupport implements RegionDao {

    /**
	 * 
	 * sql:insert into region ( create_time , update_time , delete_flag , region_id , parent_region_id , path , level , region_type , name , name_en , name_pinyin , code ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?,?,?,?,?,?,?)
	 */
    public Region insert(Region region) throws DataAccessException {
        if (region == null) {
            throw new IllegalArgumentException("Can't insert a null data object into db.");
        }
        getSqlMapClientTemplate().insert("insert.Region.trade", region);
        return region;
    }

    /**
	 * 
	 * sql:UPDATE region SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and region_id = ?
	 */
    public Long delete(Long regionId) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("regionId", regionId);
        getSqlMapClientTemplate().update("delete.Region.trade", params);
        return regionId;
    }

    /**
	 * 
	 * sql:UPDATE region SET update_time= CURRENT_TIMESTAMP(6) , parent_region_id = ? , path = ? , level = ? , region_type = ? , name = ? , name_en = ? , name_pinyin = ? , code = ? where delete_flag = 0 and region_id = ?
	 */
    public Region update(Region region) throws DataAccessException {
        if (region == null) {
            throw new IllegalArgumentException("Can't update by a null data object.");
        }
        getSqlMapClientTemplate().update("update.Region.trade", region);
        return region;
    }

    /**
	 * 
	 * sql:select a.region_id, a.parent_region_id, a.path, a.level, a.region_type, a.name, a.name_en, a.name_pinyin, a.code, a.create_time, a.update_time, a.delete_flag from region a where a.delete_flag = 0 and a.region_id = ?
	 */
    public Region getRegionByRegionId(Long regionId) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("regionId", regionId);
        return (Region) getSqlMapClientTemplate().queryForObject("getRegionByRegionId.Region.trade", params);
    }

    /**
	 * 
	 * sql:select a.region_id, a.parent_region_id, a.path, a.level, a.region_type, a.name, a.name_en, a.name_pinyin, a.code, a.create_time, a.update_time, a.delete_flag from region a where a.delete_flag = 0 and a.region_id=? and a.region_id in ( ? ) and a.parent_region_id=? and a.parent_region_id in ( ? ) and a.path=? and a.path like CONCAT('%',?,'%') and a.level >=? and a.level <? and a.region_type=? and a.region_type in ( ? ) and a.name=? and a.name like CONCAT('%',?,'%') and a.name_en=? and a.name_en like CONCAT('%',?,'%') and a.name_pinyin=? and a.name_pinyin like CONCAT('%',?,'%') and a.code=? and a.code like CONCAT('%',?,'%') and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.region_id
	 */
    @SuppressWarnings("unchecked")
    public PageList<Region> getRegionPageList(Region region, int pageSize, int pageNum) throws DataAccessException {
        return (PageList<Region>) PageQueryUtils.pageQuery(getSqlMapClientTemplate(), "getRegionPageList.Region.trade", region, pageNum, pageSize);
    }

    /**
	 * 
	 * sql:select a.region_id, a.parent_region_id, a.path, a.level, a.region_type, a.name, a.name_en, a.name_pinyin, a.code, a.create_time, a.update_time, a.delete_flag from region a where a.delete_flag = 0 and 1=0 and a.region_id in ( ? ) order by a.region_id
	 */
    @SuppressWarnings("unchecked")
    public List<Region> getRegionsByRegionIds(java.util.List<Long> regionIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("regionIds", regionIds);
        return (List<Region>) getSqlMapClientTemplate().queryForList("getRegionsByRegionIds.Region.trade", params);
    }

    /**
	 * 
	 * sql:UPDATE region SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and region_id in ( ? )
	 */
    public java.util.List<Long> deleteByRegionIds(java.util.List<Long> regionIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("regionIds", regionIds);
        getSqlMapClientTemplate().update("deleteByRegionIds.Region.trade", params);
        return regionIds;
    }

    /**
	 * 
	 * sql:select a.region_id, a.parent_region_id, a.region_type, a.name, a.name_en, a.name_pinyin, a.code, not exists( SELECT b.region_id from region b where b.parent_region_id=a.region_id) as isLeaf from region a where a.delete_flag = 0 and a.parent_region_id in ( ? ) and a.parent_region_id =0
	 */
    @SuppressWarnings("unchecked")
    public List<Region> getRegionOptions(java.util.List<Long> parentRegionIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("parentRegionIds", parentRegionIds);
        return (List<Region>) getSqlMapClientTemplate().queryForList("getRegionOptions.Region.trade", params);
    }

    /**
	 * 
	 * sql:select a.region_id, a.parent_region_id, a.region_type, a.name, a.name_en, a.name_pinyin, a.code, not exists( SELECT b.region_id from region b where b.parent_region_id=a.region_id) as isLeaf from region a where a.delete_flag = 0 and 1=0 and a.region_id in ( ? ) order by a.region_id
	 */
    @SuppressWarnings("unchecked")
    public List<Region> getRegionsWithIsLeafByRegionIds(java.util.List<Long> regionIds) throws DataAccessException {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("regionIds", regionIds);
        return (List<Region>) getSqlMapClientTemplate().queryForList("getRegionsWithIsLeafByRegionIds.Region.trade", params);
    }
}
