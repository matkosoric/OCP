package edu.matkosoric.class_.design.fox;

public class Squirrel implements Forest {

    // Squirrel class implements only one interface with default method implementation,
    // and therefore does not have to provide its own implementation

    public static void main(String[] args) {

        new Squirrel().inhabit();

    }

}
