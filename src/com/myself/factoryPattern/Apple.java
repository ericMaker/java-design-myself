package com.myself.factoryPattern;

public class Apple implements Fruit {
	private int treeAge;
	public int getTreeAge() {
		return treeAge;
	}
	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	@Override
	public void grow() {
		System.out.println("ƻ����������");

	}

	@Override
	public void harvest() {
		System.out.println("�ջ�ƻ��");

	}

	@Override
	public void plant() {
		System.out.println("����ƻ��");

	}

}
