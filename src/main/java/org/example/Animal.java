package org.example;
//Create an Animal class with a makeSound() method.
// Create Dog and Cat subclasses that override the method.
//Tasks
// 1. Add a Cow class.
// 2. Explain @Override.
// Is used to replace information inside the parent constructor in a child class.

// 3. Explain why one method call can produce different results.
// Bacause it was specified which classes constructor was to be used.

public class Animal {
    public void makeSound(){
        System.out.println("The animal makes a sound.");
    }
}
