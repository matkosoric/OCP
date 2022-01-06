package edu.matkosoric.execution.output.extending.numbers;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class ExtendingNumbers {

    // what lists compile ?


    List<? super Short> list1 = new ArrayList<Number>();

//    List<? super Number> list2 = new ArrayList<Integer>();      // does not compile
//
    List<? extends Number> list3 = new ArrayList<Byte>();

//    List<? extends Number> list4 = new ArrayList<Object>();      // does not compile

//    List<? super Float> list5 = new ArrayList<Double>();       // does not compile

}
