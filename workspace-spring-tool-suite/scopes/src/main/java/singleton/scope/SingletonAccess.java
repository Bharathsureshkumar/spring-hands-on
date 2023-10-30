package singleton.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonAccess {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("singletonSpring.xml");
		
		var singleton = (SingletonScopeClass) context.getBean("singleton");
		System.out.println("After creating a 1'st object of singletonClasss");
		singleton.setMessage("This is from object 1 .. !");
		singleton.getMessage();
		System.out.println("After creating 2'nd object of singletonClass");
		var singleton1 = (SingletonScopeClass) context.getBean("singleton");
		System.out.println("This is from object 2 .. !");
		singleton1.getMessage();
		
		
	}
	
}
