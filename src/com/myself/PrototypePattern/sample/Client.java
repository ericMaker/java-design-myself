package com.myself.PrototypePattern.sample;

public class Client {
	public void operation(Prototype example) {
		
		//�õ�example�ĸ���
		Prototype prototype = example.clone();
	}
}
