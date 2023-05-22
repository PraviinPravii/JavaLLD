package ConcurrentDS.Stringbuffer;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer("sjsjjs");
        System.out.println(sb);

        int counter = 10000000;

        Counter c = new Counter(10);

        Adder a = new Adder(c, counter);
        Substractor s = new Substractor(c, counter);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getval());
    }

}
