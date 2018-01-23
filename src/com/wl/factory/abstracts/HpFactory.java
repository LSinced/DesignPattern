/**
 * add by wanglei at 2018-1-23 下午2:06:09
 * 
 */
package com.wl.factory.abstracts;

import org.junit.runner.Computer;

import com.wl.interf.Calculate;
import com.wl.interf.Display;
import com.wl.interf.Input;
import com.wl.model.HpComputer;
import com.wl.model.HpKeyboard;
import com.wl.model.HpScreen;

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
