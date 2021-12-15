package edu.matkosoric.execution.output.custom.type;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

class CustomType<T> {
    public <T> int count(T[] anArray, T element) {
        int count = 0;
        for (T e : anArray) {
            if (e.equals(element)) ++count;
        }
        return count;
    }
}