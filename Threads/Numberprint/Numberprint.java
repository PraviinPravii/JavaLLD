public class Numberprint implements Runnable {
    private int numprnt;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        numprnt++;
        System.out.println(this.numprnt + " print by thread" + Thread.currentThread().getName());

    }

}