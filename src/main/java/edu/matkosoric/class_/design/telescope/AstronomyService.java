package edu.matkosoric.class_.design.telescope;

public interface AstronomyService {
    private void detectPlanet() {
    }

    default void calibrate(int minItems) {
        System.out.println("Calibrated");
    }
}
