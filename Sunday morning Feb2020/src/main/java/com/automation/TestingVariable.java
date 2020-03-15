package com.automation;

public class TestingVariable {

	int b;// global==>no static = instance
	static int e; // global == static = static variable or class level

	void getsalary(int c) {
		int d = 60;
		b = 30;
		c = 40;
		e = 70;
	}

	int a = 20;// global===>instance = no static word

	

}
