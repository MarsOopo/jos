package com.imall.jos.bean.entity;

import java.io.Serializable;

/** 
 * @Project     jos 
 * @File        ExampleEntity.java 
 * @Package     com.imall.jos.bean.entity 
 * @Version     V1.0 
 * @Date        2017年6月22日 下午5:09:48 
 * @Author      leo
 */
@SuppressWarnings("serial")
public class ExampleEntity implements Serializable {

	private String aaa;
	
	private String bbb;

	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public String getBbb() {
		return bbb;
	}

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	
}
