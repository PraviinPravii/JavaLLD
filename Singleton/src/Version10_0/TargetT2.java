package Version10_0;

public class TargetT2 implements Runnable{
    Dbconnection ref;
    @Override
    public void run() {
        Dbconnection db3= Dbconnection.get_instance("Hello","user","pass","192.293");
        this.ref=db3;
        System.out.println(this.ref);
    }
}
