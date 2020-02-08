package com.myself.OCP;

import java.util.ArrayList;

public class BookStore {
	//图书列表
	private ArrayList<IBook> bookList = new ArrayList<IBook>();
	//构造函数
	public BookStore() {
		//对图书列表进行初始化
		bookList.add(new NovelBook("西游记", 79.20, "吴承恩"));
		bookList.add(new NovelBook("红楼梦", 93.80, "曹雪芹"));
		bookList.add(new NovelBook("三国演义", 60.00, "罗贯中"));
		bookList.add(new NovelBook("水浒传", 54.00, "施耐庵"));
		//对图书列表进行初始化
		bookList.add(new OffNovelBook("西游记", 79.20, "吴承恩"));
		bookList.add(new OffNovelBook("红楼梦", 93.80, "曹雪芹"));
		bookList.add(new OffNovelBook("三国演义", 60.00, "罗贯中"));
		bookList.add(new OffNovelBook("水浒传", 54.00, "施耐庵"));
	}
	
	public void showBooks() {
		System.out.println("-----------书店售书列表-------------");
		System.out.println("书名\t\t价格\t\t作者");
		for(IBook book:bookList) {
			System.out.println(book.getName()+"\t\t￥"+book.getPrice()+"元\t\t"+book.getAuthor());
		}
	}
	
	public static void main(String args[]) {
		BookStore bookStore = new BookStore();
		bookStore.showBooks();
	}
}
