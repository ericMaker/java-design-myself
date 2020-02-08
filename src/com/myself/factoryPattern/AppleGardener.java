package com.myself.factoryPattern;

public class AppleGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Apple();
	}

}
