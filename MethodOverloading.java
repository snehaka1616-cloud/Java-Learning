package com.sneha.java;

public class MethodOverloading{
	void add(String s)
	{
		System.out.println("method 1");
	}
	
    void add(int a , int b)
    {
    	System.out.println("method 2");
    }
 public static void main(String args[]) {
	 MethodOverloading address = new MethodOverloading();
	 address.add("Hello Sneha");
	 address.add(11 , 111);
	 
 }
	
}
