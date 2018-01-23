/**
 * add by wanglei at 2018-1-23 上午11:08:46
 * 
 */
package com.wl.factory.simple;

import com.wl.model.LenovoComputer;
import com.wl.model.LenovoKeyboard;
import com.wl.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午11:08:46
 */
public class SimpleFactoryTest {

	/**
	 * add by wanglei at 2018-1-23 上午11:08:46
	 */
	public static void main(String[] args) {
		LenovoScreen screen=(LenovoScreen) SimpleFactory.getLenovoParts(LenovoScreen.class);
		LenovoKeyboard keyboard=(LenovoKeyboard) SimpleFactory.getLenovoParts(LenovoKeyboard.class);
		LenovoComputer computer=(LenovoComputer) SimpleFactory.getLenovoParts(LenovoComputer.class);
		computer.setKeyboard(keyboard);
		computer.setScreen(screen);
		computer.input();
		computer.display();
	}

}
