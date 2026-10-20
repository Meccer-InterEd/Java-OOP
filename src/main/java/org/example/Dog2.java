package org.example;

public class Dog2 extends Animal2 {
//    Code from line 5 to 6 is wrong, since we are inheriting from another class we must use super() to show we are using information from the parent class.
//    public Dog(String name) {
//           name = name;

    public Dog2(String _name) {
        super(_name);
    }

    @Override
    public void speak() {
        System.out.println("Dog baks.");
    }

}
