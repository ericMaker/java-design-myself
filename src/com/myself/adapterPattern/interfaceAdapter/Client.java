package com.myself.adapterPattern.interfaceAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要覆盖需要使用的方法
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("使用了M1的方法");
			}
		};
		
		absAdapter.m1();
	}

}
