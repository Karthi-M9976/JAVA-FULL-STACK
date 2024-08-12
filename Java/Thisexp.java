package com.karthi;

public class Thisexp {
	String name;
	 Thisexp(String name){
		 this(10, 20);
		 this.name=name;
		 this.greeting();
	 }
	 Thisexp(int a,int b){
		 System.out.println("sum" + (a+b));
	 }
	 
	 void greeting() {
		 System.out.println("Welcome"+ name);
	 }
	 public static void main(String args[]) {
		 Thisexp obj=new Thisexp("karthi");
	 }

}
