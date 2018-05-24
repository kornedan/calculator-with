package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static String[] ReadFile(String nameFile) {
        FileReader fr = null;
        String linia = null;
//////Otesrcvie pliku
        try {
            fr = new FileReader(nameFile);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
//////////// Odczyt lini z pliku

        int i = 0;
        int n = 5;
        String[] date = new String[n];
        try {
            while ((linia = bfr.readLine()) != null) {
                date[i] = linia;
                i++;
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

////////////// zamkniecie Pliku
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }


        return remov(date, i);
    }

////// Zwraca skasowanie pustej części skryptu
    public static String[] remov(String[] data, int I) {

        String[] rdata = new String[I];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null ) {
                rdata[i] = data[i];
            }
        }
        return rdata;
    }
}