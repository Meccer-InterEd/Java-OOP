package org.example;

public class Car {
    String brand;
    String colour;
    int year;

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine(){
        System.out.println("The "+ brand +" " + colour + " " + year +" is now running");
    }

    public Car(String brand, String colour, int year) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }
    public Car(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }

}

