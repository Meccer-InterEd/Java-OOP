package org.example;

import java.util.Arrays;
import java.util.List;

/* when doing name=name;
the name field belongs to animal class that is marked private, this means that subclasses can not inherit direct access to private fields of the parent class
by doing super(name) we are handing the value up to the parent constructor
 */
public class Dog2{

    public static void main(String[] args) {

        List<Double> hhs = Arrays.asList(23.2,2.1,3.2,2.3);

        hhs = hhs.stream().map( x -> x * 2).toList();

        System.out.println(hhs.toString());


    }
}
