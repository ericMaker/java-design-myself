package com.myself.abstractFactoryPattern;

public interface AbstractFactory {
	//创建产品A
	public ProductA factoryA();
	//创建产品B
	public ProductB factoryB();
}
