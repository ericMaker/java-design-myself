package com.myself.DecoratorPattern.coffee;

public class Client {

	public static void main(String[] args) {
		// װ����ģʽ�µĶ�����2���ɿ�����һ��ţ�̣�Long Black
		
		//1.�ȵ�һ��Long Black
		Drink order = new LongBlack();
		
		System.out.println("����1��"+order.cost());
		System.out.println("������"+order.getDes());
		
		//2.����һ��ţ��
		order = new Milk(order);
		
		System.out.println("����2��"+order.cost());
		System.out.println("������"+order.getDes());
		
		//3.����һ���ɿ���
		order = new Chocolate(order);
		System.out.println("����3��"+order.cost());
		System.out.println("������"+order.getDes());
		
		//4.����һ���ɿ���
		order = new Chocolate(order);
		System.out.println("����4��"+order.cost());
		System.out.println("������"+order.getDes());
	}

}
