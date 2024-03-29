package edu.matkosoric.class_.design.tea;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Collection;

class Tea extends Water {

    public void print(Object obj) {
        System.out.println("[" + obj + "]");
    }

    // Does not compile
//    public void print(Object... objects){
//        for (Object object : objects){
//            System.out.println("[" + object + "]");
//        }
//    }

    public void print(Collection collection) {
        print(collection.toArray());
    }

}