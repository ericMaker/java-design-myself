package com.myself.factoryPattern;

public class Grape implements Fruit {
	private boolean seedless;
	public boolean isSeedless() {
		return seedless;
	}
	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

	@Override
	public void grow() {
		System.out.println("������������");

	}

	@Override
	public void harvest() {
		System.out.println("�ջ�����");

	}

	@Override
	public void plant() {
		System.out.println("��������");

	}

}
