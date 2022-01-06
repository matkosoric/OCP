package edu.matkosoric.execution.output.float_.validation;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class FloatValidation {

    // what is the output?
    // compilation fails

    static float validte3(String s, float min, float max) throws IllegalArgumentException {
        Float f = Float.parseFloat(s);
        if (!Float.isFinite(f) || f < min || f > max) {
//            throws new IllegalArgumentException();  // does not compile - throw instead of throws would work
        }
        return f;
    }

}
