package edu.matkosoric.class_.design.capital.city;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class France extends EuropeanUnion {

    // does not compile - methods look the same after type erasure, but are not in override relationship
//    public Collection<String> havingCapitalCity(Collection<String> arg) {return null;}

}
