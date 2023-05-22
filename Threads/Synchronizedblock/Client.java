package Threads.Synchronizedblock;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        long counter = 1000000000;
        Counter c = new Counter();
        Adder a = new Adder(c, counter);
        Substractor s = new Substractor(c, counter);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        long starttime = System.currentTimeMillis();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long endtime = System.currentTimeMillis();
        System.out.println(c.val);
        System.out.println(endtime - starttime + " ms");

    }

}
