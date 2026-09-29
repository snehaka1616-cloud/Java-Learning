package com.sneha.java;

public class Instance {
	

	    {
	        System.out.println("Instance block executed");
	    }

	    Instance() {
	        System.out.println("Constructor executed");
	    }

	    public static void main(String[] args) {
	    	Instance d = new Instance();
	    }
	}


