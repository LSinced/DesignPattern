/**
 * add by wanglei at 2018-1-23 下午2:02:11
 * 
 */
package com.wl.factory.model;

import com.wl.factory.interf.Display;
import com.wl.factory.interf.Hp;

/**
 * @author wanglei
 * 2018-1-23 下午2:02:11
 */
public class HpScreen implements Display, Hp {

	/* (non-Javadoc)
	 * @see com.wl.interf.Hp#getBrand()
	 */
	@Override
	public void getBrand() {
		// TODO Auto-generated method stub
		System.out.println("惠普");
	}

	/* (non-Javadoc)
	 * @see com.wl.interf.Display#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示功能");
	}

}
