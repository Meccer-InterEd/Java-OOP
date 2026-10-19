package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Car car1 = new Car();
       Car car2 = new Car();

       car1.brand = "Audi";
       car2.brand = "Mercedes";

       car1.colour = "Black";
       car2.colour = "Silver Grey";

       car1.year = 2026;
       car2.year = 2026;

       car1.displayDetails();
       car2.displayDetails();
    }
}