/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @RentProxy.java
 * 功能概要  : 
 * 做成日期  : @2019年5月14日
 * 修改日期  :
 */
package com.zpf.proxy.staticproxy;
/** 
 * @author zpf
 * @version 1.0
 */

public class RentProxy implements RentFunction{
	
	private  RentFunction rentFunction;
	
	
	
	public RentProxy(RentFunction rentFunction) {
		this.rentFunction=rentFunction;
	}



	@Override
	public void rent() {
		afert();
		System.out.print("中介帮客户");
		rentFunction.rent();
		befero();
	}



	private void befero() {
		System.out.print(",和客户签合同");						
	}

	private void afert() {
		System.out.print("帮客户找房子,");		
	}

}
