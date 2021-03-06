/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @Factory.java
 * 功能概要  : 
 * 做成日期  : @2019年2月18日
 * 修改日期  :
 */
package com.zpf.factory.abstractfacotory;

import com.zpf.factory.methodfactory.BikeFactory;
import com.zpf.factory.methodfactory.BusFactory;
import com.zpf.factory.methodfactory.Car;

/** 
 * @author zpf
 * @version 1.0
 */
public class Factory  {
	
	private static Factory factory;
	
	private  Factory() {}

	public static Factory getFactory() {
		if (factory==null) {
			synchronized (Factory.class) {
				if(factory==null) {
				 factory = new Factory();	
				}
			}
		}
		return factory;
	}
	public CarFactory getCarFactory(String str) {
		try {
			if(str.equalsIgnoreCase("china")) {
				System.out.println("中国制造开始生产");
				return new ChinaCarFactory();
			}else if(str.equalsIgnoreCase("interna")) {
				System.out.println("世界制造开始生产");
				return new InternaCarFactory();
			}else {
				System.out.println("输入工厂不存在");
				return null;
			}
		} catch (Exception e) {
			System.out.println("工厂打开异常----");
			return null;
		}				
	}
}
