/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @CloneDemo.java
 * 功能概要  : 
 * 做成日期  : @2018年12月24日
 * 修改日期  :
 */
package com.jcl.demo;
/** 
 * @author zpf
 * @version 1.0
 */

import org.junit.Test;

import com.jcl.pojo.Person;
import com.jcl.pojo.User;

public class CloneDemo {
	
	
	
	//@Test
	public void test01() {
		User user1 = new User("张三", 18, "湖北");
		User user2=user1;
		
		System.out.println("equals结果 :"+user1.equals(user2));
		System.out.println("==结果"+(user1==user2));	
		
		String str1="abc";
		String str2="abc";
		System.out.println("equals结果 :"+str1.equals(str2));
		System.out.println("==结果"+(str1==str2));	
		
	}
	
	
	@Test
	public void test2() throws CloneNotSupportedException {
		Person person=new Person();		
		person.setUsername("习大大");
		person.setAddress("中国");
		person.setAge("65");
		
		Person person2=(Person) person.clone();		
		System.out.println("person2==person-->结果 :"+(person2==person));
		System.out.println("person2.equals(person)-->结果 :"+person2.equals(person));
		
		Person person3=person;
		System.out.println("person3==person-->结果 :"+(person3==person));
		System.out.println("person3.equals(person)-->结果 :"+person3.equals(person));
		
		System.out.println(person.hashCode()+"----"+person2.hashCode()+"----"+person3.hashCode());
	}
	
	@Test
	public void test3(){
		String str= "hgfs";
		boolean flag = str.equals("hgfs");
		System.out.println(str.hashCode()/31/1024);
		System.out.println(str.hashCode()/31);
		System.out.println(str.hashCode());
		System.out.println();
		System.out.println(flag);
	}
}
