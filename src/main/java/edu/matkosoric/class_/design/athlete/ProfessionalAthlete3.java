package edu.matkosoric.class_.design.athlete;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Map;

public class ProfessionalAthlete3 extends Athlete {

    // what can be used as method body to compile this class?

    public void set(Map<String, String> map) {
        set(map.values());
    }

}
