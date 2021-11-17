package edu.matkosoric.execution.output.car;

public interface CarInterface {

    // see which statements are valid in interface

    public abstract void driveForward();

    // does not compile - method can not be final
//    final void driveBackward () {
//        System.out.println("Drive backward");
//    }

    // does not compile - method can not be both private and abstract
//    private abstract void honk();

    public String changeGear();

    // does not compile - variable not innitialized
//    public int wheels;

    // does not compile - interface method can not be final
//    final void openDoor();

    // does not compile - interface method can not have implementation (if not default)
//    public void openWindow(){System.out.println("Opening window...");}

}
