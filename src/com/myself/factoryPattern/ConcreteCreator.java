package com.myself.factoryPattern;

public class ConcreteCreator implements Creator {

	@Override
	public <T extends Product> T factory(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T)product;
	}

}
