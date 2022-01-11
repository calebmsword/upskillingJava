package com.revature.ExceptionHandlingExamples;

import java.util.Scanner;

public class Uncaught_01 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        int c = a / b;
        System.out.println("Result: "+c);
        System.out.println("Thank you!!!");
    }
}
