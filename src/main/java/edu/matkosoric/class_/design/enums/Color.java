package edu.matkosoric.class_.design.enums;

import java.io.Serializable;

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