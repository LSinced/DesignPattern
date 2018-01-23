/**
 * add by wanglei at 2018-1-23 下午4:16:32
 * 
 */
package com.wl.adapter;

/**
 * @author wanglei
 * 2018-1-23 下午4:16:32
 * 适配器模式：将一个类的接口适配成用户所期待的。
 * 举例：现有一部使用SIM卡的手机和一张MicroSIM卡，若要用这部手机打电话，就必须使用适配器将MicroSIM卡装在手机上。
 */
public class AdapterTest {

	/**
	 * add by wanglei at 2018-1-23 下午4:16:32
	 */
	public static void main(String[] args) {
		MobilePhone mPhone=new MobilePhone();
		MicroSim microSim=new MicroSim();
		SimAdapter adapter=new SimAdapter(microSim);
		mPhone.setSim(adapter);
		mPhone.call();
		
		MobilePhone mPhone2=new MobilePhone();
		SimAdapter2 adapter2=new SimAdapter2();
		mPhone2.setSim(adapter2);
		mPhone2.call();
	}

}
