/**
 * add by wanglei at 2018-1-23 上午11:49:30
 * 
 */
package com.wl.factory.abstracts;

import com.wl.factory.interf.Calculate;
import com.wl.factory.interf.Display;
import com.wl.factory.interf.Input;
import com.wl.factory.model.LenovoComputer;
import com.wl.factory.model.LenovoKeyboard;
import com.wl.factory.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午11:49:30
 */
public class LenovoFactory implements ComputerFactory {

	/* (non-Javadoc)
	 * @see com.wl.factory.abstracts.ComputerFactory#createInput()
	 */
	@Override
	public Input createInput() {
		// TODO Auto-generated method stub
		return new LenovoKeyboard();
	}

	/* (non-Javadoc)
	 * @see com.wl.factory.abstracts.ComputerFactory#createDisplay()
	 */
	@Override
	public Display createDisplay() {
		// TODO Auto-generated method stub
		return new LenovoScreen();
	}

	/* (non-Javadoc)
	 * @see com.wl.factory.abstracts.ComputerFactory#createCalculate()
	 */
	@Override
	public Calculate createCalculate() {
		// TODO Auto-generated method stub
		return new LenovoComputer();
	}

}
