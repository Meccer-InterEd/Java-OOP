package lab4;

public abstract class Parent {

    private String firstName;
    private String lastName;
    private int age;
    private String id;

    public Parent()
    {
        this.firstName="Sir Rendy";
        this.lastName="Murendeni";
        this.age=30;
        this.id = "85074893733";

    }

    public Parent(String firstName, String lastName, int age, String id)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.id=id;

    }

    //Getters and Setters

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    //Parent Methods

    public void birthday()
    {
        System.out.println("Birthday on Sunday");
    }

    public boolean canCook()
    {
       return false;
    }

    public void isNiceGuy()
    {
        System.out.println("You will never know");
    }

    @Override
    public String toString()
    {

        return "Full Name " + this.firstName + " " + this.lastName + "\nAge"
                + this.age + "\nIdentification" + this.id;

    }



    public abstract void mustGoTSchool();
    public abstract void mustGoToChurch();
    public abstract void mustGetMarried();


}
