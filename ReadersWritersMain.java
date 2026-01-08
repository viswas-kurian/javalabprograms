class SharedData {
    int readers = 0;
    boolean writing = false;

    synchronized void startRead() {
        while (writing) {
            try { wait(); } catch (InterruptedException e) {}
        }
        readers++;
        System.out.println("Reader started reading. Readers: " + readers);
    }

    synchronized void endRead() {
        readers--;
        System.out.println("Reader finished reading. Readers: " + readers);
        notifyAll();
    }

    synchronized void startWrite() {
        while (writing || readers > 0) {
            try { wait(); } catch (InterruptedException e) {}
        }
        writing = true;
        System.out.println("Writer started writing.");
    }

    synchronized void endWrite() {
        writing = false;
        System.out.println("Writer finished writing.");
        notifyAll();
    }
}

class Reader implements Runnable {
    SharedData data;
    Reader(SharedData data) { this.data = data; }
    public void run() {
        data.startRead();
        data.endRead();
    }
}

class Writer implements Runnable {
    SharedData data;
    Writer(SharedData data) { this.data = data; }
    public void run() {
        data.startWrite();
        data.endWrite();
    }
}

public class ReadersWritersMain {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        new Thread(new Reader(data)).start();
        new Thread(new Reader(data)).start();
        new Thread(new Writer(data)).start();
    }
}
