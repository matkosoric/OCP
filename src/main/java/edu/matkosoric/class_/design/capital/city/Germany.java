package edu.matkosoric.class_.design.capital.city;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Collection;
import java.util.stream.Stream;

public class Germany extends EuropeanUnion {

    // compiles
    // does not overload parent method
    public <T> Collection<T> havingCapitalCity(Stream<T> arg) {
        return null;
    }

}
