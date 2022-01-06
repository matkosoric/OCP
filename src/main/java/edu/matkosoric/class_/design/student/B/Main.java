package edu.matkosoric.class_.design.student.B;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

//import A.Test;                                            // does not compile
import edu.matkosoric.class_.design.student.A.Test;       // proper import

public class Main {

    public static void main(String[] args) {

        Test test = new Test("Student");
        System.out.println(test);

    }

}
