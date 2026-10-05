package com.sneha.java;

public class This {
	
	// this is instance variable
	
		int a =10;
		int b =20;

	   void	add(int c , int d) //this is local variable
		{
			System.out.println("Hello" +(c+d));
			System.out.println("Hello" +(a+b));
		}
		 public static void main(String[] args) {
				This ff = new This();
			   ff.add(2, 3);
			}
		}
//here the value of c=2 , d=3 ;


