/**
 * add by wanglei at 2018-1-23 上午11:30:49
 * 
 */
package com.wl.factory.method;

import com.wl.interf.Lenovo;
import com.wl.model.LenovoKeyboard;

/**
 * @author wanglei
 * 2018-1-23 上午11:30:49
 */
public class LenoveKeyboardFactory implements LenoveFactory {

	/* (non-Javadoc)
	 * @see com.wl.factory.method.LenoveFactory#createLenovo()
	 */
	@Override
	public Lenovo createLenovo() {
		// TODO Auto-generated method stub
		return new LenovoKeyboard();
	}

}
