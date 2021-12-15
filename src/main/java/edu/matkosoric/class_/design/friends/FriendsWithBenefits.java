package edu.matkosoric.class_.design.friends;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class FriendsWithBenefits extends Friends {
    int num; //line n2

    FriendsWithBenefits(short num) { // line n3
        super(num);
    }

//    protected void method() { //line n4       // does not compile - overridden method is final
//        System.out.println("FriendsWithBenefits method");
//    }
}
