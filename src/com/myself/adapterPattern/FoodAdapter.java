package com.myself.adapterPattern;

public class FoodAdapter extends Shuijiao implements Hundun {

	@Override
	public void makeHundun() {
		// TODO Auto-generated method stub
		super.makeShujiao();
		System.out.println("ÊÊÅäÆ÷º¯Êı");
	}

}
