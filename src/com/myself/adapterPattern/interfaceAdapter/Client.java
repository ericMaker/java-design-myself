package com.myself.adapterPattern.interfaceAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫ������Ҫʹ�õķ���
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("ʹ����M1�ķ���");
			}
		};
		
		absAdapter.m1();
	}

}
