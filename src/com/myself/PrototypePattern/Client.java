package com.myself.PrototypePattern;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepPrototype deepPrototype = new DeepPrototype();
		deepPrototype.name = "松江";
		deepPrototype.deepClonableTarget = new DeepClonableTarget("大牛","小牛");
		
		//方式1深拷贝的测试
		DeepPrototype p = (DeepPrototype)deepPrototype.clone();
		
		System.out.println("p.name="+p.name+"p.deepClonableTarget="
		+p.deepClonableTarget.hashCode());
		System.out.println("p.name="+deepPrototype.name+"p.deepClonableTarget="
				+deepPrototype.deepClonableTarget.hashCode());
		
		//方式2深拷贝测试
		DeepPrototype p2 = (DeepPrototype)deepPrototype.deepClone();
		
		System.out.println("p.name="+p2.name+"p.deepClonableTarget="
		+p2.deepClonableTarget.hashCode());
		System.out.println("p.name="+deepPrototype.name+"p.deepClonableTarget="
				+deepPrototype.deepClonableTarget.hashCode());
	}

}
