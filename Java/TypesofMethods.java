package com.karthi;

public class TypesofMethods {
	void myMethod1() {
		System.out.println("Instance or Object Method");
	}
	static void myMythod2() {
		System.out.println("static or class Methoid");
	}
	public static void main(String args[]) {
		TypesofMethods obj=new TypesofMethods();
		obj.myMethod1();
		
		TypesofMethods.myMythod2();
	}

}
