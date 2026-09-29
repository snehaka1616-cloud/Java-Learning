package com.sneha.java;
import java.util.Scanner;

public class Arithematic {

    // Addition
    static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Division
    static double divide(int a, int b) {
        return (double) a / b;
    }

    // Modulus
    static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n--- Arithmetic Operations ---");

        System.out.println("Addition = " + add(a, b));
        System.out.println("Subtraction = " + subtract(a, b));
        System.out.println("Multiplication = " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division = " + divide(a, b));
            System.out.println("Modulus = " + modulus(a, b));
        } else {
            System.out.println("Division = Cannot divide by zero");
            System.out.println("Modulus = Cannot divide by zero");
        }

        sc.close();
    }
}