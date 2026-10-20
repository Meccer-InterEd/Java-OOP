
package Lab_7;

public class StudentMain {
    public void main(){

        Student Stu = new Student("Say", 19, 74);
        Student Stu1 = new Student("Jay", 18,  0);
        Student Stu2 = new Student("Lay", 20, 80);
        Student Stu3 = new Student("Play", 23, 90);

        Student[] students = {Stu, Stu1, Stu2, Stu3};

        double total = 0;
        int passed = 0;
        double highest = 0;
        int distinctions = 0;

        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
            total = total + students[i].getMark();

            if (students[i].hasPassed()) {
                passed++;
            }

            if (students[i].getMark() > highest) {
                highest = students[i].getMark();
            }

            if (students[i].getMark() >= 80) {
                distinctions++;
            }
        }

        System.out.println("Average: " + total / students.length);
        System.out.println("Passed: " + passed);
        System.out.println("Highest mark: " + highest);
        System.out.println("Distinctions: " + distinctions);
    }
}
