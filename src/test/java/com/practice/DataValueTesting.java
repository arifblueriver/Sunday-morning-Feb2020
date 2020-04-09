package com.practice;

public class DataValueTesting {

	// special kind in java , similar like method
	// constructor name is same as a class
	// can not use void word
	// why java need constructor?

	String name;// null=====> Big problem (nullpointerException)******
	int a;// 0 =============> also a problem(ArithmeticException)
	double b;// 0.0
	boolean c;// false
	DataValueTesting( ){//Non parameterize == Default
		
		
	}
	DataValueTesting(int a) {//parameterize
		this.a = a;
		
	}
//OOPs >>> Polymorphism >>>> Overloading : method & constructor
//OOPs >>> Polymorphism >>>> Overriding : method 	

	void getsalary() {//zero

		System.out.println(a);

	}


	public static void main(String[] args) {

		DataValueTesting obj = new DataValueTesting(10);
		obj.getsalary();
	}

}
