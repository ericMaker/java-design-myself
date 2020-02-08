package com.myself.ProxyPattern;

public class ProxySubject implements Subject {
	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	//ʵ�����󷽷�
	@Override
	public void request() {
		this.beforeRequest();
		subject.request();
		this.afterRequest();
	}
	
	//����ǰ�ĳ���i
	private void beforeRequest() {
		//��������
	}
	
	//�����Ĳ���
	private void afterRequest() {
		//�ƺ���
	}

}
