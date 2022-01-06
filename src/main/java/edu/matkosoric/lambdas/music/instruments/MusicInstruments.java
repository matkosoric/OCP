package edu.matkosoric.lambdas.music.instruments;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class MusicInstruments {

    // which interface can be used in lambda expression?


    public static void main(String[] args) {


//        PlayingLeadGuitar lambda1 = () -> {
//            System.out.println("Playing...");
//            return 2;
//        };

        PlayingDrums lambda2 = () -> {
            System.out.println("Playing...");
            return true;
        };

//        PlayingBass lambda3 = () -> {
//            System.out.println("Playing...");
//        };
//
//        PlayingKeyboard lambda4 = () -> {
//            System.out.println("Playing...");
//            return true;
//        };

    }

}


// Does not compile
// Failing with: private interface methods are not supported in -source 8
//interface PlayingLeadGuitar {
//    public int play() throws Exception;
//    private void play2() {;}
//}

interface PlayingDrums {
    public static void play() {
        ;
    }

    public boolean play2();
}

// Does not compile if used in lambda expression
// Functional interface must have only one abstract method
interface PlayingBass {
    public void play();

    public void play2(String str);
}

// Does not compile if used in lambda expression
// Functional interface must have only one abstract method
interface PlayingKeyboard {
    public void play();

    public void play2();
}

// Does not compile
// static method in interface must have a body.
//interface PlayingRhythmGuitar {
//    public static void play ();
//    public void play2 (String str);
//}
