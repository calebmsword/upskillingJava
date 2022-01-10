package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("deprecated and marked for removal")
public class HashSetDemo_01 {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();

        // Storing element into an ArrayList

        // 1. Instantiate and add
        Integer myInt = new Integer(10);
        intSet.add(myInt);

        // 2. Instantiate + add
        intSet.add(new Integer(5));

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7; //Auto-boxing
        intSet.add(anotherInt);

        // 4. Auto-boxing + add
        intSet.add(9);
        intSet.add(1);
        intSet.add(18);
        intSet.add(15);

        // Retrieve elements of an ArrayList

        // 1. Generic - applicable for all collection
        System.out.println("Using toString()");
        System.out.println(intSet.toString()+"\n");

        // 2. Positional Access - Only applicable for List implementations
//        System.out.println("Position access");
//        for (int c = 0; c < intList.size(); c++) {
//            System.out.println("Element at the position " + c + " is " + intList.get(c));
//        }

        // 3. Using Iterator
        System.out.println("Using iterator");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            int element = intIterator.next(); // Auto-unboxing
            System.out.println(element);
        }
    }
}
