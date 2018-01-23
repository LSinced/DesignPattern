/**
 * add by wanglei at 2018-1-23 下午4:49:01
 * 
 */
package com.wl.adapter;

/**
 * @author wanglei
 * 2018-1-23 下午4:49:01
 * MicroSIM卡适配器
 */
public class SimAdapter implements Sim {
	private MicroSim microSim; 
	
	@Override
	public void callBySim() {
		microSim.callByMicroSim();
	}

	public SimAdapter(MicroSim microSim) {
		super();
		this.microSim = microSim;
	}
	
}
