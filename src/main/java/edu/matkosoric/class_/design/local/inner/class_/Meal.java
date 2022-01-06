package edu.matkosoric.class_.design.local.inner.class_;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Meal {

    // local inner classes are restricted to the specific method

    String meal = "I am a healthy meal!";

    public static void main(String[] args) {

        Meal x = new Meal();
        x.eating();

        System.out.println();
    }

    public void eating() {


//        new Soup();     // does not compile before the class
        class Soup {
            public void soup() {
                System.out.println("eating soup");
            }
        }
        new Soup();

        class MainDish {
            public void eatingMainDish() {
                System.out.println("eating main dish");
            }
        }

        class Dessert {
            public void dessert() {
                System.out.println("eating dessert");
            }
        }

        new Soup().soup();
        new MainDish().eatingMainDish();
        new Dessert().dessert();

        // local inner classes can not have access modifiers
//        protected class Candy {}       // does not compile

        // local inner classes can not be static
//        static class FastFood {}        // does not compile

        // local inner classes can not have static members
        class JunkFood {
//            static int lifeExpectancy = 40;     // does not compile
        }

        // local inner class has access to all elements of outer class
        class Spoon {
            String spoonOf = meal;

            public void info() {
                System.out.println(spoonOf);
            }
        }

        new Spoon().info();

    }
}
