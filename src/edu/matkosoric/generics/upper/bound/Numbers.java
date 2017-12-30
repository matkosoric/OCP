package edu.matkosoric.generics.upper.bound;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;

public class Numbers {

    // example of limiting generics with the upper bound
    // integer, long, byte etc. are extending abstract class Number.

    public static void main(String[] args) {

        ArrayList <? super Number> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(new Integer(1));
        numbers.add(2L);
        numbers.add(new Long(2));
        numbers.add(3.0D);
        numbers.add(new Double(3.0));
        numbers.add(4.0F);
        numbers.add(new Float(4.0));
        numbers.add(Short.parseShort("5"));
        numbers.add(Byte.parseByte("6"));

        System.out.println(numbers);

    }

}
