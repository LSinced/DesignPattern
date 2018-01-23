/**
 * add by wanglei at 2018-1-23 上午10:47:48
 * 
 */
package com.wl.factory;

import com.wl.model.LenovoComputer;
import com.wl.model.LenovoKeyboard;
import com.wl.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午10:47:48
 */
public class NormalTest {

	/**
	 * add by wanglei at 2018-1-23 上午10:47:48
	 */
	public static void main(String[] args) {
		LenovoScreen screen=new LenovoScreen();
		LenovoKeyboard keyboard=new LenovoKeyboard();
		LenovoComputer computer=new LenovoComputer();
		computer.setScreen(screen);
		computer.setKeyboard(keyboard);
		computer.input();
		computer.display();
	}

}
