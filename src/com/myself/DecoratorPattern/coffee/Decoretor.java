package com.myself.DecoratorPattern.coffee;

public class Decoretor extends Drink{
	private Drink obj;
	
	public Decoretor(Drink obj) {
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// getPrice自己的调料价格
		return super.getPrice()+ obj.cost();
	}
	
	@Override
	public String getDes() {
		// obj.getDes 被装饰者的描述信息
		return super.getDes()+" "+super.getPrice()+" && "+ obj.getDes();
	}
}
