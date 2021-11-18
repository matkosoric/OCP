package edu.matkosoric.class_.design.avatar;

public class Avatar extends GameObject{

    // in first case, method move() first executes local method, then parent method
    // in the second call, move() directly executes parent method, because of the Integer type

    // output is:
    // Move Character
    // Move GameObject
    // Move GameObject

    public Object [] move (Number x, Number y) {
        System.out.println("Move Character");
        return super.move (x.intValue(), y.intValue());
    }

    public static void main(String[] args) {

        var character = new Avatar();
        character.move(10.0, 10.0);
        character.move(10, 10);

    }

}
