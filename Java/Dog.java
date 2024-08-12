/*Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and
modify the attributes using the setter methods and print the updated values.*/



package com.karthi;
class Dog1{
	String name;
	String breed;
	Dog1(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void set(String name,String breed) {
		this.name=name;
		this.breed=breed;
		System.out.println("Dogname: "+name+" "+"Dogbreed: "+breed);
	}
}

public class Dog {
	public static void main(String args[]) {
		Dog1 obj=new Dog1("subramani","labrador");
		obj.set("tommy","chippy");
		obj.set("lusy", "labrador");
	}

}
