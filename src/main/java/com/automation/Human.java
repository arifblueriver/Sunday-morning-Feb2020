package com.automation;

public class Human {

	void getsalary() {

		Human girl = new Human();

		int age = 6;

		String sex = "F";

		double salary = 5000.75;

		System.out.println(age);
		System.out.println(sex);
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		Human obj= new Human();
		obj.getsalary();
	}
	
	
	


}
