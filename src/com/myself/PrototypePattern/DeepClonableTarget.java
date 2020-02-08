package com.myself.PrototypePattern;

import java.io.Serializable;

public class DeepClonableTarget implements Serializable,Cloneable{
	private String clonName;
	private String clonClass;
	
	public DeepClonableTarget(String clonName, String clonClass) {
		this.clonName = clonName;
		this.clonClass = clonClass;
	}
	
	//��������Զ��ǻ����������ͣ�ʹ��Ĭ�Ͽ�¡���
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
