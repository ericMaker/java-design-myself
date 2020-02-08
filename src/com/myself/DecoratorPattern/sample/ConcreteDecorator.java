package com.myself.DecoratorPattern.sample;

public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	//�����Լ��ķ���
	public void method() {
		System.out.println("����");
	}
	
	//��дoperation����
	@Override
	public void operation() {
		this.method();
		super.operation();
	}
}
