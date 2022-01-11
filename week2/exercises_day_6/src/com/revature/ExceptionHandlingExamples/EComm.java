package com.revature.ExceptionHandlingExamples;

import com.revature.ExceptionHandlingExamples.exception.InsufficientFundException;

import java.util.Scanner;

public class EComm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter balance in account: ");
        int balance = scan.nextInt();
        System.out.print("Enter cost of purchase: ");
        int cost = scan.nextInt();
        try {
            balance = placeOrder(balance, cost);
            System.out.println("update balance after purchase is: "+balance);
        }
        catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thank you for-a playing my game :)");
    }

    public static int placeOrder(int balance, int cost) throws InsufficientFundException {
        int updatedBalance = balance - cost;
        if (balance < cost) {
            InsufficientFundException insufficientFundException = new InsufficientFundException("insufficient funds available ("+balance+") to make purchase which costs "+cost);
            throw insufficientFundException;
        }
        return updatedBalance;
    }
}
