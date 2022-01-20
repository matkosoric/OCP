package edu.matkosoric.execution.output.dna;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class DNASynth3 {

    // insert code at line 1 to correctly modify instance variables
    // aCount = a;
    // cCount = setCCount(c);
    // setgCount(g);   

    int aCount;
    int tCount;
    int cCount;
    int gCount;

    DNASynth3(int a, int tCount, int c, int g) {
        aCount = a;                 // line 1
        cCount = setCCount(c);      // line 1
        setgCount(g);               // line 1
    }

    int setCCount(int c) {
        return c;
    }

    void setgCount(int gCount) {
        this.gCount = gCount;
    }


    @Override
    public String toString() {
        return "DNASynth3{" +
                "aCount=" + aCount +
                ", tCount=" + tCount +
                ", cCount=" + cCount +
                ", gCount=" + gCount +
                '}';
    }

    public static void main(String[] args) {

        DNASynth3 dna3 = new DNASynth3(1, 2, 3, 4);
        System.out.println(dna3);

    }

}
