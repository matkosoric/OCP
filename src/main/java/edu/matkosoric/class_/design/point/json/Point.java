package edu.matkosoric.class_.design.point.json;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Point {

    // how should custom JsonField annotation look like
    // for Point class to compile?

    @JsonField(type = JsonField.Type.STRING, name = "name")
    private String _name;

    @JsonField(type = JsonField.Type.INT)
    private int x;

    @JsonField(type = JsonField.Type.INT)
    private int y;

    public static void main(String[] args) {
        new Point();
    }

}
