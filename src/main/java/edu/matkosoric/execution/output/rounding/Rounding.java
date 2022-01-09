package edu.matkosoric.execution.output.rounding;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Rounding {

    // pick line 1 so output is 1.17
    // float z = Math.round((float) x / y * 100) / (float) 100;

    public static void main(String[] args) {

        byte x = 7, y = 6;
        float z1 = Math.round((float) x / y * 100) / (float) 100;   // correct
        System.out.println(z1);

        float z2 = (float) (Math.round((float) x / y * 100) / 100);
        System.out.println(z2);

//        float z3 = Math.round((int) (x / y), 2);                // does not compile

//        float z4 =  Math.round((float) x / y, 2);      // does not compile

    }

}
