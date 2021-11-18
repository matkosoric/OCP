package edu.matkosoric.concurrency.atomic.classes;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 11 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.concurrent.atomic.AtomicInteger;

public class ChangeOnce implements Runnable {

    // ensure that multiple threads will change static variable only once
    // solution is in the compareAndSet() method from AtomicInteger

    public AtomicInteger code;

    public void checkCode() {
        int oldCode = code.get();
        int newCode = code.get() + 2;
        code.compareAndSet(oldCode, newCode);
    }

    public static void main(String[] args) {

        ChangeOnce thread1 = new ChangeOnce();
        thread1.run();
        System.out.println(thread1.code.get());
        thread1.run();
        System.out.println(thread1.code.get());
    }

    @Override
    public void run() {
        code = new AtomicInteger(4);
        this.checkCode();
    }
}
