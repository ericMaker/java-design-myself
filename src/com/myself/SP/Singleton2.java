package com.myself.SP;

public class Singleton2 {
	private static Singleton2 _instatnce = null;
	
	//���췽��˽�У���֤����޷�ֱ��ʵ����
	private Singleton2() {
	}
	
	//����ͬ��
	synchronized public static Singleton2 getInstance() {
		if(_instatnce == null) {
			_instatnce = new Singleton2();
		}
		return _instatnce;
	}
}
