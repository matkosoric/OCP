package edu.matkosoric.execution.output.something.happened;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

// #TAG1

public class Test {

    // in order to print "Something happened", what should
    // GeneralException and SpecificException extend?
    // Exception and GeneralException

    public static void doThings() throws GeneralException {
        try {
            throw new RuntimeException("Something happened");
        } catch (Exception e) {
            throw new SpecificException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Test.doThings();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class GeneralException extends Exception {                  /* line 1 */
    public GeneralException(String s) {
        super(s);
    }
}

class SpecificException extends GeneralException {         /* line 2 */
    public SpecificException(String s) {
        super(s);
    }
}