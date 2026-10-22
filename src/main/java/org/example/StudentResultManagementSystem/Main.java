package org.example.StudentResultManagementSystem;

public class Main {
    public static void main(String[] args){
        int score = 100;
       // String result;
        ResultStatus result;

       if(score > 0 && score <=49){
           result = ResultStatus.FAIL;
           System.out.println(result);
       }else if(score >= 50 && score <= 74){

           result = ResultStatus.SUPPLEMENTARY;
           System.out.println(result);
       }else if(score >= 75 && score <= 100){
           result = ResultStatus.PASS;
           System.out.println(result);
       }else{
           System.out.println("Enter Proper score, a number greater than or qual to 0 ");
       }

    }
}
