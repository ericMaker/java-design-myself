package com.myself.DecoratorPattern.coffee;

public class Milk extends Decoretor{

	public Milk(Drink obj) {
		super(obj);
		setDes("ţ��");
		setPrice(2.0f);
	}

}
