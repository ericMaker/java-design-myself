package com.myself.factoryPattern;

public class GrapeGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		// TODO Auto-generated method stub
		return new Grape();
	}

}
