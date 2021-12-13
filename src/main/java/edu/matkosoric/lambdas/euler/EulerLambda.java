package edu.matkosoric.lambdas.euler;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class EulerLambda {

    // what is the output?
    // compilation error

    public static void main(String[] args) {

        EulerInterface myEulerInterface;
//        myEulerInterface = () -> "2.71828";                 // does not compile - should be double, not String
//        System.out.println("Value of Euler = " + myEulerInterface.getEulerValue());

        // working version would be:
//        myEulerInterface = () -> 2.71828;
//        System.out.println("Value of Euler = " + myEulerInterface.getEulerValue());

    }

}
