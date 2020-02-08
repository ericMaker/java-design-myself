package com.myself.PrototypePattern;

public class Mail implements Cloneable{
	private String receiver;
	private String subject;
	private String application;
	private String contxt;
	private String tail;
	
	//构造函数
	public Mail(String subject,String contxt) {
		this.subject = subject;
		this.contxt = contxt;
	}
	
	//克隆方法
	public Mail clone() {
		Mail mail = null;
		
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	
}
