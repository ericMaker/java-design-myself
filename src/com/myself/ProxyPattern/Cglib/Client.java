package com.myself.ProxyPattern.Cglib;

public class Client {
	public static void main(String[] args) {
		//����Ŀ�����
		TeacherDao target = new TeacherDao();
		//��ô�����󣬲��ҽ�Ŀ����󴫵ݸ��������
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
		//ִ�д������ķ���������intercept �������Ӷ�ʵ�ֶ�Ŀ�����ĵ���
		proxyInstance.teach();
	}
}
