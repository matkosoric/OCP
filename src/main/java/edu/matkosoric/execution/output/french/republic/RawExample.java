package edu.matkosoric.execution.output.french.republic;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Iterator;
import java.util.List;

public class RawExample {

    public static void main(String[] args) {

        {
            Iterator loop = List.of(1, 2, 3).iterator();
            while (loop.hasNext()) {
                foo(loop.next());
            }

            Iterator loop2 = List.of(1, 2, 3).iterator();
            while (loop2.hasNext()) {
                bar(loop2.next());
            }
        }

//        for (Iterator loop2 = List.of(1, 2, 3).iterator(); loop.hasNext(); ) {      // point of failure - loop.hasNext()
//            bar(loop2.next());
//        }

        for (Iterator loop = List.of(1, 2, 3).iterator(); loop.hasNext(); ) {
            bar(loop.next());
        }


    }

    public static void foo(Object iteratedObject) {
        System.out.println("dummy");
    }

    public static void bar(Object iteratedObject) {
        System.out.println("dummy 2");
    }

}
