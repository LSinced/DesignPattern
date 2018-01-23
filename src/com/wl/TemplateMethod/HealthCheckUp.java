/**
 * add by wanglei at 2018-1-23 下午7:03:21
 * 
 */
package com.wl.TemplateMethod;

/**
 * @author wanglei
 * 2018-1-23 下午7:03:21
 * 模板方法模式：定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public abstract class HealthCheckUp {
	public final void checkUp(){
		makePlan();
		if (needCheck())
			checkPlan();		
		acceptPlan();
		distributeDate();
		orderDate();
	}

	/**
	 * add by wanglei at 2018-1-23 下午7:12:27
	 * 预约
	 */
	private void orderDate() {
		System.out.println("体检预约");
	}

	/**
	 * add by wanglei at 2018-1-23 下午7:12:25
	 * 分配专场
	 */
	public abstract void distributeDate();

	/**
	 * add by wanglei at 2018-1-23 下午7:12:23
	 * 接单
	 */
	public abstract void acceptPlan();

	/**
	 * add by wanglei at 2018-1-23 下午7:12:21
	 * 审核
	 */
	private void checkPlan() {
		System.out.println("保健中心审核订单");
	}

	/**
	 * add by wanglei at 2018-1-23 下午7:12:19
	 * 报名
	 */
	public abstract void makePlan();
	
	/**
	 * add by wanglei at 2018-1-23 下午7:17:04
	 * hook,钩子方法，是否需要审核
	 */
	public abstract boolean needCheck();
}
