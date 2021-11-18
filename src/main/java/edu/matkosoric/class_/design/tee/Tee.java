package edu.matkosoric.class_.design.tee;

import java.util.Collection;

class Tee extends Water {

    public void print(Object obj) {
        System.out.println("[" + obj + "]");
    }

    // Does not compile
//    public void print(Object... objects){
//        for (Object object : objects){
//            System.out.println("[" + object + "]");
//        }
//    }

    public void print(Collection collection) {
        print(collection.toArray());
    }

}