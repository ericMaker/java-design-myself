package com.myself.SP;

public class SingleDemo {

	public static void main(String[] args) {
		// �����߳�A
		NumThread threadA = new NumThread("ThreadA");
		//�����߳�B
		NumThread threadB = new NumThread("ThreadB");
		//�����߳�
		threadA.run();
		threadB.run();
	}

}
