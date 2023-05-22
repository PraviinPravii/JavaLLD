public class Client {

    public static void main(String[] args) {
        System.out.println(" hai Main");
        Numberprint nm = new Numberprint();
        for (int i = 1; i <= 100; i++) {
            Thread t = new Thread(nm);
            t.start();
        }
        System.out.println("by main");
    }

    public void play() {
    }
}