/**
 * add by wanglei at 2018-1-22 下午2:46:33
 * 
 */
package com.wl.singleton;

/**
 * @author wanglei
 * 2018-1-22 下午2:46:33
 * 单例模式-懒汉模式：加载类时比饿汉模式快，获取对象时比饿汉模式慢。线程不安全。
 */
public class SingletonL {
	//私有化构造方法
	private SingletonL(){}
	//声明类的唯一实例，使用private static修饰
	private static SingletonL instance;
	//提供一个公共的获取实例的方法
	public static SingletonL getInstance(){
		if (instance==null) {
			instance=new SingletonL();
		}
		return instance;
	}
}
