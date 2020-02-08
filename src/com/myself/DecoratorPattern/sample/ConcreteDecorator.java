package com.myself.DecoratorPattern.sample;

public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	//定义自己的方法
	public void method() {
		System.out.println("修饰");
	}
	
	//重写operation方法
	@Override
	public void operation() {
		this.method();
		super.operation();
	}
}
