package com.myself.DecoratorPattern.coffee;

//�����Decorator ,������ǵ�ζƷ
public class Chocolate extends Decoretor{

	public Chocolate(Drink obj) {
		super(obj);
		setDes("�ɿ���");
		setPrice(3.0f);//��ζƷ�ļ۸�
	}
	
}
