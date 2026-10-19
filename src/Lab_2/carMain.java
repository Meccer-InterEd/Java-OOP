package Lab_2;

public class carMain {
public void main(){

Car car = new Car("BMW","Red", 2019);
Car car1 = new Car("Benz","Green", 2013);

Car car2 = new Car("VW", "Red");


       car.displayDetails();
       car1.displayDetails();
       car2.displayDetails();
}
}