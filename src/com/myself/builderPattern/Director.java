package com.myself.builderPattern;

public class Director {
	private Builder builder = new ConcreteBuilder();
	
	//�����Ʒ��������ø���������췽��
	public Product builder() {

		builder.setPart1();
		builder.setPart2();
		builder.setPart3();
		builder.setPart4();
		return builder.builderProduct();
	}
}
