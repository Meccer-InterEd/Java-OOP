package org.example;

public class Car {
    String brand;
    String colour;
    int year;

Car(String brand, String colour, int year){
    this.year = year;
    this.colour = colour;
    this.brand = brand;
}
    void  displayDetails(){
        System.out.println("Brand: " + brand + " Colour: " + colour + " Year: " + year);
    }

}


