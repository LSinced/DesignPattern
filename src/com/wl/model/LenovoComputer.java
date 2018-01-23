/**
 * add by wanglei at 2018-1-23 上午10:42:01
 * 
 */
package com.wl.model;

import com.wl.interf.Calculate;
import com.wl.interf.Lenovo;

/**
 * @author wanglei
 * 2018-1-23 上午10:42:01
 */
public class LenovoComputer implements Lenovo,Calculate{
	private LenovoScreen screen;
	private LenovoKeyboard keyboard;
	public LenovoScreen getScreen() {
		return screen;
	}
	public void setScreen(LenovoScreen screen) {
		this.screen = screen;
	}
	public LenovoKeyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(LenovoKeyboard keyboard) {
		this.keyboard = keyboard;
	}
	/* (non-Javadoc)
	 * @see com.wl.factory.Lenovo#getBrand()
	 */
	@Override
	public void getBrand() {
		// TODO Auto-generated method stub
		System.out.println("联想");
	}
	
	public void input(){
		keyboard.input();
	}
	
	public void display(){
		screen.display();
	}
	/* (non-Javadoc)
	 * @see com.wl.factory.Calculate#add(int, int)
	 */
	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
}
