package edu.matkosoric.class_.design.tee;

class Water{

    protected void print(Object obj){
        System.out.println(obj);
    }

    public final void print(Object... objects){
        for (Object object : objects){
            print(object);
        }
    }

    // Does not compile
//    public void print(Collection.collection){
//        collection.forEach(System.out::print);
//    }

}