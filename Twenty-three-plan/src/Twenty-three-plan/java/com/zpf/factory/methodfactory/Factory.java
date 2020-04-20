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
package com.zpf.factory.methodfactory;

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
	public Car getCar(String str) {
		try {
			if(str.equalsIgnoreCase("BUS")) {
				System.out.println("您生产了一辆BUS");
				return new BusFactory().getCar();
			}else if(str.equalsIgnoreCase("BIKE")) {
				System.out.println("您生产了一辆BIKE");
				return new BikeFactory().getCar();
			}else {
				System.out.println("输入产品名称有误");
				return null;
			}
		} catch (Exception e) {
			System.out.println("生产产品异常----");
			return null;
		}				
	}
}
