package com.company;

import junit.framework.TestCase;

public class doThisTest extends TestCase {

    public void testAdd() {
        doThis doThis = new doThis();
        int a = 2;
        int b = 2;
        assertEquals(4,com.company.doThis.add(a,b));
    }

    public void testSubtract() {
        doThis doThis = new doThis();
        int a = 2;
        int b = 2;
        assertEquals(0,com.company.doThis.subtract(a,b));
    }

    public void testMultiply() {
        doThis doThis = new doThis();
        int a = 2;
        int b = 2;
        assertEquals(4,com.company.doThis.multiply(a,b));
    }

    public void testShare() {
        doThis doThis = new doThis();
        int a = 2;
        int b = 2;
        assertEquals(1,com.company.doThis.share(a,b));
    }

    public void testScore() {
        doThis doThis = new doThis();
        String[][] Data = new String[3][2];
        Data [0][0] = "+" ;
        Data [0][1] = "1";
        Data [1][0] = "-";
        Data [1][1] = "1";
        Data [2][0] = "-";
        Data [2][1] = "3";
        int lastIndex = 2;
        String score = "3";
        String Control = String.valueOf(com.company.doThis.score(Data,lastIndex));
        assertEquals(score,Control);
    }
}