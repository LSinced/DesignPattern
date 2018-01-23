/**
 * add by wanglei at 2018-1-23 下午7:21:09
 * 
 */
package com.wl.TemplateMethod;

/**
 * @author wanglei
 * 2018-1-23 下午7:21:09
 */
public class PublicCheck extends HealthCheckUp {

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#distributeDate()
	 */
	@Override
	public void distributeDate() {
		System.out.println("不需要分配专场，使用公共号源");
	}

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#acceptPlan()
	 */
	@Override
	public void acceptPlan() {
		System.out.println("不需要医院接单");
	}

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#makePlan()
	 */
	@Override
	public void makePlan() {
		System.out.println("报名公共号源");
	}

	/* (non-Javadoc)
	 * @see com.wl.TemplateMethod.HealthCheckUp#needCheck()
	 */
	@Override
	public boolean needCheck() {
		return false;
	}

}
