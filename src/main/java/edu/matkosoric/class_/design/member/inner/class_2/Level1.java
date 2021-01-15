package edu.matkosoric.class_.design.member.inner.class_2;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

public class Level1 {

    // nested classes with identical variables

    private int level = 1;

    public static void main(String[] args) {

        Level1 x = new Level1();
        Level2 y = x.new Level2();
        Level1.Level2 y2 = x.new Level2();
//        Level2 wrongY = new Level2();           // does not compile
//        Level1.Level2 wrongY2 = new Level2();   // does not compile
        Level2 validY3 = new Level1(). new Level2();
        Level2.Level3 z = y.new Level3();
        Level2.Level3 z2 = new Level1().new Level2(). new Level3();

        z.printInfo();

    }


    class Level2 {
        private int level = 2;

        class Level3 {
            private int level = 3;
            public void printInfo () {
                System.out.println(level);              // 3
                System.out.println(this.level);         // 3
                System.out.println(Level3.this.level);  // 3
                System.out.println(Level2.this.level);  // 2
                System.out.println(Level1.this.level);  // 1
            }
        }
    }

}
