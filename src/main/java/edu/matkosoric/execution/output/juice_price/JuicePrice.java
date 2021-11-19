package edu.matkosoric.execution.output.juice_price;

public class JuicePrice {

    // what is output?
    // compilation fails because of the final variable with message:
    // java: variable value might not have been initialized

    // does not compile
//    private final double value;
    private double value;   // working version

    public JuicePrice(String value) {
        this(Double.parseDouble(value));
    }

    public JuicePrice(double value) {
        this.value = value;
    }

    public JuicePrice() {
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        JuicePrice jp1 = new JuicePrice("1.99");
        JuicePrice jp2 = new JuicePrice(2.99);
        JuicePrice jp3 = new JuicePrice();
        System.out.println(jp1.getValue() + "," + jp2.getValue() + "," + jp3.getValue());
    }

}
