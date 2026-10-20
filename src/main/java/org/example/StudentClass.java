package org.example;

public class StudentClass {

    private String name;
    private int age;
    private double mark;

    StudentClass(String name, int age, double mark){

        this.setName(name);
        this.setAge(age);
        this.setMark(mark);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public boolean hasPassed(double mark){

        boolean isPassed = false;

        if(mark < 0 && mark > 100){
            System.out.println("Invalid Marks!");
        }
        else if(mark >= 80){
            System.out.println(this.name +" you passed with a distinction.");
        }
        else if(mark >= 50){
            isPassed = true;
            System.out.println(this.name + " you have passed.");
        }else{
            System.out.println(this.name + " you have failed");
        }

        return isPassed;
    }
    void displayDetails(StudentClass[] students){

        for(int i = 0 ; i<students.length; i++){

            System.out.println("Name:" + students[i].name);
            System.out.println("Age:" + students[i].age);
            System.out.println("Double:" + students[i].mark);
        }

    }
    void countPassedAndAvg(StudentClass[] students){

        int count = 0;
        double totalMarks = 0;
        double average = 0;
        int countDistinctions = 0;

        for(int i = 0 ; i<students.length; i++){

            if(students[i].mark >= 80){
                countDistinctions++;
            }
            else if(students[i].mark >= 50){
                count++;
            }
            totalMarks = totalMarks + students[i].mark;
        }
        average = totalMarks / students.length;

        System.out.println("The number of student who passed is " + count);
        System.out.println("The number of student who passed with a Distinction is " + countDistinctions);
        System.out.println("The average is " + average);
    }
    void Highest(StudentClass[] students){

        double highest = students[0].mark;

        for(int i = 0 ; i<students.length; i++){

            if(students[i].mark > highest){

                highest = students[i].mark;
            }
        }
        System.out.println("The highest mark is " + highest);
    }
}
