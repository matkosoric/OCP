package edu.matkosoric.class_.design.animal.human.h;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import edu.matkosoric.class_.design.animal.human.a.Animal;

public abstract class Human extends Animal {

    // which of the following methods are compiling?

    protected void walk_1(){};
//    void walk_2(){};                   // does not compile - weaker access privileges
//    abstract void walk_3();            // does not compile - weaker access privileges
//    private void walk_4(){};           // does not compile - weaker access privileges
    public abstract void walk_5();

}
