package com.sneha.java;

public class Student2 {
	String name;  //instance variable
	int age;
	
	void introduce() {
		System.out.println("I am " + name + ", age " + age);
	}
	
	public static void main(String args[]) {

Student2 s = new Student2(); //it's an object
s.name = "sneha";
s.age = 19;
s.introduce();
}
}
