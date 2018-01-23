/**
 * add by wanglei at 2018-1-23 上午11:32:43
 * 
 */
package com.wl.factory.method;

import com.wl.factory.interf.Lenovo;
import com.wl.factory.model.LenovoComputer;

/**
 * @author wanglei
 * 2018-1-23 上午11:32:43
 */
public class LenoveComputerFactory implements LenoveFactory {

	/* (non-Javadoc)
	 * @see com.wl.factory.method.LenoveFactory#createLenovo()
	 */
	@Override
	public Lenovo createLenovo() {
		// TODO Auto-generated method stub
		return new LenovoComputer();
	}

}
