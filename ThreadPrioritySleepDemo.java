class PriorityThread extends Thread {
    PriorityThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() +
                " running (priority = " + getPriority() + ")");
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadPrioritySleepDemo {
    public static void main(String[] args) {
        new PriorityThread("Low Priority Thread", Thread.MIN_PRIORITY).start();
        new PriorityThread("Normal Priority Thread", Thread.NORM_PRIORITY).start();
        new PriorityThread("High Priority Thread", Thread.MAX_PRIORITY).start();
    }
}
