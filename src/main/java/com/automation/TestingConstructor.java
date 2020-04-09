package com.automation;

public class TestingConstructor {

	static String name;// null=====> cant handle any null value
	static int salary;// 0 =========> problem(not div by 0)
	static double account;
	static boolean condition;
	
	//overloading concept =  method, coustructor 
	//overriding concept= 		method
	
	TestingConstructor(){//non
		
		
	}
	
	
	TestingConstructor(String name){//parameterized
		this.name=name;
		
	}
	

	void getsalary() {
		System.out.println(name);

	}
	void getsalary(int a) {
		System.out.println(name);

	}
	
	public static void main(String[] args) {
		// wrong >>>>TestingConstructor.getsalary();
		
		TestingConstructor obj = new TestingConstructor("sarower");
		obj.getsalary();
		
	}

}
