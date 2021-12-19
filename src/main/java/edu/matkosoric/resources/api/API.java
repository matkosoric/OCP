package edu.matkosoric.resources.api;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public interface API {                                      //line 1

    // change code so current API interface uncommented isValueANumber() method compiles

    public void checkValue(Object value)
            throws IllegalArgumentException;                //line 2

//    public boolean isValueANumber(Object val) {
//        if (val instanceof Number) {
//            return true;
//        } else {
//            try {
//                Double.parseDouble(val.toString());
//                return true;
//            } catch (NumberFormatException ex) {
//                return false;
//            }
//        }
//    }
}
