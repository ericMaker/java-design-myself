package com.myself.factoryPattern;

public class ClientDemo {

	public static void main(String[] args) {
		//苹果园丁工厂
		FruitGardener fruitGardener = new AppleGardener();
		//通过工厂生产苹果
		Fruit apple = fruitGardener.factory();
		apple.grow();
		apple.harvest();
		apple.plant();
		//葡萄原定工厂
		fruitGardener = new GrapeGardener();
		//通过工厂生产葡萄
		Fruit grape = fruitGardener.factory();
		grape.grow();
		grape.harvest();
		grape.plant();
		
	}

}
