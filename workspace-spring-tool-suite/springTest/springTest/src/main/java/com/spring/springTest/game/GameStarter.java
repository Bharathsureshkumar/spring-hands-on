package com.spring.springTest.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameStarter {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		
		
		Game contra = (Game) context.getBean("contra");
		
		GameRunner game = new GameRunner(contra);
		
		game.run();
		System.out.println("hashCode : " + game.hashCode());
		
//		Singleto scope test by creating two objects of a same class
		
		context = new AnnotationConfigApplicationContext(ConfigurationClassForSingleton.class);
		
		SingletonScopeEx singleton = context.getBean(SingletonScopeEx.class);
		
		singleton.setMessage("Object 1");
		singleton.getMessage();
		try {
		Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		SingletonScopeEx singleton3 = context.getBean(SingletonScopeEx.class);
		singleton3.getMessage();
		try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		SingletonScopeEx singleton4 = context.getBean(SingletonScopeEx.class);
		
		singleton4.getMessage();
		

	}
	
}
