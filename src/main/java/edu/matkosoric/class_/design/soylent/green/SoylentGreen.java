package edu.matkosoric.class_.design.soylent.green;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG2

public class SoylentGreen {

    // how to change code so it compiles?
    // at (at position 3)
    // public void z() { }
}


interface A {
    abstract void x();
}

abstract class B /* position 1*/ {

    /* position 2 */
    public void x() {
    }

    public abstract void z();
}

class C extends B implements A {
    public void z() { } /* position 3 */
}
