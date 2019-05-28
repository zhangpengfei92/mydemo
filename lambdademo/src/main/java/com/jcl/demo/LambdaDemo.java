/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @LambdaDemo.java
 * 功能概要  : 
 * 做成日期  : @2018年12月13日
 * 修改日期  :
 */
package com.jcl.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import com.jcl.pojo.User;

/** 
 * @author zpf
 * @version 1.0
 */
public class LambdaDemo {
	
	public static void main(String[] args) {
		
		newThread();
	}
	
	//Lambda表单代替匿名内部类--实现runnable线程实例
	public static void newThread() {
		System.out.println("hello world");		
		new Thread(() -> System.out.println("Hello Lambda!")).start();
	}
	//Lambda表单遍历list集合
	public static void testList() {
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("车牌号"+i);
		}
		list.forEach(str -> System.out.println(str));
		/**
		 * 1.stream().filter( Lambda)---替代for + if
		 * 2.stream().filter( Lambda).count();统计满足条件的数量
		 * 3.stream().filter( Lambda).findFirst();/返回满足条件的第一个值;
		 */
		
		long count = list.stream().filter(str -> str.endsWith("9")).count();
		System.out.println("统计满足条件的数量--"+count);
		Optional<String> findFirst = list.stream().filter(str -> str.endsWith("9")).findFirst();
		System.out.println("返回满足条件的第一个值--"+findFirst.get());
		Optional<String> findFirst2 = list.stream().findFirst();
		System.out.println("返回集合的第一个值--"+findFirst2.get());
		Optional<String> findAny = list.stream().findAny();	
		System.out.println(findAny.get());
		long count2 = list.stream().count();
		System.out.println("统计集合个数"+count2);	
	}
	//Lambda表单遍历Map集合
	public static void testMap(){
		Map<String, String> map= new HashMap<String,String>();
		
		for (int i = 0; i <10; i++) {
			map.put("key"+i,"value"+i);
		}
		map.forEach((key,value) -> System.out.println("key="+key+"    value="+value));
		
		map.forEach((key,value) -> {
			if(key.endsWith("9")) {
				System.out.println("key="+key+"value="+value);
			}else {
				System.out.println("sorry not fund 9");
			}
		});
	}
	
	public static void testStream(){
		List<User> ulist= new ArrayList<User>();
		
		for (int i = 0; i < 10; i++) {
			ulist.add(new User("爱德华"+i+"世", 15+i, "wuhan"+i));
		}
		
		ulist.forEach(user -> System.out.println(user));
	}
}
