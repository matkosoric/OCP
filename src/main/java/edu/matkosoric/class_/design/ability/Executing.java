package edu.matkosoric.class_.design.ability;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Executing implements AbilityA, AbilityB{

    // what is the output?
    // class action
    // implemented method has priority over default interface method

    public void action(){
        System.out.println("class action");
    }

    public static void main(String[] args) {
        AbilityB x = new Executing(); // line n2
        x.action();
    }

//    @Override
//    public void action() {
//        AbilityA.super.action();        // outputs: AbilityA action
//    }
}
