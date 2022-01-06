package edu.matkosoric.execution.output.duke;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Optional;

// #TAG2

public class Main {

    // what is the output?
    // Duke

    public static void main(String[] args) {

        Optional<String> value = createValue();
        String str = value.orElse("Duke");
        System.out.println(str);

    }

    private static Optional<String> createValue() {
        String s = null;
        return Optional.ofNullable(s);
    }

}