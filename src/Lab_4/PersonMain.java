package Lab_4;

public class PersonMain {
public void main () {

    Student student = new Student("Say","IT1100");
    Teacher teacher = new Teacher ("Boyka","Java-Inheritence");

    student.introduce();
    System.out.println(student.studentNumber);

    teacher.introduce();
    System.out.println(teacher.subject);

}
}
