/**
 * add by wanglei at 2018-1-24 上午11:12:09
 * 
 */
package com.wl.strategy;

/**
 * @author wanglei
 * 2018-1-24 上午11:12:09
 */
public class PhoneTest {

	/**
	 * add by wanglei at 2018-1-24 上午11:12:09
	 */
	public static void main(String[] args) {
		MobilePhone s8=new GalaxyS8();
		s8.sayBrand();
		s8.call();
		Jump jump=new Jump();
		s8.setGame(jump);
		s8.playGame();
		
		System.out.println("---------------------------------------");
		
		MobilePhone ix=new IphoneX();
		ix.sayBrand();
		ix.call();
		LandLoad ll=new LandLoad();
		ix.setGame(ll);
		ix.playGame();

	}

}
