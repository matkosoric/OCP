package edu.matkosoric.class_.design.equality;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

public class Picasso {

    // String class overrides equals() method,
    // and checks for value equality,
    // while == operator checks for object equality,

    public static void main(String[] args) {

        String originalPicasso = "Original Picasso";
        String duplicate = new String("Original Picasso");

        System.out.println(originalPicasso.hashCode());
        System.out.println(duplicate.hashCode());

        System.out.println(originalPicasso == duplicate);
        System.out.println(originalPicasso.equals(duplicate));

    }
}
