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
		System.out.println("葡萄正在生长");

	}

	@Override
	public void harvest() {
		System.out.println("收获葡萄");

	}

	@Override
	public void plant() {
		System.out.println("栽种葡萄");

	}

}
