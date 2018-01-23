/**
 * add by wanglei at 2018-1-23 下午2:00:40
 * 
 */
package com.wl.factory.model;

import com.wl.factory.interf.Calculate;
import com.wl.factory.interf.Display;
import com.wl.factory.interf.Hp;
import com.wl.factory.interf.Input;

/**
 * @author wanglei
 * 2018-1-23 下午2:00:40
 */
public class HpComputer implements Hp,Calculate{
	private Input keyBoard;
	private Display screen;
	public Input getKeyBoard() {
		return keyBoard;
	}

	public void setKeyBoard(Input keyBoard) {
		this.keyBoard = keyBoard;
	}

	public Display getScreen() {
		return screen;
	}

	public void setScreen(Display screen) {
		this.screen = screen;
	}

	/* (non-Javadoc)
	 * @see com.wl.interf.Calculate#add(int, int)
	 */
	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	/* (non-Javadoc)
	 * @see com.wl.interf.Hp#getBrand()
	 */
	@Override
	public void getBrand() {
		System.out.println("惠普");
	}
	
	public void input(){
		keyBoard.input();
	}
	
	public void display(){
		screen.display();
	}
}
