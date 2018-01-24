/**
 * add by wanglei at 2018-1-24 上午11:09:49
 * 
 */
package com.wl.strategy;

/**
 * @author wanglei
 * 2018-1-24 上午11:09:49
 */
public abstract class MobilePhone {
	private Game game;
	
	public abstract void sayBrand();
	
	public void call(){
		System.out.println("打电话功能");
	}
	
	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}
	
	public void playGame(){
		game.playGame();
	}
}
