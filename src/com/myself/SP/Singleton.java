package com.myself.SP;


public class Singleton {
	private static Singleton m_instance = new Singleton();
	
	//���췽��˽�У���֤����޷�ֱ��ʵ����
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		//ͨ���÷��������ʵ����
		return m_instance;
	}
}
