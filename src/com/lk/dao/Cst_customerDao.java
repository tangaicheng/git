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
	//����Id��ѯ
	@Select("SELECT * FROM  cst_customer WHERE cust_id=#{id}")
	public Cst_customer findById(Integer id);
	
	//��ѯȫ��
	@Select("SELECT * FROM  cst_customer")
	List<Cst_customer>findAll();

	//���
	@Insert("INSERT INTO cst_customer VALUES(#{cust_id},#{cust_name},#{cust_source},#{cust_level},#{cust_linkman},#{cust_phone},#{cust_mobile},#{cust_birthday},#{pic_filePath},#{cust_user_id},#{cust_create_id},#{cust_industry})")
	public int add(Cst_customer cs);
	//ɾ��
	@Delete("DELETE  FROM cst_customer WHERE cust_id = #{cust_id}")
	public int delete(Cst_customer cs);
	//�޸�
	@Update("UPDATE cst_customer SET cust_name=#{cust_name},cust_source=#{cust_source} WHERE cust_id=#{cust_id}")
	public int update(Cst_customer cs);
	//��������ѯ
	
	public List<Cst_customer>findCst_customerByparms(Cst_customer cs);
	//��������ѯ maps���ϴ������
	public List<Cst_customer>findByCst_customerMap(Map<String,Object>maps);
	
	/**
	 * ����String���͵�Id����
	 * @throws Exception
	 */
	
}
