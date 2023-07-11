package Version10_0;


public class Client {
    public static void main(String[] args) throws InterruptedException {

        TargetT1 obj1=new TargetT1();
        TargetT2 obj2=new TargetT2();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
        Dbconnection db3= Dbconnection.get_instance("Hello","user","pass","192.293");
        System.out.println(db3);
        t1.join();
        t2.join();

        //In multiple Thread it will create multiple object
    }
}
