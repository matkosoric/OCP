package edu.matkosoric.class_.design.enums;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.Serializable;

// #TAG2

public enum Color implements Serializable {
    R(1), G(2), B(3);
    int c;

    // does not compile
//    public Color(int c) {
//        this.c = c;
//    }

    private Color(int c) {
        this.c = c;
    }

}