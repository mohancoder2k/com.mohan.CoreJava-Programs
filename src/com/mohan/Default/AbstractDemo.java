package com.mohan.Default;

abstract class Employee{
	
	abstract void display(); // definition need to be done only in sub class 
}
class Servant extends Employee{  // Servant is an Concrete class 
	void display() 
	{
		System.out.println("Invoked Abstract Method via Derived Class ");
	}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
			Servant s1 = new Servant();
			s1.display(); // No need to create an object for Abstract Class
	}
}
/* 
Abstraction (abstract)

-> Abstract method (method having only declaration)

-> Definition will be written in Derived Class

-> Abstract Class (contains atleast one abstract method)

-> Concrete Class (class Which doen't contain any abstract method)

We cannot Create for abstract clas
*/