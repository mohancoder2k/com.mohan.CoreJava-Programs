package com.mohan.Default;
 class GrandParent{
	void proverb() {
		System.out.println("Im an Grandfather ");
	}
}

 class Parent extends GrandParent{
	void display()
	{
		System.out.println("Im an Parent ");
	}
}

  class Child extends GrandParent{
	void study()
	{
		System.out.println("Im an Child of that Parent");
	}
}

public class Inheritance {
	
	// user defined classes - collection of methods 


	public static void main(String[] args) { // Super Class  void main()
		// TODO Auto-generated method stub
		Child c1 = new Child();
		Parent p1 = new Parent();
		c1.study();
		p1.display();
		p1.proverb();
	}

}
