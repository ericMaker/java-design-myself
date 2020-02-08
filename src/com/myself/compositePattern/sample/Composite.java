package com.myself.compositePattern.sample;

import java.util.ArrayList;

public class Composite implements Component {

	//��������
	private ArrayList<Component> componentList = new ArrayList<Component>();
	
	//��ӹҼ�
	public void add(Component component) {
		this.componentList.add(component);
	}
	
	//ɾ���Ҽ�
	public void remove(Component component) {
		this.componentList.remove(component);
	}
	
	//��ȡ�ӹ���
	public ArrayList<Component> getChild(){
		return this.componentList;
	}
	
	@Override
	public void operation() {
		// ҵ���߼�����

	}

}
