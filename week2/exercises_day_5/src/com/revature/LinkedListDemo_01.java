package com.revature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("deprecated and marked for removal")
public class LinkedListDemo_01 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        // Storing element into an ArrayList

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
        intList.add(15);

        // Retrieve elements of an ArrayList

        // 1. Generic - applicable for all collection
        System.out.println(intList);

        // 2. Positional Access - Only applicable for List implementations
        System.out.println("Position access");
        for(int c = 0; c < intList.size(); c++) {
            System.out.println("Element at the position "+c+" is "+intList.get(c));
        }

        // 3. Using Iterator
        System.out.println("Using iterator");
        Iterator<Integer> intIterator = intList.iterator();
        while(intIterator.hasNext()) {
            int element = intIterator.next(); // Auto-unboxing
            System.out.println(element);
        }
    }
}
