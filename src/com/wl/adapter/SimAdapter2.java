/**
 * add by wanglei at 2018-1-23 下午5:01:07
 * 
 */
package com.wl.adapter;

/**
 * @author wanglei
 * 2018-1-23 下午5:01:07
 */
public class SimAdapter2 extends MicroSim implements Sim {

	@Override
	public void callBySim() {
		this.callByMicroSim();
	}

}
