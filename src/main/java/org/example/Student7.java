package org.example;

public class Student7 {
    private String name;
    private int age;
    private  double mark;

    double totalMarks = 0;
    int passCount = 0;
    double passMark = 50.0;



    Student7 (String name, int age, double mark){
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

    boolean hasPassed(){
       if (mark >= passMark){
           passCount++;
           return true;
       }
       else {

           return false;
       }
    }

    void  displayDetails(){
        System.out.println("\nStudent Details::::\n" +
                "- Name: "+name+"\n" +
                "- Age: "+age+"\n" +
                "- Mark: "+mark+"\n");
    }

}
