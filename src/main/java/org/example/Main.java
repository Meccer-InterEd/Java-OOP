package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(200);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);

        boolean isBiggerThan100 = numbers.stream()
                .anyMatch(num -> num < 100);
        System.out.println(isBiggerThan100);

        }
    }
