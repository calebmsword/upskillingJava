package com.revature;

import java.util.ArrayList;

public class ArrayListDemo_01 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        // 1. Instantiate and add
        Integer myInt =  new Integer(10);
        intList.add(myInt);

        // 2. Instantiate + add
        intList.add(new Integer(5));

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7; //Auto-boxing
        intList.add(anotherInt);

        // 4. Auto-boxing + add
        intList.add(9);
        intList.add(1);
        intList.add(18);
        intLIst.add(15);

        // Retrieve elements of an ArrayList

        // 1. Generic - applicable for all collection
    }
}
