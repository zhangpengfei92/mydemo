/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @My.java
 * 功能概要  : 
 * 做成日期  : @2019年5月14日
 * 修改日期  :
 */
package com.zpf.proxy.dynamicproxy;
/** 
 * @author zpf
 * @version 1.0
 */
public class My implements RentFunction{

	@Override
	public void rent() {
		System.out.print("租房子");
	}

}
