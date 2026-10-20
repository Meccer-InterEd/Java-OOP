package org.example;
/* when doing name=name;
the name field belongs to animal class that is marked private, this means that subclasses can not inherit direct access to private fields of the parent class
by doing super(name) we are handing the value up to the parent constructor
 */
public class Dog2 extends Animal2{
    public Dog2(String name) {
        super(name);
    }

    public void speak(){
        System.out.println("Dog barks");
    }
}
