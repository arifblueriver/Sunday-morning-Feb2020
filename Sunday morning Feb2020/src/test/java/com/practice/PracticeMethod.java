package com.practice;

public class PracticeMethod {

	int a;//instance variable 
	static int b;//static or class level
	
	static void getsalary() {// class level
	
		System.out.println("This is my void method");
		// a=10;
		 b=20;
		 int c=30;
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		//PracticeMethod obj = new PracticeMethod();
		//obj.getsalary();

		PracticeMethod.getsalary();
		
	}
	
}
