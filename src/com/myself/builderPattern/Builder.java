package com.myself.builderPattern;

public abstract class Builder {
	//���ò�Ʒ�Ĳ�ͬ���������ò�ͬ�Ĳ�Ʒ
	public abstract void setPart1();
	public abstract void setPart2();
	public abstract void setPart3();
	public abstract void setPart4();
	
	//�����Ʒ
	public abstract Product builderProduct();
}
