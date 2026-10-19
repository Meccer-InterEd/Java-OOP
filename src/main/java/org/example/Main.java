package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("BMW","Black",2020);
        c1.displayDetails();
        c1.startEngine();
        Car c2 = new Car("Toyota","Grey",2019);
        c2.displayDetails();
        c2.startEngine();


    }
}