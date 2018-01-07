package edu.matkosoric.collections.true_.detective;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.HashMap;
import java.util.Map;

public class TrueDetective {

    public static void main(String[] args) {

        Map <String, Long> teamMap = new HashMap<>();

//        teamMap.add ("Rust Cohle", 1L);  // does not compile, add is not a Map method.
//        teamMap.put("Ruth Cohle", 1);    // does not compile, second parameter has to be Long, not int
        teamMap.put("Ruth Cohle", 1L);
        teamMap.put("Martin Hart", 2L);
//        teamMap.put("Ray Velcoro", new Double (3));     // does not compile
//        teamMap.put("Ray Velcoro", 3.0f);               // does not compile
//        teamMap.put('R', 3l);                           // does not compile

    }

}
