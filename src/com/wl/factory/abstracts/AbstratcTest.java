/**
 * add by wanglei at 2018-1-23 上午11:54:56
 * 
 */
package com.wl.factory.abstracts;

import com.wl.model.HpComputer;
import com.wl.model.HpKeyboard;
import com.wl.model.HpScreen;
import com.wl.model.LenovoComputer;
import com.wl.model.LenovoKeyboard;
import com.wl.model.LenovoScreen;

/**
 * @author wanglei
 * 2018-1-23 上午11:54:56
 */
public class AbstratcTest {

	/**
	 * add by wanglei at 2018-1-23 上午11:54:56
	 */
	public static void main(String[] args) {
		ComputerFactory lf=new LenovoFactory();
		LenovoScreen ls=(LenovoScreen) lf.createDisplay();
		LenovoKeyboard lk=(LenovoKeyboard) lf.createInput();
		LenovoComputer lc=(LenovoComputer) lf.createCalculate();
		lc.setKeyboard(lk);
		lc.setScreen(ls);
		lc.getBrand();
		lc.input();
		lc.display();
		
		ComputerFactory hf=new HpFactory();
		HpScreen hs=(HpScreen) hf.createDisplay();
		HpKeyboard hk=(HpKeyboard) hf.createInput();
		HpComputer hc=(HpComputer) hf.createCalculate();
		hc.setKeyBoard(hk);
		hc.setScreen(hs);
		hc.getBrand();
		hc.input();
		hc.display();
		hc.add(1, 5);

	}

}
