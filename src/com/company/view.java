package com.company;

public class view {

    public static void doView(String[][] date, int score, int lastIndex){
        if(lastIndex > 0) {
            String mathematicalOperation = date[lastIndex][1];

            for (int i = 0; i < lastIndex; i++) {
                mathematicalOperation = mathematicalOperation + date[i][0] + date[i][1];
            }

            System.out.println(mathematicalOperation + "=" + score);
        }
        else {
            System.out.println(date[lastIndex][1]);
        }
        return;
    }
}
