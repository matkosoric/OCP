package edu.matkosoric.class_.design.drug.administration;

public class DrugAdministration {

    // which method will compile?

    public boolean inhale(int a) {
        return a > 0;
    }

    ;

//    Does not compile
//    Missing return statement. println() does not return anything.
//    public String inject () {
//        System.out.println("Injecting");
//    };

//    Does not compile
//    type mismatch
//    public char smoke (String substance) {
//        return substance;
//    }

//    Does not compile
//    void and return are in contradiction
//    public void snort (int amount) {
//        return ++amount;
//    }

    public void swallow() {
        System.out.println("now");
    }

}
