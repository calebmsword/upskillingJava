package com.revature.ExceptionHandlingExamples;

import java.util.Scanner;

public class ExceptionHandling_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        try {
            int c = calc(a,b);
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e) {
            System.out.println("Not possible to calculate: "+e.getMessage());
        }
        System.out.println("Thank you!!!");

    }
    public static int calc(int a, int b) {
        int res;
        try{
            res = a / b;
            return res;
        }
        finally {
            System.out.println("End of the calculation!");
        }

    }
}
