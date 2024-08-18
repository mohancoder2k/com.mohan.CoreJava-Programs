package com.mohan.Default;
class Parent2{ 	
    void display() {
         System.out.println("Parent");
     }
 }


 class Child2 extends Parent2 {
     @Override
     void display() {
     	super.display(); //Super Keyword is used to call the same function inside the Parent class
         System.out.println("Child");
     }
 }

public class MethodOverriding {
  
    public static void main(String[] args) {
     
        Child2 c1 = new Child2();
        
        c1.display(); // This will output "Child"
    }
}

/*
    Method Overriding - Runtime Polymorphism 
    -> Achieved through Inheritance
    -> Superclass and Subclass methods must have the same name and signature
    -> Not possible with static and final methods
*/
