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

	//�����ʽһ ��¡
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		//��ɶԻ����������͵Ŀ�¡
		deep = super.clone();
		
		//��ɶ������������͵Ŀ�¡
		DeepPrototype deepPrototype = (DeepPrototype)deep;
		deepPrototype.deepClonableTarget = (DeepClonableTarget)deepClonableTarget.clone();
		return deepPrototype;
	}
	
	//�����ʽ�� ���л�
	public Object deepClone() {
		//����������
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);//��ǰ��������Ѷ�������ʽ���
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepPrototype copyObj = (DeepPrototype)ois.readObject();
			
			return copyObj;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			//�ر���
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
