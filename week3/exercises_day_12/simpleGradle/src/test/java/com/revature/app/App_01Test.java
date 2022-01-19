package com.revature.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class App_01Test {

    @Test
    public void sayHello() {
        assertEquals("Hello "+"CALEB"+"!!! Have a nice day!!!", App_01.sayHello("Caleb"));
    }
}