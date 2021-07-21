package edu.matkosoric.class_.design.fox;

public interface Town extends Habitat{

    default void inhabit() {
        System.out.println("Inhabiting town");
    }

}
