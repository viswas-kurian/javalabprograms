class NumberPrinterThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number: " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        NumberPrinterThread printerThread = new NumberPrinterThread();
        printerThread.start(); // start new thread
        System.out.println("Main thread running");
    }
}
