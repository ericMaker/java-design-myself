package com.myself.SP;

public class Singleton2 {
	private static Singleton2 _instatnce = null;
	
	//构造方法私有，保证外界无法直接实例化
	private Singleton2() {
	}
	
	//方法同步
	synchronized public static Singleton2 getInstance() {
		if(_instatnce == null) {
			_instatnce = new Singleton2();
		}
		return _instatnce;
	}
}
