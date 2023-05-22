package Threads.Executers;

// import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        // ExecutorService es = Executors.newFixedThreadPool(4);
        ExecutorService es = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            Numberprint np = new Numberprint(i);
            es.submit(np);
        }

        es.shutdown();

    }
}
