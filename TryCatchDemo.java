package com.sneha.java;


	import java.util.Scanner;

	 class TryCatchDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first number: ");
	            int a = sc.nextInt();

	            System.out.print("Enter the second number: ");
	            int b = sc.nextInt();

	            int result = a / b;
	            System.out.println("Result: " + result);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        }
	        catch (Exception e) {
	            System.out.println("Invalid input. Please enter integers.");
	        }
	        finally {
	            System.out.println("Program execution completed.");
	            sc.close();
	        }
	    }
	}


		




