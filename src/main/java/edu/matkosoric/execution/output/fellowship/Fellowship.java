package edu.matkosoric.execution.output.fellowship;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Fellowship {

    // what statements are working?

    public static void main(String[] args) {


        var fellowship1 = Map.of("Frodo", 1, "Gandalf", 1);
//        var fellowship2 = ArrayList.of("Frodo", "Gandalf");           // does not compile
        Set<String> fellowship3 = Set.of("Boromir", "Aragorn");
//        var fellowship4 = List.of("Frodo",null,"Gandalf");            // does not compile: NullPointerException
//        var fellowship5 = Set.of("Frodo", "Sam", "Frodo");            // does not compile: duplicate element
//        var fellowship6 = Arrays.of("Frodo","Gandalf", "Aragorn");    // does not compile
        List<String> fellowship7 = List.of("Legolas", "Pippin");


        // <string, integer> does not match String
//        for (String character : fellowship1)
//            System.out.println(character);

        for (String character : fellowship3)
            System.out.println(character);

        // would be possible to loop through, if it was a proper Set
//        for (String character : fellowship5)
//            System.out.println(character);

        for (String character : fellowship7)
            System.out.println(character);
    }

}
