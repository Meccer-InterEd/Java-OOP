package org.example;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Thami", "221589456");
        Teacher teacher = new Teacher("Rendi", "Java");

        student.introduce();
        System.out.println("Student Number:" + student.studentNumber);
        teacher.introduce();
        System.out.println("I teach " + teacher.subject);


    }
}