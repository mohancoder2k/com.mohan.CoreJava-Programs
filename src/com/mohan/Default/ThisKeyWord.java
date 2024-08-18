package com.mohan.Default;

 class ABC{
	
	int num1;
	int num2;
	
	void getData(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	void display() {
		System.out.println(num1);
		System.out.println(num2);
	}
}

public class ThisKeyWord {
	 public static void main(String[] args) {
		 ABC A1 = new ABC();
		 A1.getData(10, 10);
		 A1.display();
	 }
}
