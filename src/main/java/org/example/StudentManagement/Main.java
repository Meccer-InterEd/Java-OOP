package org.example.StudentManagement;

public class Main {
    public static void main(String[] args){
        Student[] students = {
                                new Student("Thamsanqa",27,81),
                                new Student("Gift",22,34),
                                new Student("Nosipho",25,98),
                                new Student("Keabetswe",23,76),
                                new Student("Brenda",29,34)
                             };


            Student s = new Student();

            s.displayDetails(students);
    }
}
