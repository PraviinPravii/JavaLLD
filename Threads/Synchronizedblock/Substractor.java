package Threads.Synchronizedblock;

public class Substractor implements Runnable {

    Counter c2;
    long counter;

    Substractor(Counter x, long cnt) {
        this.c2 = x;
        this.counter = cnt;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.counter; i++) {
            synchronized (c2) {
                c2.val--;
            }

        }
    }

}
