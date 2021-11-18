package edu.matkosoric.lambdas.supplier;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.Supplier;

public class SupplyExample2 {

    // demonstration of Supplier functional interface

    public static void main(String[] args) {

        Dexter d = new Dexter();

        Dexter dexterCreated1 = create(() -> d);
        Dexter dexterCreated2 = create(() -> d);    // both lambdas return the same object

        // at the end, all variables refer to the same object
        System.out.println(d.equals(dexterCreated1));
        System.out.println(d.equals(dexterCreated2));
        System.out.println(dexterCreated1.equals(dexterCreated2));

    }

    public static Dexter create(Supplier<Dexter> dexParam) {
        return dexParam.get();
    }

}

class Dexter {

    public Dexter() {
        System.out.println("Dexter object created.");
    }

}
