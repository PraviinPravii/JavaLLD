package Threads.ParrallelMergesort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = Arrays.asList(3, 5, 7, 3, 6, 8, 8, 92);

        ExecutorService es = Executors.newFixedThreadPool(100);
        Mergesort ms = new Mergesort(es, list);

        Future<List<Integer>> fs = es.submit(ms);

        List<Integer> ls = fs.get();
        System.out.println(ls);

        es.shutdown();
    }

}
