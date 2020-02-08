package com.myself.DecoratorPattern.sample;

public class Decorator implements Component {

	private Component component = null;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		this.component.operation();

	}

}
