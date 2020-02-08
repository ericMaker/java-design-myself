package com.myself.DecoratorPattern;

public class ConcreteCarDecorator extends CarDecorator{

	public ConcreteCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	//�������вʻ�
	public void print() {
		System.out.println("����λ�������֣���ɫ����ɫ����");
	}
	
	//����װGPS�豸
	public void setGps() {
		System.out.println("��װGPS��λ����ϵͳ");
	}
	
	//��дshow����
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		this.print();
		this.setGps();
	}
}
