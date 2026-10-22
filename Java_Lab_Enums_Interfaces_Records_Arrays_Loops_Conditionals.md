# Java Practical Lab: Enums, Interfaces, Records, Arrays, Loops and Conditional Statements

**Level:** Beginner to Intermediate\
**Recommended Java version:** Java 17 or later\
**Estimated time:** 2--3 hours\
**Submission:** Java source files plus a short README explaining how to
compile and run the program

## Lab Scenario: Student Results Management System

You have been asked to build a small Java console application that
stores student results and reports whether each student has passed. The
application must use an `enum` to represent a student's result status,
an `interface` to define behaviour, a `record` to store student
information, and an array processed using loops and conditional
statements.

## Learning outcomes

By the end of this lab, you should be able to:

-   Declare and use an `enum`.
-   Create an `interface` and implement it in a class.
-   Declare and use a Java `record`.
-   Store objects in an array and access them by index.
-   Use `for` or enhanced `for` loops to process array elements.
-   Use `if`, `else if`, `else`, and logical operators to make
    decisions.
-   Combine these features in a small, working Java program.

## Rules and requirements

1.  Use Java 17 or later because records became a standard Java feature
    in Java 16.
2.  Do not use an `ArrayList`, `List`, `Stream`, or database. Store the
    student records in a fixed-size array.
3.  Do not hard-code the final report. Calculate totals by looping
    through the array.
4.  Use meaningful names and consistent indentation.
5.  Validate scores so that a score below 0 or above 100 is rejected or
    clearly reported.
6.  Submit the source code for every class, interface, enum, and record
    you create.

------------------------------------------------------------------------

## Part 1 --- Create the result-status enum

Create a file named `ResultStatus.java`.

Declare an enum called `Result` with these values:

-   `PASS`
-   `SUPPLEMENTARY`
-   `FAIL`

Use the following grading rules:

  Score     Status
  --------- -----------------
  75--100   `PASS`
  50--74    `SUPPLEMENTARY`
  0--49     `FAIL`

### Tasks

1.  Declare the enum.
2.  In a separate method, use `if` / `else if` / `else` to determine the
    status from a score.
3.  Test the boundary values `0`, `49`, `50`, `74`, `75`, and `100`.
4.  Explain what should happen if the score is `-1` or `101`.

**Think about:** An enum limits a variable to a known set of values. Why
is that safer than storing status as any text string?

------------------------------------------------------------------------

## Part 2 --- Create a record for student information

Create a record named `StudentRecord` with these components:

-   `int studentId`
-   `String fullName`
-   `int score`

Example declaration:

``` java
public record StudentRecord(int studentId, String fullName, int score) {
}
```

### Tasks

1.  Create at least five student records using different names and
    scores.
2.  Use the record accessor methods, such as `fullName()` and `score()`,
    to read values.
3.  Explain one difference between a record and a traditional class with
    fields and getter methods.
4.  Add validation so a record cannot be created with a blank name, a
    negative ID, or a score outside `0–100`. You may use a compact
    constructor.

**Hint:** A record's accessor is named after the component; for example,
`score()` rather than `getScore()`.

------------------------------------------------------------------------

## Part 3 --- Define an interface

Create an interface named `ResultReporter`.

It must declare these methods:

``` java
ResultStatus determineStatus(int score);
void printStudentResult(StudentRecord student);
```

### Tasks

1.  Create a class named `ConsoleResultReporter` that implements
    `ResultReporter`.
2.  Implement `determineStatus(int score)` using the grading rules in
    Part 1.
3.  Implement `printStudentResult(StudentRecord student)` so that it
    prints the student's ID, name, score, and result status.
4.  Use `@Override` on implemented interface methods.
5.  In your own words, explain the role of the interface in this
    program.

**Important:** Keep the grading rules in one place rather than copying
different versions of the rules into multiple methods.

------------------------------------------------------------------------

## Part 4 --- Store students in an array

In your `Main` class, declare an array containing at least eight
`StudentRecord` objects.

Use a mixture of scores, including:

-   At least two scores from `75–100`.
-   At least two scores from `50–74`.
-   At least two scores from `0–49`.
-   At least one boundary score, such as `50` or `75`.

Example structure (replace or extend the sample data):

``` java
StudentRecord[] students = {
    new StudentRecord(101, "Amina Dlamini", 82),
    new StudentRecord(102, "David Mokoena", 67),
    new StudentRecord(103, "Lerato Nkosi", 43)
};
```

### Tasks

1.  Print the number of students using the array's `length` property.
2.  Use a traditional `for` loop to print each student's name and score.
3.  Use an enhanced `for` loop to print each student's result using your
    `ConsoleResultReporter`.
