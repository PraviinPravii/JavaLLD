package Threads.Synchronizedblock;

public class Adder implements Runnable {

    Counter c1;
    long counter;

    Adder(Counter x, long cnt) {
        this.c1 = x;
        this.counter = cnt;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.counter; i++) {
            synchronized (c1) {
                c1.val++;
            }

        }
    }

}
