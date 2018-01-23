/**
 * add by wanglei at 2018-1-22 下午2:42:56
 * 
 */
package com.wl.singleton;

/**
 * @author wanglei
 * 2018-1-22 下午2:42:56
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 单例模式-饿汉模式：加载类时比懒汉模式要慢，获取对象时比懒汉模式快。线程安全。
 */
public class SingletonE {
	//创建一个私有化的构造方法
	private SingletonE(){}
	//创建一个类的实例
	private static SingletonE instance=new SingletonE();
	//提供一个公共的获取实例的方法
	public static SingletonE getInstance(){
		return instance;
	}
}
