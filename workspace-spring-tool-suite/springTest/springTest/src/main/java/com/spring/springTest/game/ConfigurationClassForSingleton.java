package com.spring.springTest.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClassForSingleton {
	@Bean
	public SingletonScopeEx getSingleTon() {
		return new SingletonScopeEx();
	}
	
	@Bean
	public PrototypeScopeEx getPrototype() {
		return new PrototypeScopeEx();
	}
	
}
