package com.lk.dao;

import java.util.Date;
import java.util.List;


import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lk.pojo.Cst_customer;


public interface Cst_customerDao {
	//根据Id查询
	@Select("SELECT * FROM  cst_customer WHERE cust_id=#{id}")
	public Cst_customer findById(Integer id);
	
	//查询全部
	@Select("SELECT * FROM  cst_customer")
	List<Cst_customer>findAll();

	//添加
	@Insert("INSERT INTO cst_customer VALUES(#{cust_id},#{cust_name},#{cust_source},#{cust_level},#{cust_linkman},#{cust_phone},#{cust_mobile},#{cust_birthday},#{pic_filePath},#{cust_user_id},#{cust_create_id},#{cust_industry})")
	public int add(Cst_customer cs);
	//删除
	@Delete("DELETE  FROM cst_customer WHERE cust_id = #{cust_id}")
	public int delete(Cst_customer cs);
	//修改
	@Update("UPDATE cst_customer SET cust_name=#{cust_name},cust_source=#{cust_source} WHERE cust_id=#{cust_id}")
	public int update(Cst_customer cs);
	//多条件查询
	
	public List<Cst_customer>findCst_customerByparms(Cst_customer cs);
	//多条件查询 maps集合传入参数
	public List<Cst_customer>findByCst_customerMap(Map<String,Object>maps);
	
	/**
	 * 测试String类型的Id自增
	 * @throws Exception
	 */
	
}
