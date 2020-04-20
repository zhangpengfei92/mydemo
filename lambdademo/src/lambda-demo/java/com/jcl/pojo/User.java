/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @User.java
 * 功能概要  : 
 * 做成日期  : @2018年12月14日
 * 修改日期  :
 */
package com.jcl.pojo;
/** 
 * @author zpf
 * @version 1.0
 */
public class User {
	
	private String username;
	
	private Integer age;
	
	private String address;
	
	

	public User(String username, Integer age, String address) {
		super();
		this.username = username;
		this.age = age;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", address=" + address + "]";
	}
	
}
