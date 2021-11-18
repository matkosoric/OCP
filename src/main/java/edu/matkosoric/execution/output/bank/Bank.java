package edu.matkosoric.execution.output.bank;

public class Bank {

    private int x;
    private static int y;

    public static void main(String[] args) {

        // static value demo

        Bank bank1 = new Bank();
        bank1.x = 2;
        Bank.y = 3;

        Bank bank2 = new Bank();
        bank2.x = 4;
        bank2.y = 5;

        System.out.println(bank1.x + " ," + bank1.y);
        System.out.println(bank2.x + " , " + Bank.y);
        System.out.println(bank2.x + " , " + bank1.y);

    }

}
