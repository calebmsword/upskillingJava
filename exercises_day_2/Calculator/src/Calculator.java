package com.revature.jan5;

public class Calculator {
    private int num1;
    private int num2;
    public static String brand;

    public void setNum1(int num1){
        if(num1 < 5){
            this.num1 =5;
            return;
        }
        if(num1 > 20){
            this.num1 = 20;
            return;
        }
        this.num1 = num1;
    }
    public void setNum2(int num2){
        if(num2 < 5){
            this.num2 = 5;
            return;
        }
        if(num2 > 20){
            this.num2 = 20;
            return;
        }
        this.num2 = num2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int add(){
        int sum;
        sum = num1 + num2;
        return sum;
    }
}