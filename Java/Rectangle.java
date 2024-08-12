//. Write a Java program to create a class called "Rectangle" with width and height
//attributes. Calculate the area and perimeter of the rectangle

package com.karthi;

import java.util.Scanner;

class Rect{
	double l;
	double w;
	Rect(double l,double w){
		this.l=l;
		this.w=w;
	}
	double area() {
		return l*w;
	}
	double perimeter() {
		return 2*(l+w);
	}
}

public class Rectangle {
	public static void main(String args[]) {
		double length;
		double width;
		Scanner sc=new Scanner(System.in);
		length=sc.nextDouble();
		width=sc.nextDouble();
		Rect obj=new Rect(length,width);
		System.out.println("Area of a Rectangle:"+obj.area());
		System.out.println("Area of a Rectangle:"+obj.perimeter());
		
	}

}
