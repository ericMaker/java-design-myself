package com.myself.PrototypePattern;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepPrototype deepPrototype = new DeepPrototype();
		deepPrototype.name = "�ɽ�";
		deepPrototype.deepClonableTarget = new DeepClonableTarget("��ţ","Сţ");
		
		//��ʽ1����Ĳ���
		DeepPrototype p = (DeepPrototype)deepPrototype.clone();
		
		System.out.println("p.name="+p.name+"p.deepClonableTarget="
		+p.deepClonableTarget.hashCode());
		System.out.println("p.name="+deepPrototype.name+"p.deepClonableTarget="
				+deepPrototype.deepClonableTarget.hashCode());
		
		//��ʽ2�������
		DeepPrototype p2 = (DeepPrototype)deepPrototype.deepClone();
		
		System.out.println("p.name="+p2.name+"p.deepClonableTarget="
		+p2.deepClonableTarget.hashCode());
		System.out.println("p.name="+deepPrototype.name+"p.deepClonableTarget="
				+deepPrototype.deepClonableTarget.hashCode());
	}

}
