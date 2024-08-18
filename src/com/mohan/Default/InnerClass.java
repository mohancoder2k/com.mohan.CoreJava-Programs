package com.mohan.Default;

class Outer{
	
	String name = "Mohan";
	
	 class Inner{
		
		void display() {
			System.out.println("Inner Class - Nested Class method is evoked ");
		}
	}
	static class Static {
		 void show() {
			 System.out.println("Static Class method is called by creating object");
		 }
	 }
}

public class InnerClass {
	
	public static void main(String[] args) {
		Outer o1 = new Outer();
		System.out.println(o1.name);
		
		// Object creation for the Inner Class to access its variable and methods
		 Outer.Inner obj = o1.new Inner(); // Nested Inner Class 
		 obj.display();
		Outer.Static st = new Outer.Static(); //object created for static class
		st.show();
	}
}
