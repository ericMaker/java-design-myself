package com.myself.DecoratorPattern;

public class ClinetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		//对奔驰车进行装配
		CarDecorator carDecorator = new ConcreteCarDecorator(car);
		carDecorator.show();
	}

}
