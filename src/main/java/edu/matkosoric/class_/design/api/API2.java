package edu.matkosoric.class_.design.api;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

// #TAG2

public abstract class API2 {                                                            //line 1

    // line 1. abstract class API
    // line 2. abstract void checkValue

    public abstract void checkValue(Object value) throws IllegalArgumentException;      //line 2

    public boolean isValueANumber2(Object val) {
        if (val instanceof Number) {
            return true;
        } else {
            try {
                Double.parseDouble(val.toString());
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }
}
