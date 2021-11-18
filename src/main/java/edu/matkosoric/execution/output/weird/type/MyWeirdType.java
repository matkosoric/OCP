package edu.matkosoric.execution.output.weird.type;

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
