# Java OOP Practical Lab

**Level:** Beginner to Intermediate\
**Topics:** Classes, objects, constructors, encapsulation, inheritance,
polymorphism, abstraction\
**Estimated time:** 2--3 hours

## Learning outcomes

By completing these lab1, you should be able to create classes and
objects, use constructors, protect data with encapsulation, reuse code
with inheritance, override methods for polymorphism, and use abstract
classes.

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

## Lab 3: Encapsulation

Create `BankAccount.java` with a private balance, a deposit method, a
withdraw method and a getter.

``` java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

**Tasks** 1. Create an account object. 2. Deposit 1000. 3. Withdraw 250.
4. Try depositing -50 and withdrawing 5000. 5. Print the final balance.

**Questions** - Why is `balance` private? - Why should invalid amounts
be rejected?

**Challenge:** Add `displayBalance()`.

## Lab 4: Inheritance

Create a parent class:

``` java
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }
}
```

Create a `Student` class that extends `Person`, has a `studentNumber`
field, and uses `super(name)` in its constructor. Create a `Teacher`
class that extends `Person`, has a `subject` field, and also calls
`super(name)`.

**Tasks** 1. Create one Student and one Teacher. 2. Call `introduce()`
on both. 3. Display their student number and subject.

**Questions** - What does `extends` do? - What does `super(name)` do?

## Lab 5: Polymorphism and Method Overriding

Create an `Animal` class with a `makeSound()` method. Create `Dog` and
`Cat` subclasses that override the method.

``` java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
```

Test:

``` java
Animal animal1 = new Dog();
Animal animal2 = new Cat();

animal1.makeSound();
animal2.makeSound();
```

**Expected output**

``` text
The dog barks.
The cat meows.
```

**Tasks** 1. Add a `Cow` class. 2. Explain `@Override`. 3. Explain why
one method call can produce different results.

## Lab 6: Abstraction

Create an abstract class:

``` java
abstract class Payment {
    public abstract void pay(double amount);
}
```

Create `CardPayment` and `CashPayment` classes that extend `Payment` and
implement `pay(double amount)` with a suitable message.

Test:

``` java
Payment payment1 = new CardPayment();
Payment payment2 = new CashPayment();

payment1.pay(250);
payment2.pay(100);
```

**Questions** 1. What does `abstract` mean? 2. Can you create an object
directly from an abstract class? 3. Why must subclasses implement
`pay()`?

**Challenge:** Add a `MobilePayment` class.

## Lab 7: Combined Project --- Student Management System

Create a `Student` class with: - `private String name` -
`private int age` - `private double mark` - A constructor - Getter
methods - `hasPassed()`, returning `true` when mark is at least 50 -
`displayDetails()`, printing details and pass/fail result

Create at least four students, store them in an array, and use a loop
to: 1. Display every student's details. 2. Print Pass or Fail using an
`if` statement. 3. Calculate the average mark. 4. Count students who
passed. 5. Find the highest mark.

Suggested data:

  Name        Age   Mark
  --------- ----- ------
  Lindiwe      19     76
  Kabelo       21     48
  Ayesha       20     89
  Thabo        18     63

**Extension tasks** - Reject marks below 0 or above 100. - Display
Distinction for marks of 80 or higher. - Search for a student by name. -
Count students who received a distinction.

## Lab 8: Debugging Challenge

Fix the errors in this code and explain each correction:

``` java
class Animal {
    private String name;

    public Animal(String name) {
        name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        name = name;
    }

    public void speak() {
        System.out.println("Dog barks.");
    }
}
```

**Questions** 1. Why does `name = name;` not set the object's field? 2.
How can `this` fix the problem? 3. What should the `Dog` constructor do
to initialize the parent? 4. Which annotation should be used for the
overridden method?

## Knowledge Check

Answer in your own words:

1.  What is the difference between a class and an object?
2.  What is a constructor?
3.  What does `this` refer to?
4.  What is encapsulation?
5.  What does `extends` do?
6.  What is method overriding?
7.  Explain polymorphism using the animal example.
8.  What is an abstract class?
9.  Why might a field be private?
10. Give one real-world use for OOP.

## Submission checklist

-   [ ] All files compile and run.
-   [ ] Public class names match their filenames.
-   [ ] I created multiple objects.
-   [ ] I used a constructor.
-   [ ] I demonstrated encapsulation.
-   [ ] I demonstrated inheritance.
-   [ ] I demonstrated polymorphism.
-   [ ] I used an abstract class.
-   [ ] I completed the Student Management System.
-   [ ] I can explain my code in my own words.

## Reflection

Write a short paragraph describing which OOP concept was easiest, which
was most challenging, and how you could use OOP in a real application.
