package RunnableAndFunctionalInterface.com.revature.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo_01 {
    public static void main(String[] args) {
//        Consumer<Integer> intConsumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("The received integer "+integer);
//            }
//        };

//        Consumer<Integer> intConsumer = a -> System.out.println("The received integer "+a);

        Consumer<Integer> intConsumer = System.out::println;

        intConsumer.accept(10);

        int[] values = new int[]{5, 6, 8};
        for (int value : values) {
            System.out.println("value");
        }

//        List<Integer> intList = new ArrayList<>();
//        intList.add(7);
//        intList.add(5);
//        intList.add(1);
//        intList.add(5);
//        intList.add(3);

        List<Integer> intList = Arrays.asList(7,5,1,5,3);
        System.out.println("Lambda");
        intList.forEach(System.out::println);

        List<String> strList = Arrays.asList("Apple", "Mango", "Banana", "Berry", "Android", "Microsoft");
        strList.sort((str1, str2) -> str1.compareTo(str2));
        strList.forEach(System.out::println);

        int sum = intList
                .stream()
                .filter( num -> num % 2 == 0 )
                .reduce(0, (a, b) -> a+b);
        System.out.println("Sum of evens in array: "+sum);
    }
}
