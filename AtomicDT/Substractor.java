package AtomicDT;

public class Substractor implements Runnable {
    Counter c2;
    int couter = 0;

    Substractor(Counter c, int cnt) {
        c2 = c;
        this.couter = cnt;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 1; i <= this.couter; i++) {
            Counter.val.getAndAdd(-i);
        }

    }

}
