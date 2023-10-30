package com.spring.springTest.game;

import org.springframework.stereotype.Component;

@Component("contra")
public class ContraGame implements Game {

	@Override
	public String toString() {
		return "From ContraGame .. !";
	}
	
	
	@Override
	public void up() {
		System.out.println("Go UP");

	}

	@Override
	public void down() {
		System.out.println("Go DOWN");

	}

	@Override
	public void left() {
		System.out.println("Go LEFT");

	}

	@Override
	public void right() {
		System.out.println("Go RIGHT");

	}

}
