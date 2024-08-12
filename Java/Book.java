package com.karthi;
class Book1{
	String title;
	String author;
	int ISBN;
	Book1(String title,String author,int ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	void display() {
		System.out.println("Book title: "+title+" Book Author: "+author+" ISBN: "+ISBN);
	}
}

public class Book {
	public static void main(String args[]) {
		Book1 b=new Book1("Rich Dad Poor Dad"," unknown",123);
	    b.display();
	}
}
