package RunnableAndFunctionalInterface.CalculatorHandsOn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;


        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Enter two numbers to add:");
        System.out.print("1st number: ");
        a = scanner.nextInt();
        System.out.print("2nd number: ");
        b = scanner.nextInt();
        System.out.println("Result is: " + add.process(a,b) );

        System.out.println("Enter two numbers to subtract:");
        System.out.print("1st number: ");
        a = scanner.nextInt();
        System.out.print("2nd number: ");
        b = scanner.nextInt();
        System.out.println("Result is: " + subtract.process(a,b) );

        System.out.println("Enter two numbers to multiply:");
        System.out.print("1st number: ");
        a = scanner.nextInt();
        System.out.print("2nd number: ");
        b = scanner.nextInt();
        System.out.println("Result is: " + multiply.process(a,b) );

        System.out.println("Enter two numbers to divide:");
        System.out.print("1st number: ");
        a = scanner.nextInt();
        System.out.print("2nd number: ");
        b = scanner.nextInt();
        System.out.println("Result is: " + divide.process(a,b) );

        System.out.print("Thank you for using Calculator :)");

    }
}
