package com.spring.springTest.game;

public class GameRunner {

	Game game;
	
	public GameRunner(Game mario) {
		this.game = mario;
	}
	
	public void run() {
		System.out.println(game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
