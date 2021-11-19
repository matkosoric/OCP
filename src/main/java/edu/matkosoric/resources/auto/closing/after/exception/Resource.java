package edu.matkosoric.resources.auto.closing.after.exception;

public class Resource implements AutoCloseable {

    // close() method from AutoCloseable interface within try-with-resources
    // gets executed before actual Exception handling

    @Override
    public void close() throws Exception {
        System.out.println("Clean up");
    }

    public static void main(String[] args) {
        try (var a = new Resource()) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

}
