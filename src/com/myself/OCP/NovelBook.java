package com.myself.OCP;

public class NovelBook implements IBook {
	//����
	private String name;
	//��ļ۸�
	private double price;
	//�������
	private String author;
	//���췽��
	public NovelBook(String name,double price,String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String getAuthor() {
		return this.author;
	}

}
