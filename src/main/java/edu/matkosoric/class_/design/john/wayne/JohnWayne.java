package edu.matkosoric.class_.design.john.wayne;

public class JohnWayne extends Man implements Cowboy {

    // out of five statements, see which compile

    public void ridingHorse(String first) {
    }

    public void ridingHorse(String first, String second) {
    }

    public static void main(String[] args) {
        Cowboy theInstance = new JohnWayne();

//        theInstance.ridingHorse(Man.origin, Cowboy.origin);     // does not compile
        theInstance.ridingHorse(Man.origin);
//        theInstance.ridingHorse(origin);                        // does not compile
        ((JohnWayne) theInstance).ridingHorse("Japan", "Mexico");
        theInstance.ridingHorse("France");

    }
}
