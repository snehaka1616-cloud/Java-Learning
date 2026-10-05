package com.sneha.java;

public class This3 {
	// local variable value is assigned to instance variable 
	 
		int a ;
		int b ; //instance variable

	   void	add(int c , int d)   //local variable
		{
		      a=c;
		      b=d;
		}
	   void	add1()
	   {
		   System.out.println(a+b);
	   }
		 public static void main(String[] args) {
				This3 ff = new This3();
			   ff.add(2, 3);
			   ff.add1();
			}
		}


