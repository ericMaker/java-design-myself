package com.myself.adapterPattern.sample;

public class Client {
	public static void main(String[] args) {
		//������ģʽӦ��
		Target target = new Adapter();
		target.request();
	}

}
