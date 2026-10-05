package com.sneha.java;

public class This4 {
	
	// here both instance and local variable value are same 
	//therefore "this" keyword comes into context

		int a ;
		int b ;

	   void	add(int a , int b)
		{
		      this.a=a;
		      this.b=b;
		}
	   void	add1()
	   {
		   System.out.println("this is very good"+(a+b));
	   }
		 public static void main(String[] args) {
				This4 ff = new This4();
			   ff.add(2, 3); //a=2 , b=3
			   ff.add1();
			}
		}


