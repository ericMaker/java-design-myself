package com.myself.DecoratorPattern;

public abstract class CarDecorator implements Car {

	private Car car = null;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.car.show();
	}

}
