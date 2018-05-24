package com.company;

public class doThis {

//////////Metoda wykonuje działanie krok po kroku

   public static int score(String[][] date,int lastIndex) {

       int number = Integer.parseInt(date[lastIndex][1]);

       for (int i = 0; i < lastIndex; i++) {
           if (date[i][0] == "+") {
               number = add(number, Integer.parseInt(date[i][1]));
           }
           if (date[i][0] == "-") {
               number = subtract(number, Integer.parseInt(date[i][1]));
           }
           if (date[i][0] == "*") {
               number = multiply(number, Integer.parseInt(date[i][1]));
           }
           if (date[i][0] == "/") {
               number = share(number, Integer.parseInt(date[i][1]));
           }
       }
    return number;
   }
    public static int add(int a, int b){

        return a+b;
    }
    public static int subtract(int a, int b){

        return a-b;
    }
    public static int multiply(int a, int b){

        return a*b;
    }
    public static int share(int a, int b){

        return a/b;
    }

}
