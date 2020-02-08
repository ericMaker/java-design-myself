package com.myself.ProxyPattern;

public class ProxySubject implements Subject {
	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	//实现请求方法
	@Override
	public void request() {
		this.beforeRequest();
		subject.request();
		this.afterRequest();
	}
	
	//请求前的出口i
	private void beforeRequest() {
		//处理内容
	}
	
	//请求后的操作
	private void afterRequest() {
		//善后处理
	}

}
