package Lab_8;

public class Animal {

    private String name;

    public Animal(String name) {
     this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}