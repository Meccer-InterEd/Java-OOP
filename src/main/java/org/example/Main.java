package org.example;

import lab1.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Benz","Red",2023);
        Car car2 = new Car("BMW","White",2024);

        car1.display();
        car2.display();




    }
}