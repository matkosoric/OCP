package edu.matkosoric.resources.working.and.doing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */


public class Main {

    // what is result ?
    // Livelock

    public static void main(String[] args) {
        Resource resource = new Resource();
        Worker worker = new Worker();
        Thread t1 = new Thread(() -> resource.processWork(worker));
        Thread t2 = new Thread(() -> worker.consumeResource(resource));

        t1.start();
        t2.start();
    }
}