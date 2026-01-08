class NumberPrinter implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        NumberPrinter task = new NumberPrinter();

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        System.out.println("Main thread running");
    }
}
