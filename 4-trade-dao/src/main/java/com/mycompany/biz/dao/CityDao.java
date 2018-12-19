/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.City;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

/**
 * CityDao
 * <pre>
 * database table: city
 * database table comments: City
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public interface CityDao {

	/**
    <pre>
    &#64;ApiParam() String cityId,
    &#64;ApiParam() String name,
    &#64;ApiParam() String pycode,
    &#64;ApiParam() String provinceId,
    &#64;ApiParam() String postcode,
    &#64;ApiParam() String areacode
    ,&#64;ApiParam(hidden = true) City city
    
    </pre>
	 * 
	 * sql:insert into city ( create_time , update_time , delete_flag , city_id , name , pycode , province_id , postcode , areacode ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?,?,?,?,?)
	 */
	public City insert(City city) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("cityId") String cityId
    
    </pre>
	 * 
	 * sql:UPDATE city SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and city_id = ?
	 */
	public String delete(String cityId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String name,
    &#64;ApiParam() String pycode,
    &#64;ApiParam() String provinceId,
    &#64;ApiParam() String postcode,
    &#64;ApiParam() String areacode,
    &#64;ApiParam() String cityId
    ,&#64;ApiParam(hidden = true) City city
    
    </pre>
	 * 
	 * sql:UPDATE city SET update_time= CURRENT_TIMESTAMP(6) , name = ? , pycode = ? , province_id = ? , postcode = ? , areacode = ? where delete_flag = 0 and city_id = ?
	 */
	public City update(City city) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("cityId") String cityId
    
    </pre>
	 * 
	 * sql:select a.city_id, a.name, a.pycode, a.province_id, a.postcode, a.areacode, a.create_time, a.update_time, a.delete_flag from city a where a.delete_flag = 0 and a.city_id = ?
	 */
	public City getCityByCityId(String cityId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String cityId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="cityIds") ArrayList&lt;String&gt; cityIds,
    &#64;ApiParam() String name,
    &#64;ApiParam() String nameLike,
    &#64;ApiParam() String pycode,
    &#64;ApiParam() String pycodeLike,
    &#64;ApiParam() String provinceId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="provinceIds") ArrayList&lt;String&gt; provinceIds,
    &#64;ApiParam() String postcode,
    &#64;ApiParam() String postcodeLike,
    &#64;ApiParam() String areacode,
    &#64;ApiParam() String areacodeLike,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax
    ,&#64;ApiParam(hidden = true) City city
    ,Pagination pagination
    </pre>
	 * 
	 * sql:select a.city_id, a.name, a.pycode, a.province_id, a.postcode, a.areacode, a.create_time, a.update_time, a.delete_flag from city a where a.delete_flag = 0 and a.city_id=? and a.city_id in ( ? ) and a.name=? and a.name like CONCAT('%',?,'%') and a.pycode=? and a.pycode like CONCAT('%',?,'%') and a.province_id=? and a.province_id in ( ? ) and a.postcode=? and a.postcode like CONCAT('%',?,'%') and a.areacode=? and a.areacode like CONCAT('%',?,'%') and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.update_time desc, a.create_time desc
	 */
	public PageList<City> getCityPageList(City city, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("cityId")&#64;RequestParam(required =false,name="cityIds") ArrayList&lt;String&gt; cityIds
    
    </pre>
	 * 
	 * sql:select a.city_id, a.name, a.pycode, a.province_id, a.postcode, a.areacode, a.create_time, a.update_time, a.delete_flag from city a where a.delete_flag = 0 and 1=0 and a.city_id in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<City> getCitysByCityIds(java.util.List<String> cityIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("cityId")&#64;RequestParam(required =false,name="cityIds") ArrayList&lt;String&gt; cityIds
    
    </pre>
	 * 
	 * sql:UPDATE city SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and city_id in ( ? )
	 */
	public java.util.List<String> deleteByCityIds(java.util.List<String> cityIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("provinceId") String provinceId
    
    </pre>
	 * 
	 * sql:select a.city_id, a.name, a.province_id from city a where a.delete_flag = 0 and a.province_id = ?
	 */
	public List<City> getCitys(String provinceId) throws DataAccessException;
	

}



