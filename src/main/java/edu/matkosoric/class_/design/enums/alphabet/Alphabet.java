package edu.matkosoric.class_.design.enums.alphabet;

public enum Alphabet {
    A, B, C;
//    final String getFirstLetter1() { return A.toString(); }
    static String getFirstLetter2() { return Alphabet.values()[1].toString(); }     // prints B
    static String getFirstLetter3() { return A.toString(); }
//    String getFirstLetter4() { return A.toString(); }
}

