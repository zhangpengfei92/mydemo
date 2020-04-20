/**

 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @Test.java
 * 功能概要  : 
 * 做成日期  : @2019年3月26日
 * 修改日期  :
 */
package com.zpf.factory.abstractfacotory;

import java.lang.reflect.Method;

/** 
 * @author zpf
 * @version 1.0
 */
public class Test {
		
	public static void main(String[] args) {
		Method[] methods = Bus.class.getMethods();
		Object object= new Object();
		for (Method method : methods) {
			Override declaredAnnotation = method.getDeclaredAnnotation(Override.class);
			if(method.isAnnotationPresent(Override.class)) {
				System.out.println(method.getName());
			}			
		}
	}
}
