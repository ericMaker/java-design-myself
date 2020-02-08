package com.myself.abstractFactoryPattern;

public class ClientDemo {

	public static void main(String[] args) {
		// ������������
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		//�����ȼ�Ϊ1�Ĳ�ƷA
		ProductA a1 = new ProductA1();
		//�����ȼ�Ϊ2�Ĳ�ƷA
		ProductA a2 = new ProductA2();
		//�����ȼ�Ϊ1�Ĳ�ƷB
		ProductB b1 = new ProductB1();
		//�����ȼ�Ϊ2�Ĳ�ƷB
		ProductB b2 = new ProductB2();
		//ҵ����
		a1.method1();
		a2.method1();
		b1.method3();
		b2.method3();
	}

}
