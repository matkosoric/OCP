package edu.matkosoric.class_.design.athlete;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Map;

public class ProfessionalAthlete5 extends Athlete {

    // what can be used as method body to compile this class?

    public void set(Map<String, String> map) {
        super.set(map.values());
    }

}
