package com.myself.DecoratorPattern;

public class ClinetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		//�Ա��۳�����װ��
		CarDecorator carDecorator = new ConcreteCarDecorator(car);
		carDecorator.show();
	}

}
