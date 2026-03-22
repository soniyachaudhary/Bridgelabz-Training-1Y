package com.abstraction;
import java.util.function.Function;

public class LengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> checkLength = (str) -> str.length();

        String message = "Hello World";
        int limit = 10;

        if (checkLength.apply(message) > limit) {
            System.out.println("Message is too long");
        }
    }
}