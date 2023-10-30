package com.bean.definitionin.Inheritance.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StarterClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ObjectPropertyInheritance.xml");
		
		BaseClass parent = (BaseClass) context.getBean("baseClass");
		
		System.out.println(parent.child.getClassName());
		
	}
	
}
