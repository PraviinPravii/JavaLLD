package Threads.Executers;

public class Numberprint implements Runnable {
    private int numberprint;

    Numberprint(int x) {
        numberprint = x;
    }

    @Override
    public void run() {
        System.out.println("runnable " + numberprint + " " + Thread.currentThread().getName());
    }

}
