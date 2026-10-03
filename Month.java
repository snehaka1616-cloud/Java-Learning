package com.sneha.java;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Hello January");
                break;
            case 2:
                System.out.println("Hello February");
                break;
            case 3:
                System.out.println("Hello March");
                break;
            case 4:
                System.out.println("Hello April");
                break;
            case 5:
                System.out.println("Hello May");
                break;
            case 6:
                System.out.println("Hello June");
                break;
            case 7:
                System.out.println("Hello July");
                break;
            case 8:
                System.out.println("Hello August");
                break;
            case 9:
                System.out.println("Hello September");
                break;
            case 10:
                System.out.println("Hello October");
                break;
            case 11:
                System.out.println("Hello November");
                break;
            case 12:
                System.out.println("Hello December");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}