package org.example;
//Lab 8: Debugging Challenge
//Fix the errors in this code and explain each correction:
//Questions
// 1. Why does name = name; not set the object's field?
// I don't know.

// 2. How can this fix the problem?
// this clarifies which variable is being assigned.

// 3. What should the Dog constructor do to initialize the parent?
// Must have its own class and use extends.

// 4. Which annotation should be used for the overridden method?
// the "@" annotation.

public class Animal2 {
    private String name;

    public Animal2 (String _name) {
            // name = name; this is wrong because we are assigning this variable to it self instead of assigning a place holder.
            this.name = _name;
        }

    public void speak() {
            System.out.println(name + " makes a sound.");
        }
    }

//    The code that start from line 24 to line 32 is correct, but we are using it in the wrong class. We must create a new class for Dog that will extend or inherite from class animal.
//    class Dog extends Animal {
//        public Dog(String name) {
//            name = name;
//        }

// We must override the following code in the dog2 class.
//        public void speak() {
//            System.out.println("Dog barks.");
//        }
//    }

