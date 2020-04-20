/**

 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @Test.java
 * 功能概要  : 
 * 做成日期  : @2019年3月22日
 * 修改日期  :
 */
package com.zpf.demo;
/** 
 * @author zpf
 * @version 1.0
 */
public class Test {
	
	public static void main(String[] args) {
		
		Demo demo = DemoFactory.creatDemo();
		
		System.out.println(demo.show());
	}
}
