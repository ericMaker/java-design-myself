package com.myself.OCP;

public class OffNovelBook extends NovelBook{

	public OffNovelBook(String name, double price, String author) {
		super(name, price, author);
	}

	//��дgetPrice����
	@Override
	public double getPrice() {
		//ͼ��ļ۸��9��
		return super.getPrice()*0.9;
	}
}
