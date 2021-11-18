package edu.matkosoric.execution.output.counting;

public class Main {

    // if run with: java Main.java one two three
    // output will be:
//    1) one
//    2) two
//    3) three

    // if run with: java Main one two three
    // it will error out
    public static void main(String[] args) {

        int i = 1;
        for (String s : args) {
            System.out.println((i++) + ") " + s);
        }

    }
}
