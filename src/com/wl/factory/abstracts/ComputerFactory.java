/**
 * add by wanglei at 2018-1-23 上午11:48:08
 * 
 */
package com.wl.factory.abstracts;

import com.wl.interf.Calculate;
import com.wl.interf.Display;
import com.wl.interf.Input;

/**
 * @author wanglei
 * 2018-1-23 上午11:48:08
 */
public interface ComputerFactory {
	public Input createInput();
	public Display createDisplay();
	public Calculate createCalculate();
}
