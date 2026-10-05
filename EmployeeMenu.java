package com.sneha.java;


import java.util.Scanner;

class EmployeeMenu {

    static Scanner sc = new Scanner(System.in);

    static String name;
    static int age;
    static double salary = 0;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                char ans;

                do {
                    System.out.print("Enter your name: ");
                    name = sc.nextLine();

                    System.out.print("Enter your age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Do you want to continue? (y/n): ");
                    ans = sc.nextLine().charAt(0);

                } while (ans == 'y' || ans == 'Y');

                break;

            case 2:
                System.out.println("\n--- Employee Details ---");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Salary: " + salary);
                break;

            case 3:
                System.out.print("Enter amount to raise salary: ");
                double increase = sc.nextDouble();

                salary = salary + increase;

                System.out.println("Salary raised successfully!");
                System.out.println("New Salary: " + salary);
                break;

            case 4:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}