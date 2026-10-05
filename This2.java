package com.sneha.java;

//this keyword is used when there is conflict btw instance and local variable
public class This2 {
	int a =10;
	int b =20;
	
void add(int a , int b)
	{
		System.out.println("Hello" +(this.a+this.b));
		System.out.println("Hello" +(a+b));
	}
	 public static void main(String[] args) {
			This2 ff = new This2();
		    ff.add(2, 3);
	 }
}
