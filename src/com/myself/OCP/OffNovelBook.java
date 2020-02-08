package com.myself.OCP;

public class OffNovelBook extends NovelBook{

	public OffNovelBook(String name, double price, String author) {
		super(name, price, author);
	}

	//重写getPrice方法
	@Override
	public double getPrice() {
		//图书的价格打9折
		return super.getPrice()*0.9;
	}
}
