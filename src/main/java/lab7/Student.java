package lab7;

public class Student {
    private String name;
    private int age;
    private double mark;


    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }


    public boolean hasPassed() {
        return this.mark >= 50;
    }


    public void displayDetails() {
        System.out.println("Name: " + name + " | Age: " + age + " | Mark: " + mark);
    }
}

