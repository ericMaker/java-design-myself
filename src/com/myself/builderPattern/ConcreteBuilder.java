package com.myself.builderPattern;

public class ConcreteBuilder extends Builder{

	private Product product = new Product();
	//���ò�Ʒ���
	@Override
	public void setPart1() {
		// Ϊproduct1 �������1
		
	}

	@Override
	public void setPart2() {
		// Ϊproduct1 �������2
		
	}

	@Override
	public void setPart3() {
		// Ϊproduct1 �������3
		
	}

	@Override
	public void setPart4() {
		// Ϊproduct1 �������4
		
	}

	//����һ����Ʒ
	@Override
	public Product builderProduct() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
