/**
 * add by wanglei at 2018-1-23 下午2:06:09
 * 
 */
package com.wl.factory.abstracts;

import org.junit.runner.Computer;

import com.wl.factory.interf.Calculate;
import com.wl.factory.interf.Display;
import com.wl.factory.interf.Input;
import com.wl.factory.model.HpComputer;
import com.wl.factory.model.HpKeyboard;
import com.wl.factory.model.HpScreen;

/**
 * @author wanglei
 * 2018-1-23 下午2:06:09
 */
public class HpFactory implements ComputerFactory {

	/* (non-Javadoc)
	 * @see com.wl.factory.abstracts.ComputerFactory#createInput()
	 */
	@Override
	public Input createInput() {
		// TODO Auto-generated method stub
		return new HpKeyboard();
	}

	/* (non-Javadoc)
	 * @see com.wl.factory.abstracts.ComputerFactory#createDisplay()
	 */
	@Override
	public Display createDisplay() {
		// TODO Auto-generated method stub
		return new HpScreen();
	}

	/* (non-Javadoc)
	 * @see com.wl.factory.abstracts.ComputerFactory#createCalculate()
	 */
	@Override
	public Calculate createCalculate() {
		// TODO Auto-generated method stub
		return new HpComputer();
	}

}
