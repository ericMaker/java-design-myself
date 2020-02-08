package com.myself.PrototypePattern.sample;

public class ConcretePrototype implements Prototype {

	@Override
	public Prototype clone() {
		// TODO Auto-generated method stub
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
