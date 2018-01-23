/**
 * add by wanglei at 2018-1-23 下午4:45:31
 * 
 */
package com.wl.adapter;

/**
 * @author wanglei
 * 2018-1-23 下午4:45:31
 * 使用SIM卡的手机
 */
public class MobilePhone {
	private Sim sim;
	
	public MobilePhone() {
		super();
	}

	public MobilePhone(Sim sim) {
		super();
		this.sim = sim;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public void call(){
		sim.callBySim();
	}
}
