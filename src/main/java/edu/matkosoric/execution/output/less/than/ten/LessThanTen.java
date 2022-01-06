package edu.matkosoric.execution.output.less.than.ten;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class LessThanTen {

    // reproduce output of while statement with for loop

    public static void main(String[] args) {

        int x = 0;
        while (x < 10) {
            System.out.print(x++);
        }

        System.out.println();
        
        // solution
        for (int x2 = 0; x2 < 10; ) {
            System.out.print(x2++);
        }


    }

}
