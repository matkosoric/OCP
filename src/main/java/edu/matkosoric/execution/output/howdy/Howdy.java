package edu.matkosoric.execution.output.howdy;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Howdy {

    // what is the output?
    // 4

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDY");
        System.out.println(sb);
        sb.insert(0, ' ');
        System.out.println(sb);
        sb.replace(3, 5, "LL");
        System.out.println(sb);
        sb.insert(6, "COW");
        System.out.println(sb);
        sb.delete(2, 7);
        System.out.println(sb);
        System.out.println(sb.length());
    }

}
