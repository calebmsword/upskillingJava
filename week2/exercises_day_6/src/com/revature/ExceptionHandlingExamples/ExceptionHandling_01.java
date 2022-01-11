package com.revature.ExceptionHandlingExamples;

import java.util.Scanner;

public class ExceptionHandling_01 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        try {
            int c = a / b;
            System.out.println("Result: "+c);
        }
        catch (ArithmeticException e) {
//            System.out.println("Not possible to divide: " + e);
            e.printStackTrace();
        }

        System.out.println("Thank you!!!");
    }
}
