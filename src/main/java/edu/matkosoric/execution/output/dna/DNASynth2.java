package edu.matkosoric.execution.output.dna;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class DNASynth2 {

    // which settters will have effect

    int tCount;
    int cCount;
    int gCount;
    int aCount;

    int setCCount(int c) {
        return c;
    }

    void setGCount(int gCount) {
        this.gCount = gCount;
    }

    void setAllCounts(int a, int tCount, int c, int g) {
//        setCCount(c) = cCount;
        tCount = tCount;
        setGCount(g);
        cCount = setCCount(c);
        aCount = a;
    }

    @Override
    public String toString() {
        return "DNSSynth{" +
                "tCount=" + tCount +
                ", cCount=" + cCount +
                ", gCount=" + gCount +
                ", aCount=" + aCount +
                '}';
    }

    public static void main(String[] args) {

        // baseline case
        DNASynth2 dnaSynth = new DNASynth2();
        System.out.println(dnaSynth);

        dnaSynth.setCCount(55);
        System.out.println(dnaSynth);

        dnaSynth.setAllCounts(400, 401, 402, 403);
        System.out.println(dnaSynth);

    }

}
