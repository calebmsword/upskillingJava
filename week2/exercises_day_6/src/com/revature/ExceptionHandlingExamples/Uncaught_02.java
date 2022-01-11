package com.revature.ExceptionHandlingExamples;

import java.util.Scanner;

public class Uncaught_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        int c = calc(a,b);
        System.out.println("Result: "+c);
    }
    public static int calc(int a, int b) {
        int res;
        res = a / b;
        System.out.println("End of the calculation!");
        return res;
    }
}
