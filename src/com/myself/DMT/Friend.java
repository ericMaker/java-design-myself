package com.myself.DMT;

public class Friend {
	//����İ��ʵ��
	private Stranger stranger = new Stranger();
	
	//����
	public void forward() {
		stranger.strangerMethod();
	}
	
	//��������
	public void friendMethod() {
		System.out.println("�������ѵķ���");
	}
}
