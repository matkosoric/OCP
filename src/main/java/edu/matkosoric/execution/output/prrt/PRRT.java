package edu.matkosoric.execution.output.prrt;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG1

public class PRRT {

    // what has to be added to line 1 in order to output PRRT
    // continue a;

    public static void main(String[] args) {
        StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
        int i = 0;
        a:
        while (i < txt1.length()) {
            char x = txt1.charAt(i);
            int j = 0;
            i++;
            b:
            while (j < txt1.length()) {
                char y = txt1.charAt(j);
                if (i != j && y == x) {
                    txt1.deleteCharAt(j);
                    continue a;      //LINE 1
                }
                j++;

            }
        }
        System.out.println(txt1);
    }

}
