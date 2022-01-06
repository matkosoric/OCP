package edu.matkosoric.class_.design.extending.numbers2;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.Set;

public class Foo {

    // which methods in extended class successfully compile?
    // public ArrayList<Number> foo(Set<CharSequence> m)
    // public List<Integer> foo(TreeSet<String> m)

    public List<Number> foo (Set<CharSequence> m) {
        return null;
    }

}
