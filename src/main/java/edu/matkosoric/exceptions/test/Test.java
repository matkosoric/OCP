package edu.matkosoric.exceptions.test;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG1

public class Test {


    // how does line 1 has to look like to compile this class
    // catch (Exception e)

    class L extends Exception {
    }

    class M extends L {
    }

    class N extends RuntimeException {
    }

    public void p() throws L {
        throw new M();
    }

    public void q() throws N {
        throw new N();
    }

    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.p();
            t.q();
        } catch (Exception e) { /* line 1 */
            System.out.println("Exception caught");
        }
    }

}