package com.abstraction;
public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Job is running in background");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
