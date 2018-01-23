/**
 * add by wanglei at 2018-1-23 上午11:34:30
 * 
 */
package com.wl.factory.method;

import com.wl.factory.model.LenovoComputer;
import com.wl.factory.model.LenovoKeyboard;
import com.wl.factory.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午11:34:30
 */
public class MethodTest {

	/**
	 * add by wanglei at 2018-1-23 上午11:34:30
	 */
	public static void main(String[] args) {
		LenoveFactory sf=new LenoveScreenFactory();
		LenoveFactory kf=new LenoveKeyboardFactory();
		LenoveFactory cf=new LenoveComputerFactory();
		LenovoScreen screen=(LenovoScreen) sf.createLenovo();
		LenovoKeyboard keyboard=(LenovoKeyboard) kf.createLenovo();
		LenovoComputer computer=(LenovoComputer) cf.createLenovo();
		computer.setScreen(screen);
		computer.setKeyboard(keyboard);
		computer.input();
		computer.display();

	}

}
