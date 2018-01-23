/**
 * add by wanglei at 2018-1-23 上午10:44:22
 * 
 */
package com.wl.model;

import com.wl.interf.Input;
import com.wl.interf.Lenovo;

/**
 * @author wanglei
 * 2018-1-23 上午10:44:22
 */
public class LenovoKeyboard implements Lenovo,Input{
	@Override
	public void input(){
		System.out.println("输入功能");
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
