package edu.matkosoric.class_.design.electronics;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class PriceChecker<T extends Product> {

    // how does PriceChecker has to be declared?
    // <T extends Product>

    private T product;

    public PriceChecker(T product) {
        this.product = product;
    }

    public boolean isPriceEqual(PriceChecker<?> prod) {
        return this.product.getPrice() == prod.product.getPrice();
    }

    public static void main(String[] args) {
        PriceChecker<Electronics> a = new PriceChecker<>(new Electronics(1000.00));
        PriceChecker<Plushy> b = new PriceChecker<>(new Plushy(1.0));
        System.out.println(a.isPriceEqual(b));
    }
}