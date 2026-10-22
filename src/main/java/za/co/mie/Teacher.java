package za.co.mie;

public class Teacher extends Person {
    String subject;
    Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }
}
