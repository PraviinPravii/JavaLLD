package AtomicDT;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Ovldingovriding.C;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        int counter = 1000;

        Counter c = new Counter();
        Counter.val.set(10);

        Adder a = new Adder(c, counter);
        Substractor s = new Substractor(c, counter);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.val.get());
    }

}
