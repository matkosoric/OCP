package edu.matkosoric.execution.output.hat;

public class Hat {

    // what is the outout?

    public static void main(String[] args) {

        String s = "hat at store";
        int x = s.indexOf("at");
        s.substring(x + 3);
        x = s.indexOf("at");
        System.out.println(s + " " + x);

    }
}
