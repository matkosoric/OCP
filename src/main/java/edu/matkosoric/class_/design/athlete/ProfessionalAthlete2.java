package edu.matkosoric.class_.design.athlete;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Map;

public class ProfessionalAthlete2 extends Athlete {

    // what can be used as method body to compile this class?

    public void set(Map<String, String> map) {
//        map.forEach((k, v) -> set(v)));   // does not compile
    }

}
