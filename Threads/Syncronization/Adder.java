package Threads.Syncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Ovldingovriding.C;

public class Adder implements Runnable {

    Lock lock;
    Counter c1;

    Adder(Counter c, Lock lock) {
        c1 = c;
        this.lock = lock;
    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            c1.val += i;
            lock.unlock();
        }

    }

}
