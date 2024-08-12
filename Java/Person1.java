package com.karthi;

 class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Student Name:"+ name +" " +"Student age:"+age);
	}

}
public class Person1{
	public static void main(String args[]) {
		Person obj=new Person("karthi",21);
		obj.display();
		Person obj1=new Person("Dharun",20);
		obj1.display();
	}
}
