package com.myself.builderPattern;

public class Director {
	private Builder builder = new ConcreteBuilder();
	
	//构造产品，负责调用各个零件构造方法
	public Product builder() {

		builder.setPart1();
		builder.setPart2();
		builder.setPart3();
		builder.setPart4();
		return builder.builderProduct();
	}
}
