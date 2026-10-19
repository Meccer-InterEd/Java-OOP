/*
Add a constructor to car
Display both cars. 2. Explain when a constructor runs. 3. Explain what this.brand means.
Challenge: Add a second constructor that accepts only brand and colour.
 */

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
    Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    void displayDetails(){
        System.out.println(brand+" " + color +" " + year);
    }

    void startEngine(){
        System.out.println("Engine starting for the " + brand);
    }
}
