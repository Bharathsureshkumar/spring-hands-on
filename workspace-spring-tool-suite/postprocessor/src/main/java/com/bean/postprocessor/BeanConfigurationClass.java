package com.bean.postprocessor;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bean.postprocessor")
public class BeanConfigurationClass {
	@Autowired
	private ApplicationContext context;
	@Autowired
	private ObjectFactory<SampleClass> provider;
	
	@Bean
	public SampleClass getSampleClass() {
		System.out.println("Returned instance of sampleClass .. !");
		return provider.getObject();
		
	}
	
	
}
