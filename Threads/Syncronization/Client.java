package Threads.Syncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Ovldingovriding.C;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        Counter c = new Counter();
        c.val = 10;
        Adder a = new Adder(c, lock);
        Substractor s = new Substractor(c, lock);

        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(s);
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.val);
    }

}
