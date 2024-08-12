package com.karthi;
//types of variables

public class Typesofvariables {
	int a=10; //Instance or Object variable
	static int b=20;//static or class variable
	 
	public static void main(String [] args) {
		int c=30;//local variable
		System.out.println("Local variable:"+ c);
		
		Typesofvariables obj=new Typesofvariables();
		System.out.println(obj.a); 
		
		System.out.println(Typesofvariables.b);
	}

}
