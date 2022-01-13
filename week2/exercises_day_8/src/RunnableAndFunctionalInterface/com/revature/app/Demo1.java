package RunnableAndFunctionalInterface.com.revature.app;

import RunnableAndFunctionalInterface.com.revature.app.beans.RunnableImpl;

public class Demo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImpl());
        t1.start();
        System.out.println("inside of main after thread started execution");

    }
}
