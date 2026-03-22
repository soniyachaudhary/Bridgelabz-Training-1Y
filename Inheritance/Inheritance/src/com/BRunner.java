package com;
public class BRunner {
    public static void main(String[] args) {

        Author a1 = new Author(
                "Java Programming",
                2020,
                "James Gosling",
                "Father of Java"
        );

        a1.displayInfo();
    }
}