
package Lab_7;

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
        return mark >= 50;
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(mark);

        System.out.println(hasPassed() ? "Pass" : "Fail");

        if (mark >= 80) {
            System.out.println("Distinction");
        }
    }
}
