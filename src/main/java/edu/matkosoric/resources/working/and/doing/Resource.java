package edu.matkosoric.resources.working.and.doing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Resource {
    private boolean ready = false;

    public void processWork(Worker worker) {
        while (!worker.isFinished()) {
            System.out.println("waiting for a worker");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setReady(true);
    }

    public boolean isReady() {
        return ready;
    }

    private void setReady(boolean ready) {
        this.ready = ready;
    }
}
