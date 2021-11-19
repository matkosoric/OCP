package edu.matkosoric.class_.design.harry.potter;

public class ExecuteHarryPotter {

    // what is the output?
    // Good Night, Potter
    // greeting() method is called on type, and field name() on instance

    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + ", "+ s.name());
    }

}
