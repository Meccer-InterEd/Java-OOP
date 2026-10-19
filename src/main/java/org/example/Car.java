package org.example;
/*

 */
public class Car {
    String brand;
    String colour;
    int year;

    public Car(){}

    public Car(String brand, String colour, int year) {
//        this.brand = brand;
//        this.colour = colour;
        this(brand, colour);
        this.year = year;
    }

    public Car(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine(){
        System.out.println("===========================");
        System.out.println("Starting "+brand+" engine :)");
        System.out.println("===========================");
        System.out.println("All systems ready to go, "+brand+"!!!!\n\n");

    }
}
