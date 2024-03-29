package edu.matkosoric.execution.output.global.namescope;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG1

public class GlobalNamescope {

    // how to produce output "Global:namescope" ?

    static String prefix = "Global:";
    private String name = "namescope";

    public static String getName() {
        return new GlobalNamescope().name;
    }


    public static void main(String[] args) {

        GlobalNamescope globalNamescope = new GlobalNamescope();

//        System.out.println(GlobalNamescope.prefix + GlobalNamescope.name);                  // does not compile
        System.out.println(new GlobalNamescope().prefix + new GlobalNamescope().name);
        System.out.println(GlobalNamescope.prefix + GlobalNamescope.getName());
//        System.out.println(GlobalNamescope.getName + prefix);                               // does not compile
//        System.out.println(prefix + GlobalNamescope.name);                                  // does not compile
//        System.out.println(prefix + name);                                                  // does not compile

    }

}
