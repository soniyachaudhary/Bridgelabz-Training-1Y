package com.abstraction;
import java.util.function.Predicate;

public class TemperatureSystem {
    public static void main(String[] args) {
        Predicate<Double> isHot = (temp) -> temp > 35.0;

        double currentTemp = 38.0;

        if (isHot.test(currentTemp)) {
            System.out.println("Alert: High Temperature!");
        }
    }
}

