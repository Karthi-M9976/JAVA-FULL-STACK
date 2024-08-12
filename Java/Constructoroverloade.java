package com.karthi;

public class Constructoroverloade {
	Constructoroverloade(String name) {
		System.out.println("Welcome"+ name);
	}
	Constructoroverloade(int a,int b) {
		this("karthi");
		System.out.println("Addition :"+ (a+b));
	}
	Constructoroverloade(int n) {
		this(10,20);
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String args[]) {
		Constructoroverloade obj1=new Constructoroverloade(5);
		//Constructoroverloade obj2=new Constructoroverloade("karthi");
		//Constructoroverloade obj3=new Constructoroverloade(5,10);
		
	}

}
