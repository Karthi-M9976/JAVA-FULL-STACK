package com.karthi;
class Emp{
	String name;
	String jobtitle;
	double salary;
	Emp(String name,String jobtitle,double salary){
		this.name=name;
		 this.jobtitle=jobtitle;
		 this.salary=salary;
	}
	void display() {
		System.out.print("Book name"+ name);
		System.out.print("Book Title"+ jobtitle);
		System.out.print("Book salary"+ salary);
		
	}
	void setsalary(double salary) {
		this.salary=salary;
	}
}

public class Employee1 {
	public static void main(String args[]) {
		Emp e=new Emp("karthi","HR",10000);
		e.setsalary(2000);
		e.display();
	}

}
