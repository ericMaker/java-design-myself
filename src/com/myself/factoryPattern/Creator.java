package com.myself.factoryPattern;
/*
 * ���󹤳�
 * ����һ����Ʒ����������������Ϳ�����������
 */
public interface Creator {
	public <T extends Product> T factory(Class<T> c);
}
