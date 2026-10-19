package org.example.person;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Lethabo", "123");
        Teacher teacher = new Teacher("Lebo", "Maths");
        teacher.introduce();
        std1.introduce();
    }
}
