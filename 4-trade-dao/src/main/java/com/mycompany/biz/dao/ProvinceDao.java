/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.Province;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

/**
 * ProvinceDao
 * <pre>
 * database table: province
 * database table comments: Province
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public interface ProvinceDao {

	/**
    <pre>
    &#64;ApiParam() String provinceId,
    &#64;ApiParam() String name,
    &#64;ApiParam() String pycode
    ,&#64;ApiParam(hidden = true) Province province
    
    </pre>
	 * 
	 * sql:insert into province ( create_time , update_time , delete_flag , province_id , name , pycode ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?)
	 */
	public Province insert(Province province) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("provinceId") String provinceId
    
    </pre>
	 * 
	 * sql:UPDATE province SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and province_id = ?
	 */
	public String delete(String provinceId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String name,
    &#64;ApiParam() String pycode,
    &#64;ApiParam() String provinceId
    ,&#64;ApiParam(hidden = true) Province province
    
    </pre>
	 * 
	 * sql:UPDATE province SET update_time= CURRENT_TIMESTAMP(6) , name = ? , pycode = ? where delete_flag = 0 and province_id = ?
	 */
	public Province update(Province province) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("provinceId") String provinceId
    
    </pre>
	 * 
	 * sql:select a.province_id, a.name, a.pycode, a.create_time, a.update_time, a.delete_flag from province a where a.delete_flag = 0 and a.province_id = ?
	 */
	public Province getProvinceByProvinceId(String provinceId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String provinceId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="provinceIds") ArrayList&lt;String&gt; provinceIds,
    &#64;ApiParam() String name,
    &#64;ApiParam() String nameLike,
    &#64;ApiParam() String pycode,
    &#64;ApiParam() String pycodeLike,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax
    ,&#64;ApiParam(hidden = true) Province province
    ,Pagination pagination
    </pre>
	 * 
	 * sql:select a.province_id, a.name, a.pycode, a.create_time, a.update_time, a.delete_flag from province a where a.delete_flag = 0 and a.province_id=? and a.province_id in ( ? ) and a.name=? and a.name like CONCAT('%',?,'%') and a.pycode=? and a.pycode like CONCAT('%',?,'%') and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.update_time desc, a.create_time desc
	 */
	public PageList<Province> getProvincePageList(Province province, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("provinceId")&#64;RequestParam(required =false,name="provinceIds") ArrayList&lt;String&gt; provinceIds
    
    </pre>
	 * 
	 * sql:select a.province_id, a.name, a.pycode, a.create_time, a.update_time, a.delete_flag from province a where a.delete_flag = 0 and 1=0 and a.province_id in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<Province> getProvincesByProvinceIds(java.util.List<String> provinceIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("provinceId")&#64;RequestParam(required =false,name="provinceIds") ArrayList&lt;String&gt; provinceIds
    
    </pre>
	 * 
	 * sql:UPDATE province SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and province_id in ( ? )
	 */
	public java.util.List<String> deleteByProvinceIds(java.util.List<String> provinceIds) throws DataAccessException;
	
	/**
    <pre>
    
    </pre>
	 * 
	 * sql:select a.province_id, a.name from province a where a.delete_flag = 0
	 */
	public List<Province> getProvinces() throws DataAccessException;
	

}



