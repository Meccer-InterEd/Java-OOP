import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InClassPrep {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Double> list2 = list.stream().map( x -> x +  (x * 0.2)).toList();

        System.out.println(list2.toString()); /* */

        List<String> names = Arrays.asList("Me", "Asdd", "dssdd", "Fgggf", "fgff");

      //  names = names.stream().map ( x -> x.toLowerCase() + "fhfhf").toList();


        names = names.stream().map ( String::toUpperCase ).toList();

        // map is a tool that transforms a collection of data by modifying every single item inside it, one by one
        // map doesnt change original array or list, it generates a new one n returns it


        // What it does: It passes each item through a transformation function
        // (like a factory machine) and outputs a brand-new collection with the modified items.




        // Stream converts data into  a moving pipeline of data, it jst creates
        // temporary data for u to perform functions with , like maybe filtering, mapping and sorting




        int [] is = {1,2,3,4,5};

        is = Arrays.stream(is).map( x -> x * 2 ).toArray();

        String [] n = {"ddf","Dfdddf"};

        n = Arrays.stream(n).map( x -> x.toLowerCase() ).toArray(String[]::new);

        // You do not pass anything into .toArray() for primitive arrays like int[],
        // but you must pass String[]::new for object arrays like String[]




    }

}
