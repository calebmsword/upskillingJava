package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int add(int num1, int num2) {
        int sum;
        sum=num1+num2;
        return sum;
    }
}
