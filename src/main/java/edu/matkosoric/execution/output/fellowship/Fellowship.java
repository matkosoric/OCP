package edu.matkosoric.execution.output.fellowship;

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
