/**
 * add by wanglei at 2018-1-23 上午10:58:19
 * 
 */
package com.wl.factory.simple;

import com.wl.factory.interf.Lenovo;
import com.wl.factory.model.LenovoComputer;
import com.wl.factory.model.LenovoKeyboard;
import com.wl.factory.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午10:58:19
 */
public class SimpleFactory {
	public static Lenovo getLenovoParts(Class<?> clazz){
		if (LenovoScreen.class.getName().equals(clazz.getName())) {
			return new LenovoScreen();
		}else if (LenovoKeyboard.class.getName().equals(clazz.getName())) {
			return new LenovoKeyboard();
		}else if (LenovoComputer.class.getName().equals(clazz.getName())) {
			return new LenovoComputer();
		}
		return null;
	}
}
