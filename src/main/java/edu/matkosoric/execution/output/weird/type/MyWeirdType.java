package edu.matkosoric.execution.output.weird.type;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

class MyWeirdType<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Execute {

    public static void main(String[] args) {

        // what is output?

        MyWeirdType<String> weirdString = new MyWeirdType<>();
        MyWeirdType<? extends Number> weirdNumberSubset = new MyWeirdType<>();

        weirdString.setValue("matko");
        weirdNumberSubset.setValue(null);

        System.out.println(weirdString.getValue() + ":" + weirdNumberSubset.getValue());
    }
}
