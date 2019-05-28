/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @InternaCarFactory.java
 * 功能概要  : 
 * 做成日期  : @2019年3月26日
 * 修改日期  :
 */
package com.zpf.factory.abstractfacotory;
/** 
 * @author zpf
 * @version 1.0
 */
/*
 * 国际汽车大厂（如大众）可以按照汽车生产标准生产不同型号的车
 */
public class InternaCarFactory implements CarFactory {

	@Override
	public Bus getBus() {
		
		System.out.println("国际汽车厂生产了一辆bus");
		return new Bus();
	}

	@Override
	public Bike getBike() {
		System.out.println("国际汽车厂生产了一辆Bike");
		return new Bike();
	}

	@Override
	public Mache getMache() {
		System.out.println("国际的汽车产无法生产马车");
		return null;
	}

}
