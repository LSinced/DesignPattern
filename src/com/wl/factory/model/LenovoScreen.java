/**
 * add by wanglei at 2018-1-23 上午10:43:01
 * 
 */
package com.wl.factory.model;

import com.wl.factory.interf.Display;
import com.wl.factory.interf.Lenovo;

/**
 * @author wanglei
 * 2018-1-23 上午10:43:01
 */
public class LenovoScreen implements Lenovo,Display{
	@Override
	public void display(){
		System.out.println("显示功能");
	}

	/* (non-Javadoc)
	 * @see com.wl.factory.Lenovo#getBrand()
	 */
	@Override
	public void getBrand() {
		// TODO Auto-generated method stub
		System.out.println("联想");
	}
}
