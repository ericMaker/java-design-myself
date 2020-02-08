package com.myself.abstractFactoryPattern;

public class ClientDemo {

	public static void main(String[] args) {
		// 定义两个工厂
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		//生产等级为1的产品A
		ProductA a1 = new ProductA1();
		//生产等级为2的产品A
		ProductA a2 = new ProductA2();
		//生产等级为1的产品B
		ProductB b1 = new ProductB1();
		//生产等级为2的产品B
		ProductB b2 = new ProductB2();
		//业务处理
		a1.method1();
		a2.method1();
		b1.method3();
		b2.method3();
	}

}
