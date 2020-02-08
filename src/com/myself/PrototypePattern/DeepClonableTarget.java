package com.myself.PrototypePattern;

import java.io.Serializable;

public class DeepClonableTarget implements Serializable,Cloneable{
	private String clonName;
	private String clonClass;
	
	public DeepClonableTarget(String clonName, String clonClass) {
		this.clonName = clonName;
		this.clonClass = clonClass;
	}
	
	//该类的属性都是基本数据类型，使用默认克隆完成
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
