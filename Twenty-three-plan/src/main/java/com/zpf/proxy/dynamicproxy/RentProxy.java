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
package com.zpf.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @author zpf
 * @version 1.0
 */

public class RentProxy{
	
	private  Object targer;
	
	
	
	public Object CreatProxy(Object targer) {		
		this.targer=targer;
		Object proxy = Proxy.newProxyInstance(targer.getClass().getClassLoader(), 
				targer.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						afert();
						Object invoke = method.invoke(targer, args);
						befero();
						return null;
					}
				});
		return proxy;
	}

	private void befero() {
		System.out.print(",和客户签合同");						
	}

	private void afert() {
		System.out.print("帮客户找房子,");		
	}

}
