package com.company;

import junit.framework.TestCase;


public class extractingDataTest extends TestCase {
    public void testOperator() {
        extractingData extractingData = new extractingData();
        String check = "*";
        String linia = "multiply 3";
        assertEquals(check, com.company.extractingData.operator(linia));
    }

    public void testNumber() {
        extractingData extractingData = new extractingData();
        String linia = "multiply 3";
        String check = "3";
        assertEquals(check,com.company.extractingData.number(linia));
    }

    public void testData() {
        extractingData extractingData = new extractingData();
        String[] linia  = new String[]{"multiply 32"};
        String checkOne = "*";
        String check = "32";
        String[][] Data = new String[1][2];
        Data [0][0] = String.valueOf(com.company.extractingData.data(linia)[0][0]);
        Data [0][1] = String.valueOf(com.company.extractingData.data(linia)[0][1]);
        assertEquals(checkOne,Data[0][0] );
        assertEquals(check,Data[0][1]);
    }
}