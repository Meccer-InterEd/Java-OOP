package Lab_5;

public class AnimalMain {
    public void main() {
        Animal animal = new Dog();
        Animal animal1 = new Cat();
        Animal animal2 = new Cow();

        animal.makeSound();
        animal1.makeSound();
        animal2.makeSound();



/*
Tasks 1. Add a Cow class. 2. Explain @Override.
3.Explain why one method call can produce different results.

Answers
1.
2. @Override means the child class uses its own version of a method.
3. One method call can give different results because each animal makes a different sound.
 */

    }
}
