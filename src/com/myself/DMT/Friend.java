package com.myself.DMT;

public class Friend {
	//声明陌生实例
	private Stranger stranger = new Stranger();
	
	//访问
	public void forward() {
		stranger.strangerMethod();
	}
	
	//其他方法
	public void friendMethod() {
		System.out.println("这是朋友的方法");
	}
}
