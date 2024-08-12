package com.karthi;
import java .util.*;
 class Student{
	int Regno;
	String name;
	int sub[]=new int[5];
	
	Student(int Regno,String name) {
		this.Regno=Regno;
		this.name=name;
	}
	void Getmarks() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++ ) {
			sub[i]=sc.nextInt();
		}
	}
	void Displaygrade() {
		int sum=0;
		System.out.println("StudentNo:"+Regno);
		System.out.println("Studentname"+name);
		for(int i=0;i<sub.length;i++) {
			 sum+=sub[i];
		}
		int avg=sum/5;
		if(avg>=91) {
			System.out.println("o");
		}
		else if(avg<=90 && avg>=81) {
			System.out.println("A");
		}
		else if(avg<=80 && avg>=71) {
			System.out.println("B");
		}
		else if(avg<=70 && avg>=61) {
			System.out.println("C");
		}
		else if(avg<=60 && avg>=51) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}
	}


public class Assignment {
	public static void main(String args[]) {
		Student obj=new Student(101,"karthi");
		obj.Getmarks();
		obj.Displaygrade();
	

}}
