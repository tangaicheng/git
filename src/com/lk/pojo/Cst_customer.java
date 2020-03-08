package com.lk.pojo;

import java.io.Serializable;
import java.util.Date;

public class Cst_customer implements Serializable {
	
	
	
	private Integer cust_id;
	private String cust_name; 
	private String cust_source; 
	private String cust_level;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	private Date cust_birthday;
	private String pic_filePath;
	private Integer cust_user_id;
	private Integer cust_create_id;
	private String cust_industry;
	
	public Cst_customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_source() {
		return cust_source;
	}

	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}

	public String getCust_level() {
		return cust_level;
	}

	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}

	public String getCust_linkman() {
		return cust_linkman;
	}

	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}

	public String getCust_phone() {
		return cust_phone;
	}

	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	public String getCust_mobile() {
		return cust_mobile;
	}

	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	public Date getCust_birthday() {
		return cust_birthday;
	}

	public void setCust_birthday(Date cust_birthday) {
		this.cust_birthday = cust_birthday;
	}

	public String getPic_filePath() {
		return pic_filePath;
	}

	public void setPic_filePath(String pic_filePath) {
		this.pic_filePath = pic_filePath;
	}

	public Integer getCust_user_id() {
		return cust_user_id;
	}

	public void setCust_user_id(Integer cust_user_id) {
		this.cust_user_id = cust_user_id;
	}

	public Integer getCust_create_id() {
		return cust_create_id;
	}

	public void setCust_create_id(Integer cust_create_id) {
		this.cust_create_id = cust_create_id;
	}

	public String getCust_industry() {
		return cust_industry;
	}

	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}

	@Override
	public String toString() {
		return "Cst_customer [cust_id=" + cust_id + ", cust_name=" + cust_name
				+ ", cust_source=" + cust_source + ", cust_level=" + cust_level
				+ ", cust_linkman=" + cust_linkman + ", cust_phone="
				+ cust_phone + ", cust_mobile=" + cust_mobile
				+ ", cust_birthday=" + cust_birthday + ", pic_filePath="
				+ pic_filePath + ", cust_user_id=" + cust_user_id
				+ ", cust_create_id=" + cust_create_id + ", cust_industry="
				+ cust_industry + "]";
	}

	public Cst_customer(Integer cust_id, String cust_name, String cust_source,
			String cust_level, String cust_linkman, String cust_phone,
			String cust_mobile, Date cust_birthday, String pic_filePath,
			Integer cust_user_id, Integer cust_create_id, String cust_industry) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_source = cust_source;
		this.cust_level = cust_level;
		this.cust_linkman = cust_linkman;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_birthday = cust_birthday;
		this.pic_filePath = pic_filePath;
		this.cust_user_id = cust_user_id;
		this.cust_create_id = cust_create_id;
		this.cust_industry = cust_industry;
	}
	
	
}
