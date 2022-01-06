package edu.matkosoric.class_.design.extending.final_;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public final class X {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return getName();
    }
}
