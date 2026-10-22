package za.co.mie;

public class Main {
    public static void main(String[] args) {
//        LAB 1 & 2
        Car car_1 = new Car("BMW", "Black", 2018);
        Car car_2 = new Car("Toyota", "White", 2022);
        car_1.displayDetails();
        car_1.startEngine();
        car_2.displayDetails();
        car_2.startEngine();

//        LAB 3
        BankAccount savings_account = new BankAccount();
        savings_account.deposit(1000);
        savings_account.withdraw(250);
        savings_account.deposit(-50);
        savings_account.withdraw(5000);
        System.out.println(savings_account.getBalance());

//        LAB 4
        Student student = new Student("Phuti", "123", 20, 21);
        student.introduce();
        System.out.println(student.student_number);
        Teacher teacher = new Teacher("Rendi", "JAVA");
        teacher.introduce();
        System.out.println(teacher.subject);

//        LAB 5
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();

//        LAB 6
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();

        payment1.pay(250);
        payment2.pay(100);

//        LAB 7
        Student[] students = {
                new Student("Lindiwe", "S001", 19, 76),
                new Student("Kabelo", "S002", 21, 48),
                new Student("Ayesha", "S003", 20, 89),
                new Student("Thabo", "S004", 18, 63)
        };
        double total_marks = 0;
        int pass_count = 0;
        double highest_mark = students[0].getMark();
        for (Student _student : students) {
            _student.displayDetails();
            if (_student.hasPassed()) {
                System.out.println("Result: Pass");
                pass_count++;
            } else {
                System.out.println("Result: Fail");
            }
            total_marks += _student.getMark();
            if (_student.getMark() > highest_mark) {
                highest_mark = _student.getMark();
            }
        }
        double average_mark = total_marks / students.length;
        System.out.println("Average: " + average_mark);
        System.out.println("Students Passed: " + pass_count + " / " + students.length);
        System.out.println("Highest Mark: " + highest_mark);


//        ENUMS - INTERFACES - RECORDS - ARRAYS - LOOPS - CONDITIONALS


//        Part 1
        Results results = new Results();
//        System.out.println(results.get_result_status(-1));
        System.out.println(results.get_result_status(10));
        System.out.println(results.get_result_status(50));
        System.out.println(results.get_result_status(75));
//        System.out.println(results.get_result_status(101));


//        Part 2
        StudentRecord student_record = new StudentRecord(1234, "Qiniso", 100);
        System.out.println(student_record.full_name());
        System.out.println(student_record.student_id());
        System.out.println(student_record.score());

//        Part 4
        StudentRecord[] students_ = {
                new StudentRecord(101, "Amina Dlamini", 82),
                new StudentRecord(102, "David Mokoena", 67),
                new StudentRecord(103, "Lerato Nkosi", 43),
                new StudentRecord(104, "Thabo Molefe", 91),
                new StudentRecord(105, "Naledi Khumalo", 50),
                new StudentRecord(106, "Sipho Ndlovu", 35),
                new StudentRecord(107, "Zanele Mthembu", 74),
                new StudentRecord(108, "Kabelo Sithole", 75)
        };

        System.out.println("Number of students: " + students_.length);

        System.out.println("\nFirst student (index 0): " + students_[0].full_name());

        System.out.println("Last student (index " + (students_.length - 1) + "): " + students_[students_.length - 1].full_name());

        for (int i = 0; i < students_.length; i++) {
            System.out.println("Index: " + i + ", Name: " + students_[i].full_name() + ", Score: " + students_[i].score());
        }

        ConsoleResultReporter reporter = new ConsoleResultReporter();

        for (StudentRecord student_ : students_) {
            reporter.printStudentResult(student_);
        }

//        PART 5 AND 6
        int distinction_count = 0;
        int pass_count_ = 0;
        int supplementary_count = 0;
        int fail_count = 0;
        double total_score = 0;
        StudentRecord highest_student = students_[0];
        StudentRecord lowest_student = students_[0];

        for (StudentRecord student_ : students_) {
            ResultStatus status = reporter.determineStatus(student_.score());

            switch (status) {
                case DISTINCTION -> distinction_count++;
                case PASS -> pass_count++;
                case SUPPLEMENTARY -> supplementary_count++;
                case FAIL -> fail_count++;
            }

            if (status == ResultStatus.PASS) {
                pass_count_++;
            } else if (status == ResultStatus.SUPPLEMENTARY) {
                supplementary_count++;
            } else if (status == ResultStatus.FAIL) {
                fail_count++;
            }

            total_score += student_.score();

            if (student_.score() > highest_student.score()) {
                highest_student = student_;
            }
            if (student_.score() < lowest_student.score()) {
                lowest_student = student_;
            }
        }

        double average_score = students_.length > 0 ? total_score / students_.length : 0.0;


//        PART 7
        for (StudentRecord student_ : students_) {
            reporter.printStudentResult(student_);
        }

        System.out.println("Total students: " + students_.length);
        System.out.println("Distinctions: " + distinction_count);
        System.out.println("Passes: " + pass_count_);
        System.out.println("Supplementary: " + supplementary_count);
        System.out.println("Failures: " + fail_count);
        System.out.println("Average score: " + average_score);
        System.out.println("Highest score: " + highest_student.score() + " (" + highest_student.full_name() + ")");
        System.out.println("Lowest score: " + lowest_student.score() + " (" + lowest_student.full_name() + ")");
    }
}