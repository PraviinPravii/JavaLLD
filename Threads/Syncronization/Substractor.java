package Threads.Syncronization;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable {
    Counter c2;
    Lock lock;

    Substractor(Counter c, Lock lock) {
        c2 = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            c2.val -= i;
            lock.unlock();
        }

    }

}
