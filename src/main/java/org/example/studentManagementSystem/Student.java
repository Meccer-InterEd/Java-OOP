package org.example.studentManagementSystem;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        setAge(age);
        setMark(mark);
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setMark(double mark) {
        if (mark > 0 && mark < 100){
            this.mark = mark;
        }
    }

    public double getMark() {
        return mark;
    }

    public boolean hasPassed(){
        if (mark < 50){
            return false;
        }
        return true;
    }

    public void displayDetails(){
        String status;
        if(hasPassed()){
            status = "pass";
        }
        else {
            status = "fail";
        }

        System.out.println("Name: " + name + " age: " + age + " Marks: "+ mark + " " + status);
    }
}
