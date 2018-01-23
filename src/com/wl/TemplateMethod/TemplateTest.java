/**
 * add by wanglei at 2018-1-23 下午7:23:16
 * 
 */
package com.wl.TemplateMethod;

/**
 * @author wanglei
 * 2018-1-23 下午7:23:16
 */
public class TemplateTest {

	/**
	 * add by wanglei at 2018-1-23 下午7:23:16
	 */
	public static void main(String[] args) {
		HealthCheckUp nc=new NormalCheck();
		nc.checkUp();
		System.out.println("-------------------------------------------------");
		HealthCheckUp pc=new PublicCheck();
		pc.checkUp();

	}

}
