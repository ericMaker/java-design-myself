package com.myself.compositePattern.sample;

public class Client {

	public static void main(String[] args) {
		// ����һ�����ڵ�
		Composite root = new Composite();
		root.operation();
		
		//������֦�ڵ�
		Composite brance = new Composite();
		
		//����Ҷ�ӽڵ�
		Leaf leaf = new Leaf();
		
		//�������νṹ
		root.add(brance);
		brance.add(leaf);
		
	}
	
	//������  �ݹ�
	public static void display(Composite root) {
		for(Component c:root.getChild()) {
			if(c instanceof Leaf) {//����ڵ�������Ҷ�ӽڵ�
				c.operation();
			}else {//��֦�ڵ�
				c.operation();
				display((Composite)c);//�ݹ����
			}
		}
	}

}
