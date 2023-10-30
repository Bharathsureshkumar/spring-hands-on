package com.spring.springTest.game;

import org.springframework.stereotype.Component;

@Component("mario")
public class MarioGame implements Game{

	public String toString() {
		return "Running Mario .. !";
	}
	
	public void up() {
		System.out.println("Going UP");
	}
	public void down() {
		System.out.println("Going DOWN");
	}
	public void left() {
		System.out.println("Going LEFT");
	}
	public void right() {
		System.out.println("Going RIGHT");
	}
}
