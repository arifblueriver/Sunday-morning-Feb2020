package com.testinterface;

public interface Animal {

	//special ......similar like class
	
	//Rules: 1) usually use abstract method , by default void 
	//2) variable usually static final 
	//why java need interface ? 1) 100% abstraction 2) multiple inheritance
	//why java need constructor? remove default value
	//interface handle which method== abstract method == no body
	//java 8 changes in interface ==> 1) static method & deafault method == both has body
	//Can interface instantiation/create object? ==>NO
	// Interface Vs Abstract class
	static final int a =10;
	
	void getsalary();
	// XXXX  Animal obj = new Animal();
	
}


