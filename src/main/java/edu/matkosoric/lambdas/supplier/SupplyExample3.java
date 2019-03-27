package edu.matkosoric.lambdas.supplier;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.TreeMap;
import java.util.function.Supplier;

public class SupplyExample3 {

    // demonstration of Supplier functional interface

    // static variables are used to pass values
    static Integer staticYear;
    static String staticTitle;

    public static void main(String[] args) {

        Supplier<cmNovel> cormacMcCarthyGenerator = SupplyExample3::createNovel;

        TreeMap<Integer, String> cmMap = new TreeMap<>();
        cmMap.put(1985, "Blood Meridian");
        cmMap.put(2005, "No Country for Old Men");
        cmMap.put(2006, "The Road");
        cmMap.put(1968, "Outer Dark");

        cmMap.forEach((year, title) -> {    staticYear = year;
                                            staticTitle = title;
                                            cmNovel tempNovel = cormacMcCarthyGenerator.get();
            System.out.println("TITLE: " + tempNovel.title + ", YEAR: " + tempNovel.year);
        });


    }

    public static cmNovel createNovel () {
                return new cmNovel(staticYear, staticTitle);
    }

}

class cmNovel {

    public Integer year;
    public String title;

    public cmNovel(Integer year, String title) {
        this.year = year;
        this.title = title;
    }
}
