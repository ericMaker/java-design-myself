package com.myself.compositePattern;

public class Client {

	public static void main(String[] args) {
		// CEO
		ConcreteCompany root = new ConcreteCompany( "����","CEO", 10000);
		
		//���ž���
		ConcreteCompany developDep = new ConcreteCompany( "1","���ž���", 10000);
		ConcreteCompany salesDep = new ConcreteCompany( "2","���۾���", 10000);
		ConcreteCompany financeDep = new ConcreteCompany( "3","������", 10000);
		
		//����Ա��
		ConcreteCompany e1 = new ConcreteCompany( "a","�з���", 10000);
		ConcreteCompany e2 = new ConcreteCompany( "b","�з���", 10000);
		ConcreteCompany e3 = new ConcreteCompany( "c","�з���", 10000);
		ConcreteCompany e4 = new ConcreteCompany( "d","�з���", 10000);
		ConcreteCompany e5 = new ConcreteCompany( "e","�з���", 10000);
		ConcreteCompany e6 = new ConcreteCompany( "f","�з���", 10000);
		ConcreteCompany e7 = new ConcreteCompany( "g","�з���", 10000);
		ConcreteCompany e8 = new ConcreteCompany( "h","�з���", 10000);
		ConcreteCompany e9 = new ConcreteCompany( "i","�з���", 10000);
		
		//������
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
		
		//��ʾ��˾���
		System.out.println(root.getInfo());
		display(root);
	}

	//��������������
	private static void display(ConcreteCompany root) {
		// TODO Auto-generated method stub
		for(Company c:root.getChild()) {
			if(c instanceof Employee) {//����ڵ�������Ա���ڵ�
				System.out.println(c.getInfo());
			}else {
				System.out.println(c.getInfo());
				display((ConcreteCompany) c);
			}
		}
	}

}
