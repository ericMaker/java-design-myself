package com.myself.compositePattern.sample;

public class Client {

	public static void main(String[] args) {
		// 创建一个根节点
		Composite root = new Composite();
		root.operation();
		
		//创建树枝节点
		Composite brance = new Composite();
		
		//创建叶子节点
		Leaf leaf = new Leaf();
		
		//构建树形结构
		root.add(brance);
		brance.add(leaf);
		
	}
	
	//遍历树  递归
	public static void display(Composite root) {
		for(Component c:root.getChild()) {
			if(c instanceof Leaf) {//如果节点类型是叶子节点
				c.operation();
			}else {//树枝节点
				c.operation();
				display((Composite)c);//递归调用
			}
		}
	}

}
