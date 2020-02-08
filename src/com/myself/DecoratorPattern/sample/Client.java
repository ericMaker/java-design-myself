package com.myself.DecoratorPattern.sample;

public class Client {

	public static void main(String[] args) {

		Component component = new ConcreteComponent();
		//½øÐÐ×°ÊÎ
		component = new ConcreteDecorator(component);
		component.operation();
	}

}
