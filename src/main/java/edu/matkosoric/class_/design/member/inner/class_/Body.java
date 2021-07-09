package edu.matkosoric.class_.design.member.inner.class_;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Body {

    // member inner class belongs to the outer class
    // just like its methods and variables.

    private boolean organFlag = false;
    public void printInfo() {
        System.out.println("Hi! I am body. I contain organs.");
    }

    public static void main(String[] args) {

        Body body = new Body();
        body.printInfo();

        // two different ways to access printInfo() method
        Liver liver = body.new Liver();
        liver.printInfo();
        body.new Brain().printInfo();

        if (liver.organFlag) System.out.println("LIVER: I am an organ.");
        if (!body.organFlag) System.out.println("BODY: I am not an organ.");

    }

    class Liver {
        boolean organFlag = true;
        public void printInfo () {
            System.out.println("Hi! I am liver. I am an organ in the torso.");
        }
    }

    class Brain {
        boolean organFlag = true;
        public  void printInfo() {
            System.out.println("Hi! I am brain. I am an organ in the head.");
        }
    }

}
