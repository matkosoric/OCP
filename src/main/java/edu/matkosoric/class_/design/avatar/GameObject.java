package edu.matkosoric.class_.design.avatar;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class GameObject {

    public Object[] move(int x, int y) {
        System.out.println("Move GameObject");
        return new Integer[]{x + 10, y + 10};
    }

}
