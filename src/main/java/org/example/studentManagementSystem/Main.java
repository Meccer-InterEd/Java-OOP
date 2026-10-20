package org.example.studentManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student std1 = new Student("Lethabo", 26, 57);
        Student std2 = new Student("Lebo", 23, 12);
        Student std3 = new Student("Jane", 23, 89);
        Student std4 = new Student("Maria", 19, 50);
        Student std5 = new Student("Mary", 26, 39);

        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);
        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println("Average mark = " + calculateAverage(students));
        System.out.println(countPassedStudent(students) + " students passed");
        System.out.println(passWithDistinction(students) + " students passed with distinction");
        highestMark(students);
    }

    public static double calculateAverage(ArrayList<Student> students) {
        double total = 0;

        for(Student std: students){
            total += std.getMark();
        }

        return total / students.size();
    }

    public static int countPassedStudent(ArrayList<Student> students){
        int count = 0;

        for(Student std: students){
            if (std.hasPassed()) {
                count += 1;
            }
        }

        return count;
    }

    public static void highestMark(ArrayList<Student> students){
        double highestmark = students.get(0).getMark();
        String name = "";

        for(Student std: students){
            if (std.getMark() > highestmark){
                highestmark = std.getMark();
                name = std.getName();;
            }
        }
        System.out.println(name + " got highest mark: " + highestmark);
    }

    public static int passWithDistinction(ArrayList<Student> students){
        int count = 0;

        for(Student std: students){
            if(std.getMark() >= 80){
                count += 1;
            }
        }

        return count;
    }
}
