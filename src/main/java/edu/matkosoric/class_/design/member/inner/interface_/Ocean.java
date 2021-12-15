package edu.matkosoric.class_.design.member.inner.interface_;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Ocean {

    // inner class can use inner interface

    public static void main(String[] args) {

        Fish x = new Ocean().new Fish();
        x.swim();

        Land.Bear y = new Land().new Bear();
        y.swim();
    }

    class Fish implements Swimming {
        @Override
        public void swim() {
            System.out.println("this fish is swimming.");
        }
    }

    interface Swimming {
        public void swim();
    }

}

class Land {

    // inner member class in other outer class can use the same interface

    class Bear implements Ocean.Swimming {
        @Override
        public void swim() {
            System.out.println("bears are able to swim in this bizarre programming example.");
        }
    }

}
