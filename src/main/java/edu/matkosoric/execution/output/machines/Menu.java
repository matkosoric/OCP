package edu.matkosoric.execution.output.machines;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Menu {

    // what is the output?
    // AUTO: Sedan
    // MEDICAL: Scanner

    enum Machine {
        AUTO("Truck"), MEDICAL("Scanner");
        private String type;

        private Machine(String type) {
            this.type = type;
        }

        private void setType(String type) {
            this.type = type;                               //line 1
        }

        private String getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        Machine.AUTO.setType("Sedan");                      //line 2
        for (Machine p : Machine.values()) {
            System.out.println(p + ": " + p.getType());     //line 3
        }
    }

}
