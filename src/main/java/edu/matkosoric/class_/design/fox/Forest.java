package edu.matkosoric.class_.design.fox;

public interface Forest extends Habitat {

    default void inhabit() {
        System.out.println("Inhabiting forrest");
    }

}
