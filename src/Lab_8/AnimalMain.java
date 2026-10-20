package Lab_8;

public class AnimalMain {
    public void main()
    {

    Animal animal = new Animal("Lack");

    Dog dog = new Dog("Brr");

    animal.speak();
    dog.speak();

    /*
    Questions 1. Why does name = name; not set the object's field?
    2. How can this fix the problem?
    3. What should the Dog constructor do to initialize the parent?
    4. Which annotation should be used for the overridden method?

    Answer.
    1. It assigns the variable to itself, not the object's field.
    2. this.name = name; sets the object's field.
    3. Use super(name); to pass the name to the parent constructor.
    4. @Override
     */

    }
}