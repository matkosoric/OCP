package edu.matkosoric.execution.output.rambo;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Rambo2 extends Rambo1{

    // what is the output?
    // Rambo II

    protected void print(){
        System.out.println("Rambo II");
    }

    public static void main(String[] args) {
        Rambo2 rambo2 = new Rambo2();
        ((Rambo1)rambo2).print();
    }

}
