package edu.matkosoric.class_.design.capital.city;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Collection;

public class Austria extends EuropeanUnion {

    // compiles
    // does not overload parent method because of name difference
    public <T> Collection<T> havingCapitalCity2(Collection<T> arg) {
        return null;
    }

}
