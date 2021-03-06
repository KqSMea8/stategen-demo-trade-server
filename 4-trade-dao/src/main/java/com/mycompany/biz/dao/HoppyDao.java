/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package com.mycompany.biz.dao;

import java.util.List;

import com.mycompany.biz.domain.Hoppy;
import org.springframework.dao.DataAccessException;
import org.stategen.framework.lite.PageList;

/**
 * HoppyDao
 * <pre>
 * database table: hoppy
 * database table comments: Hoppy
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅可以修改引用
 * </pre>
 */
public interface HoppyDao {

	/**
    <pre>
    &#64;ApiParam() Long hoppyId,
    &#64;ApiParam() String hoppyName
    ,&#64;ApiParam(hidden = true) Hoppy hoppy
    
    </pre>
	 * 
	 * sql:insert into hoppy ( create_time , update_time , delete_flag , hoppy_id , hoppy_name ) VALUES (CURRENT_TIMESTAMP(6),CURRENT_TIMESTAMP(6),0,?,?)
	 */
	public Hoppy insert(Hoppy hoppy) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("hoppyId") Long hoppyId
    
    </pre>
	 * 
	 * sql:UPDATE hoppy SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and hoppy_id = ?
	 */
	public Long delete(Long hoppyId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() String hoppyName,
    &#64;ApiParam() Long hoppyId
    ,&#64;ApiParam(hidden = true) Hoppy hoppy
    
    </pre>
	 * 
	 * sql:UPDATE hoppy SET update_time= CURRENT_TIMESTAMP(6) , hoppy_name = ? where delete_flag = 0 and hoppy_id = ?
	 */
	public Hoppy update(Hoppy hoppy) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("hoppyId") Long hoppyId
    
    </pre>
	 * 
	 * sql:select a.hoppy_id, a.hoppy_name, a.create_time, a.update_time, a.delete_flag from hoppy a where a.delete_flag = 0 and a.hoppy_id = ?
	 */
	public Hoppy getHoppyByHoppyId(Long hoppyId) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam() Long hoppyId,
    &#64;ApiParam()&#64;RequestParam(required =false,name="hoppyIds") ArrayList&lt;Long&gt; hoppyIds,
    &#64;ApiParam() String hoppyName,
    &#64;ApiParam() String hoppyNameLike,
    &#64;ApiParam() Date createTimeMin,
    &#64;ApiParam() Date createTimeMax,
    &#64;ApiParam() Date updateTimeMin,
    &#64;ApiParam() Date updateTimeMax
    ,&#64;ApiParam(hidden = true) Hoppy hoppy
    ,Pagination pagination
    </pre>
	 * 
	 * sql:select a.hoppy_id, a.hoppy_name, a.create_time, a.update_time, a.delete_flag from hoppy a where a.delete_flag = 0 and a.hoppy_id=? and a.hoppy_id in ( ? ) and a.hoppy_name=? and a.hoppy_name like CONCAT('%',?,'%') and a.create_time >=? and a.create_time <? and a.update_time >=? and a.update_time <? and 0 = 1 order by a.update_time desc, a.create_time desc
	 */
	public PageList<Hoppy> getHoppyPageList(Hoppy hoppy, int pageSize, int pageNum) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("hoppyId")&#64;RequestParam(required =false,name="hoppyIds") ArrayList&lt;Long&gt; hoppyIds
    
    </pre>
	 * 
	 * sql:select a.hoppy_id, a.hoppy_name, a.create_time, a.update_time, a.delete_flag from hoppy a where a.delete_flag = 0 and 1=0 and a.hoppy_id in ( ? ) order by a.update_time desc, a.create_time desc
	 */
	public List<Hoppy> getHoppysByHoppyIds(java.util.List<Long> hoppyIds) throws DataAccessException;
	
	/**
    <pre>
    &#64;ApiParam("hoppyId")&#64;RequestParam(required =false,name="hoppyIds") ArrayList&lt;Long&gt; hoppyIds
    
    </pre>
	 * 
	 * sql:UPDATE hoppy SET delete_flag = 1 , update_time = CURRENT_TIMESTAMP(6) where delete_flag = 0 and 1=0 and hoppy_id in ( ? )
	 */
	public java.util.List<Long> deleteByHoppyIds(java.util.List<Long> hoppyIds) throws DataAccessException;
	
	/**
    <pre>
    
    </pre>
	 * 
	 * sql:select a.hoppy_id, a.hoppy_name from hoppy a where a.delete_flag = 0
	 */
	public List<Hoppy> getHoppyOptions() throws DataAccessException;
	

}



