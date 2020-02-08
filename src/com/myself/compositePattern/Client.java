package com.myself.compositePattern;

public class Client {

	public static void main(String[] args) {
		// CEO
		ConcreteCompany root = new ConcreteCompany( "张三","CEO", 10000);
		
		//部门经理
		ConcreteCompany developDep = new ConcreteCompany( "1","部门经理", 10000);
		ConcreteCompany salesDep = new ConcreteCompany( "2","销售经理", 10000);
		ConcreteCompany financeDep = new ConcreteCompany( "3","财务经理", 10000);
		
		//部门员工
		ConcreteCompany e1 = new ConcreteCompany( "a","研发部", 10000);
		ConcreteCompany e2 = new ConcreteCompany( "b","研发部", 10000);
		ConcreteCompany e3 = new ConcreteCompany( "c","研发部", 10000);
		ConcreteCompany e4 = new ConcreteCompany( "d","研发部", 10000);
		ConcreteCompany e5 = new ConcreteCompany( "e","研发部", 10000);
		ConcreteCompany e6 = new ConcreteCompany( "f","研发部", 10000);
		ConcreteCompany e7 = new ConcreteCompany( "g","研发部", 10000);
		ConcreteCompany e8 = new ConcreteCompany( "h","研发部", 10000);
		ConcreteCompany e9 = new ConcreteCompany( "i","研发部", 10000);
		
		//生成树
		root.add(developDep);
		root.add(salesDep);
		root.add(financeDep);
		
		developDep.add(e1);
		developDep.add(e2);
		developDep.add(e3);
		developDep.add(e4);
		
		salesDep.add(e5);
		salesDep.add(e6);
		salesDep.add(e7);
		
		financeDep.add(e8);
		financeDep.add(e9);
		
		//显示公司层次
		System.out.println(root.getInfo());
		display(root);
	}

	//遍历器（迭代）
	private static void display(ConcreteCompany root) {
		// TODO Auto-generated method stub
		for(Company c:root.getChild()) {
			if(c instanceof Employee) {//如果节点类型是员工节点
				System.out.println(c.getInfo());
			}else {
				System.out.println(c.getInfo());
				display((ConcreteCompany) c);
			}
		}
	}

}
