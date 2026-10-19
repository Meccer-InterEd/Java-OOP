package org.example;
/*
## Lab 1: Classes and Objects

Create `Car.java`:

``` java
public class Car {
    String brand;
    String colour;
    int year;

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }
}
```

In `Main.java`: 1. Create two `Car` objects. 2. Give them different
values. 3. Call `displayDetails()` on each object.

**Questions** 1. What is a class? 2. What is an object? 3. Can two
objects from the same class have different values?

**Challenge:** Add a `startEngine()` method.



## Lab 2: Constructors and `this`

Add a constructor to `Car`:

``` java
public Car(String brand, String colour, int year) {
    this.brand = brand;
    this.colour = colour;
    this.year = year;
}
```

Create objects like this:

``` java
Car car1 = new Car("BMW", "Black", 2018);
Car car2 = new Car("Toyota", "White", 2022);
```

**Tasks** 1. Display both cars. 2. Explain when a constructor runs. 3.
Explain what `this.brand` means.

**Challenge:** Add a second constructor that accepts only brand and
colour.
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
