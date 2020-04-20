/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @CarFactory.java
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
 * 抽象工厂模式 -- 
 * 		
 * 		通一定义车的生产标准 无论生产什么车都要按照标准来
 * （即CarFactory接口） 类似什么国际标准ISO99081
 */
public interface CarFactory {
	
	Bus getBus();
	
	Bike getBike();
	
	Mache getMache();
}
