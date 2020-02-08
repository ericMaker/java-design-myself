package com.myself.builderPattern;

public class ConcreteBuilder extends Builder{

	private Product product = new Product();
	//设置产品零件
	@Override
	public void setPart1() {
		// 为product1 设置零件1
		
	}

	@Override
	public void setPart2() {
		// 为product1 设置零件2
		
	}

	@Override
	public void setPart3() {
		// 为product1 设置零件3
		
	}

	@Override
	public void setPart4() {
		// 为product1 设置零件4
		
	}

	//建造一个产品
	@Override
	public Product builderProduct() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
