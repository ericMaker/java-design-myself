package com.myself.factoryPattern;
/*
 * 抽象工厂
 * 创建一个产品对象，其输入参数类型可以自行设置
 */
public interface Creator {
	public <T extends Product> T factory(Class<T> c);
}
