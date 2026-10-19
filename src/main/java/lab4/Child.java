package lab4;

public class Child extends Parent {

    private String firstName;
    private int age ;
    private String id ;

    //Same Parent
    public Child ()
    {
        this.firstName = "TYT";
        this.age = 0;
        this.id = "6363633";
    }

    //Same Parent
    public Child (String firstName, int age, String id)
    {
        this.firstName = firstName;
        this.age = age;
        this.id = id;
    }

    //Different Parent
    public Child (String pLastName , String pFirstName , int pAge , String pId)
    {
        super(pFirstName,pFirstName,pAge,pId);

        this.firstName = "TYT";
        this.age = 0;
        this.id = "6363633";
    }

    //Different Parent
    public Child (String firstName, int age, String id, String pLastName , String pFirstName , int pAge , String pId)
    {
        super(pFirstName,pLastName,pAge,pId);

        this.firstName = firstName;
        this.age = age;
        this.id = id;



    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void birthday() {
        System.out.println("Birthday on Monday");
    }

    @Override
    public boolean canCook() {
        return false;
    }

    @Override
    public void isNiceGuy() {
        System.out.println("Nice Guy on Monday");
    }

    @Override
    public String toString() {
        return " Full Name: " + firstName + " Age: " + age + " Id: " + id;
    }


    @Override
    public void mustGoTSchool() {
        System.out.println("Drop out");
    }

    @Override
    public void mustGetMarried() {
        System.out.println("Nah");
    }

    @Override
    public void mustGoToChurch()
    {
        System.out.println("Nah");
    }


}
