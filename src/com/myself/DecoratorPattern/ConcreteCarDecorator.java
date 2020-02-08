package com.myself.DecoratorPattern;

public class ConcreteCarDecorator extends CarDecorator{

	public ConcreteCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	//给车进行彩绘
	public void print() {
		System.out.println("给车位绘制新手，颜色是紫色晨光");
	}
	
	//给车装GPS设备
	public void setGps() {
		System.out.println("安装GPS定位导航系统");
	}
	
	//重写show方法
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		this.print();
		this.setGps();
	}
}
