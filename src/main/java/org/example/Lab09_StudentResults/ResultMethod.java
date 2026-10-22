
package org.example.Lab09_StudentResults;

public class ResultMethod {
// calculating the length
    public int countResults(
            StudentRecord[] students,
            ResultReporter reporter,
            ResultStatus target) {

        int count = 0;

        for (int k = 0;k  < students.length; k++) {
            if (reporter.determineStatus(students[k].score()) == target) {
                count++;
            }
        }

        return count;
    }
// calculating the average
    public double calculateAverage(StudentRecord[] students) {
        int total = 0;
        if (students.length == 0) {
            return 0;
        }

        for (int k = 0; k < students.length; k++) {
            total += students[k].score();
        }

        return (double) total / students.length;
    }
// Highest score and the name of the student who achieved it.
    public StudentRecord findHighest(StudentRecord[] students) {

        if (students.length == 0) {
            return null;
        }
        StudentRecord high = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].score() > high.score()) {
                high = students[i];
            }
        }
        return high;
    }
//Lowest score and the name of the student who achieved it.
    public StudentRecord findLowest(StudentRecord[] students) {

        if (students.length == 0) {
            return null;
        }
        StudentRecord low = students[0];

        for (int k = 1; k < students.length; k++) {
            if (students[k].score() < low.score()) {
                low = students[k];
            }
        }

        return low;
    }
}
