/**
 * Copyright (C) 2009 武汉金策略信息科技有限公司
 *
 * 版权所有。
 *
 * 类名　　  : @pojo.java
 * 功能概要  : 
 * 做成日期  : @2018年12月24日
 * 修改日期  :
 */
package com.jcl.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Value;

/** 
 * @author zpf
 * @version 1.0
 */
/*
 * @Data注解在类上，会为类的所有属性自动生成setter/getter、equals、
 * canEqual、hashCode、toString方法，如为final属性，
 * 则不会为该属性生成setter方法。
 */

public class Person  implements Cloneable{
	
	@Getter @Setter
	private String username;
	
	@Getter @Setter
	private String age;
	
	@Getter @Setter
	private String address;

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==null||obj==null) {
			return false;
		}
		
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p=(Person)obj;
		
		return this.username==p.username&&this.username==p.username&&this.address==p.address;
	}
	
	@Override
	public int hashCode() {
		int hash=0;
		if(this.hashCode()==hash) {
			
		}
		
		return super.hashCode();
	}
}
