package com.bean.postprocessor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SampleClass2 {


	SampleClass2(){
		System.out.println("Sample 2 class constructor .. !");
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("Init method from SampleClass 2");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method from SampleClass 2");
	}
	
	
}
