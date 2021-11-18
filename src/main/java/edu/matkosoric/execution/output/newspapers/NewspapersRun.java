package edu.matkosoric.execution.output.newspapers;

public class NewspapersRun {

    // In current form, compilation fails
    // it could be fixed with try/catch block for Throwable

    public static void main(String[] args) {
        int a = 20, b = 13;
        try {
            if (a < b) {
//                throw new Newspapers();   // does not compile
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Continue ...");
    }

}
