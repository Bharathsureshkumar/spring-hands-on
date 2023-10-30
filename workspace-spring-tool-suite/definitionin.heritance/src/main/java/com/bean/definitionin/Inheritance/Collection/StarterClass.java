package com.bean.definitionin.Inheritance.Collection;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StarterClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionProperty.xml");
		
		ClassWithCollection base = (ClassWithCollection) context.getBean("classWithCollection");
		
		Iterator itr = base.getObjects().iterator();
		
		
		while(itr.hasNext()) {
			
			ObjectClass ob = (ObjectClass) itr.next();
			System.out.println(ob.getName());
			
		}
		
	}
	
}
