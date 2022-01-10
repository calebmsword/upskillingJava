package com.revature;

import java.util.Scanner;
import java.lang.Math;

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
        int min = marks[0];
        int max = marks[0];
        System.out.println("Sum of all elements is:");
        for(int i=0; i < marks.length; i++) {
            sum += marks[i];
            if (Math.min(marks[i], min) == marks[i]) {
                min = marks[i];
            }
            if (Math.max(marks[i], max) == marks[i]) {
                max = marks[i];
            }
        }
        System.out.println(sum);

        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}
