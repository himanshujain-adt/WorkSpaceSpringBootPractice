package com.example.common;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseCtl <F extends BaseForm,T extends BaseDTO,S extends BaseServiceInt<T>>{
	
	@Autowired
	  protected S baseService;
	

	
	

}
