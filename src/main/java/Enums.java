import java.util.Arrays;

public class Enums {

     /*  enum Direction {
            NORTH,EAST,SOUTH,WEST;
        } */ // U can use directly in a class or place in a separate file


    public static void main(String[] args) {

        //Enums short for Enumeration, data type used to define a
        // fixed set constants
        // if a variable can only be one of the few options , then use enum to ensure no can type anything else



        // 1. .values(): Returns an array containing all the options. You can instantly turn this into a stream or loop through it!
        // 2. .valueOf(String): Converts a matching string into the actual enum option.

    Arrays.stream(Direction.values()).forEach(System.out::println);
    Direction[] allChoices = Direction.values();


        //Enums are case sensitive n should always match wat is defined in the enums constants

        Direction direction = Direction.NORTH;

        System.out.println(direction);

    }

}
