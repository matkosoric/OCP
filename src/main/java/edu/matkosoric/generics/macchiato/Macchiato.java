package edu.matkosoric.generics.macchiato;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Macchiato<T> {

    T t;

    public Macchiato(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {

        System.out.print(new Macchiato<String>("Macc"));
        System.out.println(new Macchiato("hiato"));

    }

}
