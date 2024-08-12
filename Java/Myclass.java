package com.karthi;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		
	}
	//method
	void display() {
		System.out.println("Employee Id:" + employeeId);
		System.out.println("Employee Name:"+ employeeName);
		System.out.println("EmployeeSalary:"+employeeSalary);
		
	}
}

public class Myclass {
	public static void main(String args[]) {
	Employee emp1=new Employee(1 ,"karthi", 100.0f);
	emp1.display();
	}

}
