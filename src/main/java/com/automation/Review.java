package com.automation;

public  class Review {

	int b;
	static int c;
	public  void getsalary() {

		int a= 10;
		b=20;
		c=30;
	}

	int getincome() {

		return 10000;
	}

	//abstract void getmoney();// no body

	public static void main(String[] args) {

		Review obj = new Review();
		
		//abstract class  and interface instantiation not possible = object creation not possible
		//normal class or non abstract class can create object
	}

}
