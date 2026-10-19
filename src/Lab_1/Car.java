package Lab_1;

public class Car {
    String brand;
    String color;
    int year;

    public void displayDetails() {
        System.out.println(brand + " " + color + " " + year);

    }
    public void startEngine() {
        System.out.println(color + brand + " Engine started");
    }
}
/*
Questions 1. What is a class?
2. What is an object?
3. Can two objects from the same class have different values?

Answers.
1. Class is a blueprint used to create objects
2.Object is an instance of a class with its own values
3. Yes, for example, two cars can have different brands, colours and years.

 */

