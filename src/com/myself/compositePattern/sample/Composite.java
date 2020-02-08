package com.myself.compositePattern.sample;

import java.util.ArrayList;

public class Composite implements Component {

	//构建容器
	private ArrayList<Component> componentList = new ArrayList<Component>();
	
	//添加挂件
	public void add(Component component) {
		this.componentList.add(component);
	}
	
	//删除挂件
	public void remove(Component component) {
		this.componentList.remove(component);
	}
	
	//获取子构造
	public ArrayList<Component> getChild(){
		return this.componentList;
	}
	
	@Override
	public void operation() {
		// 业务逻辑代码

	}

}
