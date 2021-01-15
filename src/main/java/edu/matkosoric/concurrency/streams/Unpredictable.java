package edu.matkosoric.concurrency.streams;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class Unpredictable {

    public static void main(String[] args) {

        // first number will always be 1
        // second number can not be predicted

        Integer firstNumber = Arrays.asList(1,2,3,4,5).stream().findAny().get();
        System.out.println(firstNumber);

        synchronized (firstNumber) {
            Integer secondNumber = Arrays.asList(5,3,1,2,4,9,6,8,7,11,12,13,14,15,16,17,18,19,20)
                                        .parallelStream()
                                        .sorted()
                                        .findAny()
                                        .get();
            System.out.println(secondNumber);
        }
    }
}
