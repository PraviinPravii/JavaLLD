package Threads.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Greetingcreator gc = new Greetingcreator();
        ExecutorService es = Executors.newFixedThreadPool(100);
        Greetingcreator gc = new Greetingcreator();
        for (int i = 1; i <= 100; i++) {

            Future<String> fs = es.submit(gc);
            // System.out.println("Hello");

            String inp = fs.get();
            System.out.println(inp);

        }
        es.shutdown();

    }

}
