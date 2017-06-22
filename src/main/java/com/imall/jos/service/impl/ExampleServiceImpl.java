package com.imall.jos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imall.jos.bean.dao.ExampleDao;
import com.imall.jos.bean.entity.ExampleEntity;
import com.imall.jos.service.IExampleService;

/** 
 * @Project     jos 
 * @File        ExampleServiceImpl.java 
 * @Package     com.imall.jos.service.impl 
 * @Version     V1.0 
 * @Date        2017年6月22日 下午5:22:15 
 * @Author      leo
 */
@Service
public class ExampleServiceImpl implements IExampleService{

	@Autowired
	private ExampleDao exampleDao;
	
	@Override
	public boolean insertExample(ExampleEntity exampleEntity) {
		
		return exampleDao.insertExample(exampleEntity) > 0;
		
	}

}
