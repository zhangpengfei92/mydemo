/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @ChinaCarFactory.java
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
 * 根据车生产标准可以创建一个国产的汽车生产厂，只要按照这个标准，
 * 什么车都可以生产-这个都例如（长城汽车要生产汽车-必须要按照汽车行业标准才能生产）-即实现CarFactory接口
 */
public class ChinaCarFactory implements CarFactory{

	@Override
	public Bus getBus() {
		System.out.println("中国制造---生产了一辆bus");
		return new Bus();
	}

	@Override
	public Bike getBike() {
		System.out.println("中国制造--生产了一辆bike");
		return new Bike();
	}

	@Override
	public Mache getMache() {
		System.out.println("中国制造--生产了一辆mache");
		return new Mache();
	}

}
