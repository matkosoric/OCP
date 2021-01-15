package edu.matkosoric.collections.lambdas;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.*;
import java.util.function.BiFunction;

public class HenryMillerAndActorsOnB {

    // demo of lambdas in Collections

    public static void main(String[] args) {

        Collection<String> hmNovels = new ArrayList<>();
        hmNovels.add("Tropic of Cancer");
        hmNovels.add("Black Spring");
        hmNovels.add("Tropic of Capricorn");
        hmNovels.add("The Rosy Crucifixion");
        hmNovels.add("Aller Retour New York");

        System.out.println(hmNovels);

        // forEach()
        hmNovels.forEach(System.out::println);

        // removeIf()
        hmNovels.removeIf(s -> s.startsWith("Aller"));
//        hmNovels.removeIf(String::startsWith("Tropic"));    // does not compile, static context
        System.out.println(hmNovels);

        // replaceAll()
        List<Integer> years = Arrays.asList(1950, 1963, 1972, 1986, 1998);
        years.replaceAll(a -> a + 10);      // adds 10 years to each entry
        System.out.println(years);

        // merge()
        BiFunction<String, String, String> mapper = ( s1, s2) -> {if(s1.startsWith("B"))
                                                                        return s1;          // do not change value if it starts with B
                                                                    else if( s2.startsWith("B"))
                                                                        return s2;          // if new value start with B, replace it
                                                                    return null;};          // if neither values start with "B", delete entry
        Map<Integer, String> actorsWithSurnameOnB = new HashMap<>();
        actorsWithSurnameOnB.put(1,"Buschemi, Steve");
        actorsWithSurnameOnB.put(2,"Butler, Gerard");
        actorsWithSurnameOnB.put(3,"Depardieu, Gerard");
        actorsWithSurnameOnB.put(4,"Willis, Bruce");
        actorsWithSurnameOnB.put(5, "DiCaprio, Leonardo");      // merge() is not called on the item with key 5, so it remains in the final results

        actorsWithSurnameOnB.merge(1, "Bloom, Orlando", mapper);
        actorsWithSurnameOnB.merge(2, "Clooney, George", mapper);
        actorsWithSurnameOnB.merge(3, "Banderas, Antonio", mapper);
        actorsWithSurnameOnB.merge(4, "Depp, Johhny", mapper);      // this will delete delete the entry by returning null

        System.out.println(actorsWithSurnameOnB);

    }
}
