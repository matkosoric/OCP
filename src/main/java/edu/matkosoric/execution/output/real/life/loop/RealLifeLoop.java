package edu.matkosoric.execution.output.real.life.loop;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class RealLifeLoop {

    public static void main(String[] args) {

        // what is the output sequence from the latest print statement of this vividly real-life loop?
        // 0 4 7 10

        for (var i = 0; i < 10; i++) {

            switch (i % 5) {

                case 2:
                    System.out.println("i: " + i + "; i % 5: " + i % 5 + " ");
                    i *= i;
                    break;
                case 3:
                    System.out.println("i: " + i + "; i % 5: " + i % 5 + " ");
                    i++;
                    break;
                case 1:
                    System.out.println("i: " + i + "; i % 5: " + i % 5 + " ");
                case 4:
                    System.out.println("i: " + i + "; i % 5: " + i % 5 + " ");
                    i++;
                    break;
                default:
                    System.out.println("i: " + i + "; i % 5: " + i % 5 + " ");
                    break;
            }

            System.out.println(i + " ");
            i++;

        }


    }

}
