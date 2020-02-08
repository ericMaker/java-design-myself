package com.myself.ProxyPattern.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	//ά��һ��Ŀ�����
	private Object target;

	//��������target������г�ʼ��
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//��Ŀ���������һ���������
	public Object getProxyInstance() {
		//˵��
		/*
		 *     public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
          1. ClassLoader ָ����ǰĿ��ʹ�õ������������ȡ�������ķ����̶�
          2. Class<?>[] interfaces Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷��͵ķ�ʽȷ������
          3. InvocationHandler �¼�����ִ��Ŀ�����ķ���ʱ �ᴥ���¼��������ķ���                       
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				                      target.getClass().getInterfaces(), 
				                      new InvocationHandler() {
										
										@Override
										public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
											System.out.println("JDK����ʼ");
											//������Ƶ���Ŀ��ķ���
											Object returnVal = method.invoke(target, args);
											System.out.println("JDK�����ύ");
											return returnVal;
										}
									});
	}
}
