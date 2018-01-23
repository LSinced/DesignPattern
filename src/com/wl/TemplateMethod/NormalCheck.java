/**
 * add by wanglei at 2018-1-23 下午7:18:04
 * 
 */
package com.wl.TemplateMethod;

/**
 * @author wanglei
 * 2018-1-23 下午7:18:04
 */
public class NormalCheck extends HealthCheckUp {

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#distributeDate()
	 */
	@Override
	public void distributeDate() {
		System.out.println("分配专场");
	}

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#acceptPlan()
	 */
	@Override
	public void acceptPlan() {
		System.out.println("医院接单");
	}

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#makePlan()
	 */
	@Override
	public void makePlan() {
		System.out.println("专场报名");
	}

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#needCheck()
	 */
	@Override
	public boolean needCheck() {
		// TODO Auto-generated method stub
		return true;
	}

}
