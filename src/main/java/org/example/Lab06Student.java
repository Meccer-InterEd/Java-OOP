package org.example;
/*
Create a `Student` class with: - `private String name` -
`private int age` - `private double mark` - A constructor - Getter
methods - `hasPassed()`, returning `true` when mark is at least 50 -
`displayDetails()`, printing details and pass/fail result
 */
public class Lab06Student {
    private String name;
    private int age;
    private double mark;

    public Lab06Student(String name, int age, double mark){
        this.name = name;
        this.age = age;
        if (mark < 0 || mark > 100){
            System.out.println("Invalid mark of "+mark+" detected!!!");
            System.exit(0);
        } else {
            this.mark = mark;
        }
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

    public boolean hasPassed(){
        return mark >= 50;
    }

    public void displayDetails(){
        System.out.println("Student Details:\n" +
                "Name: "+name+"\n" +
                "Age: "+age+"\n" +
                "Mark: "+mark+
                (mark >= 80 ? "\nRemark: Distinction!": "")
        );
    }
}
