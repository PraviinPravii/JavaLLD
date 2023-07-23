package LectureJavaStreams.Lambmdas;

public class Demoforrunnable {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable r=()->{
            System.out.println(Thread.currentThread().getName());
        };
        Thread t1=new Thread(r);
        t1.start();
        Thread t2= new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.start();

        System.out.println("Threading");
        t1.join();
        t2.join();

    }
}
