package com.myself.DecoratorPattern.coffee;

public class Decoretor extends Drink{
	private Drink obj;
	
	public Decoretor(Drink obj) {
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// getPrice�Լ��ĵ��ϼ۸�
		return super.getPrice()+ obj.cost();
	}
	
	@Override
	public String getDes() {
		// obj.getDes ��װ���ߵ�������Ϣ
		return super.getDes()+" "+super.getPrice()+" && "+ obj.getDes();
	}
}
