package com.bean.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class PostprocessorApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PostprocessorApplication.class, args);
		System.out.println("JAVA SPRING");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
	
		
		
		var context1 = new AnnotationConfigApplicationContext(BeanConfigurationClass.class);
		context1.getBean("sampleClass");
		context1.getBean("sampleClass");
		((AbstractApplicationContext)context).registerShutdownHook();
		
		
	
	}

}
