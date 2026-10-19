package org.example;

public class Car {
    String brand;
    String color;
    int year;
    Car(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }


    void displayDetails(){
        System.out.println(brand + " " + color + " " + year);
    }

}
