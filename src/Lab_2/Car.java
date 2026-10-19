package Lab_2;

public class Car {
    String brand;
    String color;
    int year;

    public Car(String brand, String color,int year) {

        this.brand = brand;
        this.color = color;
        this.year = year;


    }

public Car(String brand, String color)  {
      this.brand = brand;
      this.color = color;
}

    void displayDetails() {
        System.out.println(brand + color + year);
    }
}
/*Tasks 1. Display both cars. 2.
Explain when a constructor runs.
3. Explain what this.brand means.

Challenge: Add a second constructor that accepts only brand and colour.

Answers.
1.
2. It runs automatically when we create an object
3. It refers to the brand of that particular car.

*/

