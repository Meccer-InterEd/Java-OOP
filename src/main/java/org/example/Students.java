package org.example;

public class Students {
    private String name;
    private int age;
    private double mark;

    public Students(String name,int age,double mark)
     {
         this.name=name;
         this.age=age;
         this.mark=mark;

     }
     public String getName() {
         return name;
     }

    public void setName(String name) {
        this.name = name;
    }
}
