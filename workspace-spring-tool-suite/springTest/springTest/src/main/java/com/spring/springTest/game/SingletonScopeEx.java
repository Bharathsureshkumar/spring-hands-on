package com.spring.springTest.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


public class SingletonScopeEx {

	private String message;
//	@Autowired
//	private PrototypeScopeEx time;
	@Autowired
	private ApplicationContext context;
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println(this.message);
		context.getBean(PrototypeScopeEx.class).getTime();
	}
	
}
