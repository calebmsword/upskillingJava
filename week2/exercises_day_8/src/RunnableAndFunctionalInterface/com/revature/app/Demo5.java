package RunnableAndFunctionalInterface.com.revature.app;

import RunnableAndFunctionalInterface.com.revature.beans.MyFunctionalInterface;

public class Demo5 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface1 = (a)->System.out.println("The argument is "+a); // Calling printlnmethod
        MyFunctionalInterface myFunctionalInterface2 = a ->System.out.println("Now argument is "+a); // Calling printlnmethod
        MyFunctionalInterface myFunctionalInterface3 = System.out::println;
        myFunctionalInterface1.meth(10);
        myFunctionalInterface2.meth(12);
        myFunctionalInterface3.meth(20);
    }
}
