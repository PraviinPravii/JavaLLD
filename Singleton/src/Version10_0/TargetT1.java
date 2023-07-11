package Version10_0;

public class TargetT1 implements Runnable{
    Dbconnection ref;
    @Override
    public void run() {
        Dbconnection db1= Dbconnection.get_instance("Hello","user","pass","192.293");
        this.ref=db1;
        System.out.println(this.ref);
    }
}
