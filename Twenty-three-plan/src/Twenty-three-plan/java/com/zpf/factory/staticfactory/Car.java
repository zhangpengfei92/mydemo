/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @Car.java
 * 功能概要  : 
 * 做成日期  : @2019年1月30日
 * 修改日期  :
 */
package com.zpf.factory.staticfactory;
/** 
 * @author zpf
 * @version 1.0
 */
/*
 * 工厂模式 --- 静态工厂
 * 个人理解的工厂模式 ---静态工厂
 * 		1.java 是面试对象的语言，静态工厂可以理解为
 * 		人们需要车这个产品，首先的构建车这个标准（可以上班） -接口
 * 		car -所有的车都要按照car这个标准来，只有按照这
 * 		个标准来的才能是车这个产品（即需要实现Car接口）
 * 
 * 
 */
public interface Car {

	void gotowork();
}
