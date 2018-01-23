/**
 * add by wanglei at 2018-1-23 下午2:03:17
 * 
 */
package com.wl.factory.model;

import com.wl.factory.interf.Hp;
import com.wl.factory.interf.Input;

/**
 * @author wanglei
 * 2018-1-23 下午2:03:17
 */
public class HpKeyboard implements Input, Hp {

	/* (non-Javadoc)
	 * @see com.wl.interf.Hp#getBrand()
	 */
	@Override
	public void getBrand() {
		// TODO Auto-generated method stub
		System.out.println("惠普");
	}

	/* (non-Javadoc)
	 * @see com.wl.interf.Input#input()
	 */
	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("输入功能");
	}

}
