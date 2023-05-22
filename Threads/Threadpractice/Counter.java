package Threads.Threadpractice;

public class Counter {
    private int val = 0;

    Counter(int x) {
        this.val = x;
    }

    public synchronized void incval(int offset) {
        this.val += offset;
    }

    public synchronized void decval(int offset) {
        this.val -= offset;
    }

    public synchronized int getval() {
        return this.val;
    }

}
