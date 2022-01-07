package com.revature;

import java.util.Scanner;

public class Array2Dim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m;

        System.out.println("How many arrays?");
        m = scan.nextInt();

        int[][] arr = new int[m][];
        for(int l = 0; l < m; l++) {
            System.out.println("How many elements in "+l+"array?");
            int n = scan.nextInt();
            arr[m] = new int[n];
        }

        System.out.println("Enter values for each element:");
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Multidimensional array looks like:");
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
