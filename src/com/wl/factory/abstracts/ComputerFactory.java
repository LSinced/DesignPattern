/**
 * add by wanglei at 2018-1-23 上午11:48:08
 * 
 */
package com.wl.factory.abstracts;

import com.wl.factory.interf.Calculate;
import com.wl.factory.interf.Display;
import com.wl.factory.interf.Input;

/**
 * @author wanglei
 * 2018-1-23 上午11:48:08
 */
public interface ComputerFactory {
	public Input createInput();
	public Display createDisplay();
	public Calculate createCalculate();
}
