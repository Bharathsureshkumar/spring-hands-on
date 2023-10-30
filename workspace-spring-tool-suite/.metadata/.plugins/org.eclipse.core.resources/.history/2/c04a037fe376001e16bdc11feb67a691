package com.bean.postprocessor;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SampleClass {

	SampleClass(){
		System.out.println("SampleClassConstructor .. !");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method from SampleClass");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method from SampleClass");
	}
	
}
