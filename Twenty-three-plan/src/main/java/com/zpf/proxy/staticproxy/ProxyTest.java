/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @ProxyTest.java
 * 功能概要  : 
 * 做成日期  : @2019年5月14日
 * 修改日期  :
 */
package com.zpf.proxy.staticproxy;
/** 
 * @author zpf
 * @version 1.0
 */
/*
 * 测试代理类
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		
		RentFunction my = new My();
		RentFunction proxy = new RentProxy(my);			
		proxy.rent();
	}
}
