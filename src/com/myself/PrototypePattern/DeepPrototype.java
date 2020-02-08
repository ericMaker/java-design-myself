package com.myself.PrototypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepPrototype implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public DeepClonableTarget deepClonableTarget;
	
	
	public DeepPrototype() {
		super();
	}

	//深拷贝方式一 克隆
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		//完成对基本数据类型的克隆
		deep = super.clone();
		
		//完成对引用数据类型的克隆
		DeepPrototype deepPrototype = (DeepPrototype)deep;
		deepPrototype.deepClonableTarget = (DeepClonableTarget)deepClonableTarget.clone();
		return deepPrototype;
	}
	
	//深拷贝方式二 序列化
	public Object deepClone() {
		//创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);//当前这个对象已对象流方式输出
			
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepPrototype copyObj = (DeepPrototype)ois.readObject();
			
			return copyObj;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			//关闭流
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
	}
}
