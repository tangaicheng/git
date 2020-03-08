package com.lk.test;

import java.io.InputStream;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lk.dao.Cst_customerDao;
//import com.lk.dao.StudentDao;
import com.lk.pojo.Cst_customer;
//import com.lk.pojo.Student;

public class Demo {
	
	
	@Test
	public  void  test1() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		//����sqlSession
		SqlSession session = factory.openSession();
		Cst_customerDao mapper = session.getMapper(Cst_customerDao.class);
		Cst_customer cst_customer = mapper.findById(1);
		
		System.out.println(cst_customer);
		
	}
	@Test
	public  void  test2() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		//����sqlSession
		SqlSession session = factory.openSession();
		Cst_customerDao mapper = session.getMapper(Cst_customerDao.class);
		 List<Cst_customer> list = mapper.findAll();
		for(Cst_customer c :list){
			System.out.println(c);
		}
		
	}
	@Test
	public  void  test3() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		//����sqlSession
		SqlSession session = factory.openSession();
		Cst_customerDao mapper = session.getMapper(Cst_customerDao.class);
		SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-DD");
		Date parse = dateFormat.parse("2019-04-01");
		Cst_customer  c= new Cst_customer(33, "С��", "12", "123", "123", "123123", "123123", parse, "123123", 123, 123,"123");
		int add = mapper.add(c);
		if(add>0){
			System.out.println("��ӳɹ�");
			
		}
		session.commit();
		session.close();
	}
	@Test
	public  void  test4() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		//����sqlSession
		SqlSession session = factory.openSession();
		Cst_customerDao mapper = session.getMapper(Cst_customerDao.class);
		Cst_customer  c=new Cst_customer();
		c.setCust_id(33);
		int delete = mapper.delete(c);
		if(delete>0){
			System.out.println("ɾ���ɹ�");
		}
		
		session.commit();
		session.close();
	}
	@Test
	public  void  test5() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		//����sqlSession
		SqlSession session = factory.openSession();
		Cst_customerDao mapper = session.getMapper(Cst_customerDao.class);
		Cst_customer  c=new Cst_customer();
		c.setCust_id(29);
		c.setCust_name("С��");
		c.setCust_source("��V��");
		int update = mapper.update(c);
		if(update>0){
			System.out.println("�޸ĳɹ�");
		}
		
		session.commit();
		session.close();
	}
}
