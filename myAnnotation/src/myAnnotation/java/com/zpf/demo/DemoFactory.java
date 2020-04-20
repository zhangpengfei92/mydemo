/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @DemoFactory.java
 * 功能概要  : 
 * 做成日期  : @2019年3月22日
 * 修改日期  :
 */
package com.zpf.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.sun.org.apache.xml.internal.security.Init;

/** 
 * @author zpf
 * @version 1.0
 */
public class DemoFactory {
	
	public static Demo creatDemo() {
		Demo demo = new Demo();
		try {
			Method[] methods = Demo.class.getMethods();
			
			for (Method method : methods) {
				if(method.isAnnotationPresent(MyAnnotation.class)) {
					MyAnnotation myAnnotation = method.getDeclaredAnnotation(MyAnnotation.class);
					method.invoke(demo, null);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("初始化注解异常");
		}finally {
			System.out.println("初始化注解");
		}
		
		return demo;
		
	}
}
