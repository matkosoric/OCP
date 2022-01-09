package edu.matkosoric.execution.output.static_.numbers;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Tester {

    // what is the output ?
    // 2,5
    // 4,5
    // 4,5

    private int x;
    private static int y;

    public static void main(String[] args) {

        Tester t1 = new Tester();
        t1.x = 2;
        Tester.y = 3;
        Tester t2 = new Tester();
        t2.x = 4;
        t2.y = 5;

        System.out.println(t1.x + "," + t1.y);
        System.out.println(t2.x + "," + Tester.y);
        System.out.println(t2.x + "," + t1.y);
    }
}
