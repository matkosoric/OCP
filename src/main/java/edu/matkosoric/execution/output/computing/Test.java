package edu.matkosoric.execution.output.computing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Test {

    // what is the output?
    // 3

    private int sum;

    public int compute() {
        int x = 0;
        while (x < 3) {
            sum += ++x;
        }
        return sum / 4;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int sum = t.compute();
        sum = t.compute();
        t.compute();
        System.out.println(sum);
    }
}
