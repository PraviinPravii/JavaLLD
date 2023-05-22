package Threads.ParrallelMergesort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Mergesort implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService es;

    Mergesort(ExecutorService es, List<Integer> list) {
        this.list = list;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println(list + "  " + Thread.currentThread().getName());
        // List<Integer> ls = Arrays.asList(1, 3, 3);
        // return this.list;
        if (list.size() <= 1) {
            return list;
        }

        List<Integer> firsthlf = new ArrayList<>();
        List<Integer> secondhalf = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() / 2) {
                firsthlf.add(list.get(i));
            } else {
                secondhalf.add(list.get(i));
            }

        }
        Mergesort sortleft = new Mergesort(es, firsthlf);
        Mergesort sortright = new Mergesort(es, secondhalf);

        // List<Integer> sortedfirsthalf = sortleft.call();
        // List<Integer> sortedsecondhalf = sortright.call();
        Future<List<Integer>> promisleftpart = es.submit(sortleft);
        Future<List<Integer>> promisrightpart = es.submit(sortright);

        List<Integer> sortedfirsthalf = promisleftpart.get();
        List<Integer> sortedsecondhalf = promisrightpart.get();

        List<Integer> sortedlist = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        int sizeleft = sortedfirsthalf.size();
        int sizeright = sortedsecondhalf.size();

        while (i < sizeleft && j < sizeright) {
            if (sortedfirsthalf.get(i) < sortedsecondhalf.get(j)) {
                sortedlist.add(sortedfirsthalf.get(i));
                i++;
                k++;
            } else {
                sortedlist.add(sortedsecondhalf.get(j));
                j++;
                k++;
            }
        }
        while (i < sizeleft) {
            sortedlist.add(sortedfirsthalf.get(i));
            i++;
        }
        while (j < sizeright) {
            sortedlist.add(sortedsecondhalf.get(j));
            j++;
        }
        return sortedlist;
    }

}
