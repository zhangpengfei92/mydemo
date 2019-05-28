/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @TestFactory.java
 * 功能概要  : 
 * 做成日期  : @2019年3月26日
 * 修改日期  :
 */
package com.zpf.factory.abstractfacotory;

import java.util.Scanner;


/** 
 * @author zpf
 * @version 1.0
 */
public class TestFactory {
	
	public static void main(String[] args) {
		System.out.println("-------------欢迎进入上班工具生产系统-----------------");
		for (int i = 5; i >=0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println("请等待"+i+"秒");
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
		System.out.println("请输入你要生产的交通工具(china/interna)");
		
		try {
			scUtils();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void scUtils() throws Exception{
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String carname = sc.nextLine();
		if(carname==""||carname==null){
			System.out.println("输入有误，请重新输入");
			scUtils();
		}else {
			System.out.println(carname);
			  CarFactory carFactory = Factory.getFactory().getCarFactory(carname);
			
			if(carFactory!=null){
				carFactory.getBike();
				carFactory.getBus();
				carFactory.getMache();
			}else{
				System.out.println("生产汽车失败--");
			}
		}	
	}
}
