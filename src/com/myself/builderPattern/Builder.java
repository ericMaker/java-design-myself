package com.myself.builderPattern;

public abstract class Builder {
	//设置产品的不同部分以设置不同的产品
	public abstract void setPart1();
	public abstract void setPart2();
	public abstract void setPart3();
	public abstract void setPart4();
	
	//构造产品
	public abstract Product builderProduct();
}
