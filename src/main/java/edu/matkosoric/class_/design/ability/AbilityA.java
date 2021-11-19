package edu.matkosoric.class_.design.ability;

public interface AbilityA {
    default void action() {
        System.out.println("AbilityA action");
    }
}
