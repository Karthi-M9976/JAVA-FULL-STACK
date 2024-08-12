package com.karthi;

import java.util.Scanner;

class Circle1{
	double radius;
	Circle1(double radius){
		this.radius=radius;
	}
	void setradius(double r) {
		radius=r;
	}
	double area() {
		return Math.PI*radius*radius;
	}
	double circumstances() {
		return 2*Math.PI*radius;
	}
}

public class Circle {
	public static void main(String args[]) {
		double radius;
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		Circle1 c=new Circle1(radius);
		System.out.println(c.area());
		System.out.print(c.circumstances());
	}

}
