package edu.matkosoric.class_.design.enums.medals.info;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class MedalsInfo {

    // example of improper enums usage
    // new enums can not be dynamically created
    // and can not be directly added

    public static void main(String[] args) {
        Status silver = Status.SILVER;

//        System.out.println(silver + silver.getRate());         // does not compile - enums can not be added
        System.out.println(silver.getRate() + silver.getRate());

//        Status platinum = Status.addStatus(20);
//        System.out.println(platinum + platinum.getRate());
    }

}

enum Status {
    BRONZE(5), SILVER(10), GOLD(15);
    private int rate;

    private Status(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

//    public Status addStatus(int rate) {
//        return new Status(20);      // compilation fails - enum types can not be instantiated
//    }

}
