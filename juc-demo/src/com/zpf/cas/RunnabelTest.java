/**
 * 
 *
 * 版权所有。
 *
 * 类名　　  : @Xx.java
 * 功能概要  : 
 * 做成日期  : @2019年5月7日
 * 修改日期  :
 */
package com.zpf.cas;
/** 
 * @author zpf
 * @version 1.0
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class RunnabelTest {
	
	static AtomicInteger  count =new AtomicInteger(0);
	static CountDownLatch cdl=new  CountDownLatch(1000);
	static int num = 0;
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i <1000; i++) {
			
				new Thread(() -> {
					for (int j = 0; j < 1000; j++) {
						num++;
					}
				}				
				).start();
			}				
		System.out.println(count);

	}
}


