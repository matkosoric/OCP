package edu.matkosoric.lambdas.biconsumer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    // demonstration of BiConsumer functional interface

    public static void main(String[] args) {

        HashMap<Integer,String> whitneyHustonAlbums = new HashMap<>();
        whitneyHustonAlbums.put(1990, "I'm Your Baby Tonight");
        whitneyHustonAlbums.put(1998, "My Love Is Your Love");
        whitneyHustonAlbums.put(2009, "I Look to You");

        HashMap<String, Integer> reversedColumnsWHA = new HashMap<>();

        // a simple way to reverse 'columns' in a map
        BiConsumer<Integer, String> biConsumer = (a,b) -> reversedColumnsWHA.put(b,a);
        whitneyHustonAlbums.forEach(biConsumer);

        whitneyHustonAlbums.forEach((a,b) -> System.out.println(a + ": " + b));
        reversedColumnsWHA.forEach( (a,b) -> System.out.println(a + ": " + b));

    }

}
