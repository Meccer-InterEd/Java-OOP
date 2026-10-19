package Lab_1;

public class carMain {

    public void main() {

        Car car = new Car();
        car.brand = "Tesla";
        car.color = "Black";
        car.year = 2028;


       Car car1 = new Car() ;
       car1.brand ="BM";
       car1.color ="Blue";
       car1.year =2023;

      car.displayDetails();
      car1.displayDetails();

      car.startEngine();
      car1.startEngine();
   }

    }

