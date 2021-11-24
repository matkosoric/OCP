package edu.matkosoric.class_.design.student.B;

//import A.Test;                                            // does not compile
import edu.matkosoric.class_.design.student.A.Test;       // proper import

public class Main {

    public static void main(String[] args) {

        Test test = new Test("Student");
        System.out.println(test);

    }

}
