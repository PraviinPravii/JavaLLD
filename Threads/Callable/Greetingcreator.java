package Threads.Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class Greetingcreator implements Callable<String> {

    Random r = new Random();

    @Override
    public String call() throws Exception {
        int num = Math.abs(r.nextInt()) % 5;

        if (num == 0) {
            return "Its Zero " + Thread.currentThread().getName();
        } else if (num == 1) {
            return "its One " + Thread.currentThread().getName();

        } else if (num == 2) {
            return "its two " + Thread.currentThread().getName();
        } else if (num == 3) {
            return "its three " + Thread.currentThread().getName();
        } else if (num == 4) {
            return "its four " + Thread.currentThread().getName();
        }

        else {
            return "its four";
        }
    }

}
