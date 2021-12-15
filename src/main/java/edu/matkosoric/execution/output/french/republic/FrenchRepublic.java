package edu.matkosoric.execution.output.french.republic;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Iterator;
import java.util.List;

public class FrenchRepublic {

    // what breaks compilation?
    // iter2 in second for loop

    public static void main(String[] args) {

       Iterator iter1 = List.of (1870, 1946, 1958).iterator();
       while (iter1.hasNext()) {
           dummyMethod(iter1.next());
       }

        Iterator iter2 = List.of (1870, 1946, 1958).iterator();
        while (iter1.hasNext()) {                                   // notice iter1 !
            dummyMethod2(iter2.next());
        }

        for (Iterator iter = List.of(1870, 1946, 1958).iterator(); iter.hasNext();) {
            dummyMethod(iter.hasNext());
        }

//        for (Iterator iter2 = List.of(1870, 1946, 1958).iterator(); iter.hasNext();) { // point of failure - iter.hasNext()
//            dummyMethod2(iter2.hasNext());
//        }


    }

    public static void dummyMethod (Object iteratedObject) {
        System.out.println("dummy");
    }

    public static void dummyMethod2 (Object iteratedObject) {
        System.out.println("dummy 2");
    }

}
