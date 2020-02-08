package com.myself.factoryPattern;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.factory(ConcreteProduct.class);
		System.out.println(product);
	}

}
