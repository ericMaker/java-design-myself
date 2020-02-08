package com.myself.SP;

public class SingleDemo {

	public static void main(String[] args) {
		// 创建线程A
		NumThread threadA = new NumThread("ThreadA");
		//创建线程B
		NumThread threadB = new NumThread("ThreadB");
		//启动线程
		threadA.run();
		threadB.run();
	}

}
