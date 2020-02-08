package com.myself.PrototypePattern.sample;

public class Client {
	public void operation(Prototype example) {
		
		//得到example的副本
		Prototype prototype = example.clone();
	}
}
