package edu.matkosoric.execution.output.dna;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class DNASynth {

    int tCount;
    int cCount;
    int gCount;
    int aCount;

    // which two methods modify field values? setGCount() and setAllCounts()


    void setACount(int cCount) {
        cCount = cCount;
    }

    void setTCount() {
        this.tCount = tCount;
    }

    int setCCount() {
        return cCount;
    }

    int setGCount(int g) {
        gCount = g;
        return gCount;
    }

    void setAllCounts(int x) {
        aCount = tCount = this.cCount = setGCount(x);
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
        DNASynth dnaSynth = new DNASynth();
        System.out.println(dnaSynth);

        dnaSynth.setACount(3);
        System.out.println(dnaSynth);

        dnaSynth.setTCount();
        System.out.println(dnaSynth);

        dnaSynth.setCCount();
        System.out.println(dnaSynth);

        dnaSynth.setGCount(200);
        System.out.println(dnaSynth);

        dnaSynth.setAllCounts(300);
        System.out.println(dnaSynth);

    }

}
