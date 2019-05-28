/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @CarFactory.java
 * 功能概要  : 
 * 做成日期  : @2019年2月18日
 * 修改日期  :
 */
package com.zpf.factory.methodfactory;
/** 
 * @author zpf
 * @version 1.0
 */
/*
 * 方法工厂模式 --
 * 	个人理解 方法工厂 侧重方法-即生产car的方法（就是一套生产汽车的标准）
 *  然后当时生产力有限，自行车厂只能生产自行车，bus厂只能生产bug
 */
public interface CarFactory {

	Car getCar();
	
}
