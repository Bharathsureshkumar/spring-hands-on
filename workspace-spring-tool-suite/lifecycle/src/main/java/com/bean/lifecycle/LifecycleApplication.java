package com.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class LifecycleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LifecycleApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		BeanInitDestoyMethod bean = (BeanInitDestoyMethod) context.getBean("beanByMethods");
		
		
		//manually telling destoy the singleton beans in the Application context
		
		
		System.out.println();
		System.out.println();

		BeanByAnnotation bean_annotation = (BeanByAnnotation) context.getBean("beanByAnnotation");
		
		
		BeanByInterfaces bean_interface = (BeanByInterfaces) context.getBean("beanByInterface");
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
		
	}

}