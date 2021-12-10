package edu.matkosoric.class_.design.chocolate.cookie;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */


// will following code compile?
// no, ChocolateCookie can extend, not implement Cookie class

public interface Pastry {
    void getIngredients();
}

abstract class Cookie implements Pastry {
}

//class ChocolateCookie implements Cookie {       // point of failure for compilation
//    public void getIngredients() {
//    }
//}
//
//class CoconutChocolateCookie extends ChocolateCookie {
//    void getIngredients(int y) {
//    }
//}

class ChocolateCookie2 extends Cookie {       // working version
    public void getIngredients() {
    }
}

class CoconutChocolateCookie2 extends ChocolateCookie2 {
    void getIngredients(int y) {
    }
}