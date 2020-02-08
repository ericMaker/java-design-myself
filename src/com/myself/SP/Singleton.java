package com.myself.SP;


public class Singleton {
	private static Singleton m_instance = new Singleton();
	
	//构造方法私有，保证外界无法直接实例化
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		//通过该方法来获得实例化
		return m_instance;
	}
}
