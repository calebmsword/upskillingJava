package com.revature;

import java.util.Scanner;

public class Array1Dim {
    public static void main(String[] args) {
        int[] marks;
        marks = new int[4];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < marks.length; i++) {
            System.out.println("Enter element: ");
            marks[i] = scan.nextInt();
        }

        System.out.println("Elements you entered: ");

        for(int i=0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int sum = 0;
        System.out.println("Sum of all elements is:");
        for(int i=0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
