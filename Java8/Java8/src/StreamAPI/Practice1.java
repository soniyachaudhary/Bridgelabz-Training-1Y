package StreamAPI;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,5,3,5,3,67,43,5,3,23,456,63,23,56,78);

        System.out.println("This is our list ;- "+list);

        System.out.println("This is our sorted list ;- ");
        list.stream().sorted().toList().forEach(System.out::println);

        System.out.println("Removed duplicate elements from the List :- ");
        list.stream().distinct().toList().forEach(System.out::println);

        System.out.println("Removed duplicate elements from the List :- ");
        list.stream().distinct().toList().forEach(System.out::println);

        System.out.println("Even Numbers In a List");
        list.stream().filter(x->x%2==0).toList().forEach(System.out::println);
        System.out.println("This is our Odd Number present in the list :- ");
        list.stream().filter(x -> x%2!=0).toList().forEach(System.out::println);

        System.out.println("This is the squ of even numbers :- ");
        list.stream().filter(x->x%2==0).map(x->x*x).toList().forEach(System.out::println);


    }
}
