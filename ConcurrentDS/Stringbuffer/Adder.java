package ConcurrentDS.Stringbuffer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Ovldingovriding.C;

public class Adder implements Runnable {

    Counter c1;
    int counter = 0;

    Adder(Counter c, int cnt) {
        c1 = c;
        this.counter = cnt;
    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for (int i = 1; i <= this.counter; i++) {

            c1.incval(i);

        }

    }

}
