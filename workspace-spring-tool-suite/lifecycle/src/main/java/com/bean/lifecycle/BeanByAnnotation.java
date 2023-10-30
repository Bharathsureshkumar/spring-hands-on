package com.bean.lifecycle;

import org.springframework.core.Ordered;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanByAnnotation implements Ordered{
	
	@PostConstruct
	public void init() {
		System.out.println("After BeanByAnnotation initialization by Spring .. ! 1");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Before BeanByAnnotation destroy by Spring .. ! 1");
	}
	
	
	@Override
	public int getOrder() {return 1;}
	
}
