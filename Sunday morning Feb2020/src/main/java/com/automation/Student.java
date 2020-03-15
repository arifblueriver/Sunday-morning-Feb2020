package com.automation;

public abstract class Student {
	static int a;
	
	void getsalary() {
		 a = 10;
		System.out.println(a);
	}

	String getmoney() {
		System.out.println(a);
		return "sarower";
	}

	static void getincome() {
		System.out.println(a);
	}

	static int getfood() {
		System.out.println(a);
		return 10;
	}

	abstract void getrun();

}
