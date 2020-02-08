package com.myself.DecoratorPattern.coffee;

//具体的Decorator ,这里就是调味品
public class Chocolate extends Decoretor{

	public Chocolate(Drink obj) {
		super(obj);
		setDes("巧克力");
		setPrice(3.0f);//调味品的价格
	}
	
}
