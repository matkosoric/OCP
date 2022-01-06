package edu.matkosoric.concurrency.thread_.safe.foo;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    // how to make Foo class thread safe?
    // use fairness in constructor
    // new ReentrantLock(true)

    private Thread.State state;
    private final ReentrantLock lock = new ReentrantLock();

    public void foo() throws Exception {
        try {
            lock.lock();
//            state.mutate();     // does not compile
        } finally {
            lock.unlock();
        }
    }
}
