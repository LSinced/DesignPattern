/**
 * add by wanglei at 2018-1-23 上午11:30:06
 * 
 */
package com.wl.factory.method;

import com.wl.factory.interf.Lenovo;
import com.wl.factory.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午11:30:06
 */
public class LenoveScreenFactory implements LenoveFactory {

	/* (non-Javadoc)
	 * @see com.wl.factory.method.LenoveFactory#createLenovo()
	 */
	@Override
	public Lenovo createLenovo() {
		// TODO Auto-generated method stub
		return new LenovoScreen();
	}

}
