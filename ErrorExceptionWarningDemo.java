package com.sneha.java;

public class ErrorExceptionWarningDemo {
	    public static void main(String[] args) {
	        System.out.println("=== Error, Exception and Warning ===");

	        // Demonstrating an exception
	        try {
	            int number = 10 / 0;
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	        // Demonstrating a warning-prone operation
	        @SuppressWarnings("deprecation")
	        String message = getOldMessage();
	        System.out.println("Warning Demo: " + message);

	        // Demonstrating an error concept
	        System.out.println("Error: A serious problem that may stop execution.");

	        System.out.println("Program completed successfully.");
	    }

	    @Deprecated
	    public static String getOldMessage() {
	        return "This is a deprecated method.";
	    }
	}

