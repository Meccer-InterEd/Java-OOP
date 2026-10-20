package org.example.StudentManagement;

public class Student {
    private String name;
    private int age;
    private double mark;

    Student(String name, int age, double mark){
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

    boolean hasPassed(Student student){
        if(student.getMark() >= 50 ){
            return true;
        }else{
            return false;
        }
    }

    void displayDetails(Student[] students){
        int passCount = 0;
        int failCount;

        for(int i = 0; i < students.length; i++){
            System.out.println(" Student Name: " + students[i].getName()+
                                "\nStudent age: " + students[i].getAge()+
                                "\nStudent mark: " + students[i].getMark());

            if(students[i].hasPassed(students[i])){
                passCount++;
            }
        }


    }
    double avgMark(Student[] students){
      double avgMark = 0;

      for(Student s : students){

      }
    }

}
