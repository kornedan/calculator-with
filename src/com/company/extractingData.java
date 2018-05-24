package com.company;

import java.awt.font.FontRenderContext;

public class extractingData {
     static int lastIndex;




////////Główny zwracający dane
     public static String[][] data(String[] file){
        String[][]  Date = new String[file.length+1][2];

        for (int i =0; i<file.length; i++){
            Date[i][0] = operator(file[i]);
            Date[i][1] = number(file[i]);
            if (operator(file[i]) == "apply"){
               lastIndex = i;
            }
        }

    return Date;
    }
////Wyciągnięcie operatora do tablicy
     static String operator(String line){

        String returnOperator = "";
        String[] operator = new String [5];
        operator[0] = "add";
        operator[1] = "subtract";
        operator[2] = "multiply";
        operator[3] = "share";
        operator[4] = "apply";

        String[] changeOperator = new String [5];
        changeOperator[0] = "+";
        changeOperator[1] = "-";
        changeOperator[2] = "*";
        changeOperator[3] = "/";
        changeOperator[4] = "apply";

        for (int i=0; i<5 ; i++) {
           if (line.matches(".*" + operator[i] + ".*")== true){
               returnOperator = changeOperator[i];
           }

        }


        return returnOperator;
    }
/////// Metoda zwracając liczby(int) po przez wyszukanie znaku pustego w zmiennej String-line
    static String number(String line){
    char[] number = null ;
    int startIndex = 0;
    char[] Char = line.toCharArray();
        for(int i=0; i<line.length(); i++){
            if(Char[i] == ' '){
                startIndex = i+1;
            }
        }

    String dana = line.substring(startIndex);
    return dana;
    }
}
