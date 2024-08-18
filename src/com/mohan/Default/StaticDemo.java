package com.mohan.Default;

class Student{
	String name;
	int age;
	static String teacher;
	
	void display() {
		System.out.println("Student Name : "+ name);
		System.out.println("Age : "+age);
		System.out.println("Teacher : "+teacher);
	}
}

public class StaticDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Mohan";
		s1.age = 19;
		s1.teacher = "Dravid";
		
		Student s2 = new Student();
		s2.name = "Ram";
		s2.age = 19;
		s2.teacher = "Kumar";
		s1.display();
		s2.display();
	}

}
