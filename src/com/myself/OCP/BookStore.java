package com.myself.OCP;

import java.util.ArrayList;

public class BookStore {
	//ͼ���б�
	private ArrayList<IBook> bookList = new ArrayList<IBook>();
	//���캯��
	public BookStore() {
		//��ͼ���б���г�ʼ��
		bookList.add(new NovelBook("���μ�", 79.20, "��ж�"));
		bookList.add(new NovelBook("��¥��", 93.80, "��ѩ��"));
		bookList.add(new NovelBook("��������", 60.00, "�޹���"));
		bookList.add(new NovelBook("ˮ䰴�", 54.00, "ʩ����"));
		//��ͼ���б���г�ʼ��
		bookList.add(new OffNovelBook("���μ�", 79.20, "��ж�"));
		bookList.add(new OffNovelBook("��¥��", 93.80, "��ѩ��"));
		bookList.add(new OffNovelBook("��������", 60.00, "�޹���"));
		bookList.add(new OffNovelBook("ˮ䰴�", 54.00, "ʩ����"));
	}
	
	public void showBooks() {
		System.out.println("-----------��������б�-------------");
		System.out.println("����\t\t�۸�\t\t����");
		for(IBook book:bookList) {
			System.out.println(book.getName()+"\t\t��"+book.getPrice()+"Ԫ\t\t"+book.getAuthor());
		}
	}
	
	public static void main(String args[]) {
		BookStore bookStore = new BookStore();
		bookStore.showBooks();
	}
}
