package com.company;


public class Main {
    private static String filename ="";


    public static void main(String[] args) {

        start();
        new readFile();
        new extractingData();
        new doThis();
        new view();
        String[] file = readFile.ReadFile(filename);
        String[][] date =  extractingData.data(file);
        int score = doThis.score(date,extractingData.lastIndex);
        view.doView(date,score,extractingData.lastIndex);


    }

    public static void start() {
        System.out.println("Witaj w kalkulatorze \n" +
                "Został wczytany plik o nazwie callculator.txt");
        filename ="callculator.txt";
    }
}
