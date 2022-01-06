package edu.matkosoric.resources.working.and.doing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

class Worker {
    private boolean finished = false;

    public void consumeResource(Resource resource) {
        while (!resource.isReady()) {
            System.out.println("waiting for a resource");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setFinished(true);
    }

    public boolean isFinished() {
        return finished;
    }

    private void setFinished(boolean finished) {
        this.finished = finished;
    }
}
