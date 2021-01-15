package edu.matkosoric.generics.upper.bound;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    // example of limiting generics with the upper bound
    // integer, long, byte etc. are extending abstract class Number.

    public static void main(String[] args) {

        List<? super Number> numbers = new ArrayList<>();

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
//        numbers.add("numbers");     // does not compile
//        numbers.add(false);         // does not compile
//        numbers.add('n');           // does not compile

        System.out.println(numbers);

    }

}
