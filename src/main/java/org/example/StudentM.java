package org.example;

public class StudentM {
    private String name;
    private int age;
    private double mark;

public String getName(){
    return name;

}
    void setName(String name) {
        this.name = name;
    }
    public double getMark(){
        return mark;
    }
    void setMark(double mark) {
        this.mark = mark;
    }

        public int getAge (){

            return age;
        }
        void setAge(int age){
            this.age = age;
        }
        StudentM(String name, double mark, int age){
            setAge(age);
            setMark(mark);
            setName(name);

        }
        public boolean hasPassed () {
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid mark");
                    return false;
                }
                if (mark >= 50) {
                    return true;
                } else {
                    return false;
                }

        }
        void displayStudent () {
            System.out.println("Student Name: " + name + " Student age: " + age + " Student mark " + mark + " Passed " + hasPassed());
        }
    }