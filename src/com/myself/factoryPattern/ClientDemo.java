package com.myself.factoryPattern;

public class ClientDemo {

	public static void main(String[] args) {
		//ƻ��԰������
		FruitGardener fruitGardener = new AppleGardener();
		//ͨ����������ƻ��
		Fruit apple = fruitGardener.factory();
		apple.grow();
		apple.harvest();
		apple.plant();
		//����ԭ������
		fruitGardener = new GrapeGardener();
		//ͨ��������������
		Fruit grape = fruitGardener.factory();
		grape.grow();
		grape.harvest();
		grape.plant();
		
	}

}
