package com.imall.jos.bean.dao;

import org.apache.ibatis.annotations.Mapper;

import com.imall.jos.bean.entity.ExampleEntity;

/** 
 * @Project     jos 
 * @File        ExampleMapper.java 
 * @Package     com.imall.jos.bean.dao 
 * @Version     V1.0 
 * @Date        2017年6月22日 下午5:17:25 
 * @Author      leo
 */
@Mapper
public interface ExampleDao {
	
	public int insertExample(ExampleEntity exampleEntity);
}
