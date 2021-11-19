package edu.matkosoric.class_.design.friends;

public class FriendsWithBenefits extends Friends {
    int num; //line n2

    FriendsWithBenefits(short num) { // line n3
        super(num);
    }

//    protected void method() { //line n4       // does not compile - overridden method is final
//        System.out.println("FriendsWithBenefits method");
//    }
}
