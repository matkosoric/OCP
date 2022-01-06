package edu.matkosoric.class_.design.equality;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Book {

    // without overridden hashCode() and equals(), two compared
    // Book instances would be considered to be different
    //

    private int ISBN;
    private String title;
    private String author;
    private int pageCount;

    @Override
    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        } else {
            Book parameterBook = (Book) obj;
            return this.ISBN == parameterBook.ISBN;
        }
    }

    public static void main(String[] args) {

        Book bible = new Book();
        bible.ISBN = 1;

        Book kuran = new Book();
        kuran.ISBN = 1;

        System.out.println(bible.hashCode());
        System.out.println(kuran.hashCode());

        System.out.println(bible.equals(kuran));

    }
}