4.  Explain the difference between a traditional `for` loop and an
    enhanced `for` loop.
5.  Demonstrate that array indexes begin at `0`. Do not try to access an
    index outside the array's valid range.

------------------------------------------------------------------------

## Part 5 --- Add conditional logic and summary calculations

Process the entire array and calculate:

-   Number of students who passed.
-   Number of students who need supplementary assessment.
-   Number of students who failed.
-   Average score for all students.
-   Highest score and the name of the student who achieved it.
-   Lowest score and the name of the student who achieved it.

### Tasks

1.  Use a loop to visit each student.
2.  Use `if` / `else if` / `else` to increment the correct status
    counter.
3.  Calculate the average using the total score divided by the number of
    students. Use a suitable numeric type so the average is not
    unintentionally truncated to an integer.
4.  Find the highest and lowest scores without sorting the array.
5.  Handle an empty array safely so that the program does not divide by
    zero or attempt to access a nonexistent first element.
6.  Print a summary report after processing all students.

**Do not** manually enter the totals or average in your output. They
must be calculated from the array.

------------------------------------------------------------------------

## Part 6 --- Add a distinction category

Extend the grading rules to include a `DISTINCTION` status for scores of
`80–100`.

Update the enum and the status-determination logic. Use these rules:

  Score     Status
  --------- -----------------
  80--100   `DISTINCTION`
  75--79    `PASS`
  50--74    `SUPPLEMENTARY`
  0--49     `FAIL`

### Tasks

1.  Update `Result`.
2.  Update `determineStatus(int score)`.
3.  Update your counters and report so distinction students are counted
    separately from other passes.
4.  Test scores `49`, `50`, `74`, `75`, `79`, `80`, and `100`.
5.  Confirm that a distinction is not also counted in the ordinary
    `PASS` category unless you intentionally define and document that
    reporting rule.

------------------------------------------------------------------------

## Part 7 --- Sample output format

Your exact student names and calculated values will differ. Your program
should produce a report with this general structure:

``` text
STUDENT RESULTS
---------------
ID: 101 | Name: Amina Dlamini | Score: 82 | Status: DISTINCTION
ID: 102 | Name: David Mokoena | Score: 67 | Status: SUPPLEMENTARY
ID: 103 | Name: Lerato Nkosi | Score: 43 | Status: FAIL

SUMMARY
-------
Total students: 8
Distinctions: 2
Passes: 2
Supplementary: 2
Failures: 2
Average score: 63.75
Highest score: 91 (Student Name)
Lowest score: 32 (Student Name)
```

The numbers above are illustrative. Your totals, average, highest score,
and lowest score must match your own data.

------------------------------------------------------------------------

## Part 8 --- Testing checklist

Before submitting, test each item:

-   [ ] The program compiles without errors.
-   [ ] The enum contains all required statuses.
-   [ ] The interface is implemented by `ConsoleResultReporter`.
-   [ ] The record validates its data.
-   [ ] The array contains at least eight students.
-   [ ] Both traditional and enhanced `for` loops are used.
-   [ ] Conditional statements correctly classify boundary scores.
-   [ ] All counters and the average are calculated from the array.
-   [ ] Highest and lowest scores are correct.
-   [ ] An empty array does not cause division by zero.
-   [ ] Invalid scores and blank names are handled clearly.
-   [ ] The program's output is readable and consistently formatted.

## Extension challenges

Complete these after the core lab works:

1.  **Search:** Ask the user for a student ID and search the array using
    a loop. Print the matching student's details or a "not found"
    message.
2.  **Count by condition:** Count how many students scored above the
    class average.
3.  **Top performers:** Print every student whose score is within five
    points of the highest score.
4.  **Tie handling:** If multiple students share the highest or lowest
    score, report all of them.
5.  **Separate reporting:** Create a second class that implements
    `ResultReporter` differently, such as printing a compact one-line
    report. Explain how the interface makes it possible to use either
    reporter.

## Submission requirements

Submit:

-   `ResultStatus.java`
-   `StudentRecord.java`
-   `ResultReporter.java`
-   `ConsoleResultReporter.java`
-   `Main.java`
-   `README.md` with instructions to compile and run the program, plus a
    short explanation of where each required Java feature is used.

Suggested commands when all source files are in the same folder:

``` bash
javac *.java
java Main
```

## Reflection questions

Answer these in your README:

1.  Why is `Result` an enum rather than a `String`?
2.  What data does `StudentRecord` hold, and why is a record suitable
    here?
3.  What contract does `ResultReporter` define?
4.  Why is an array appropriate for this lab, and what is one limitation
    of arrays?
5.  Which loop did you use for the summary calculations, and why?
6.  Which boundary tests did you perform, and what bugs did they help
    you avoid?
