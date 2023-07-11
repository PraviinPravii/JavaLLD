package Version9_0;

import java.util.concurrent.locks.ReentrantLock;

public class Dbconnection implements Runnable{
    String url="";
    String username=new String();
    String password="";
    String tcp=new String();
    private static Dbconnection inst;

    private static ReentrantLock Lock =new ReentrantLock();
    private Dbconnection(String url,String username,String password,String tcp){
        this.url = url;
        this.password=password;
        this.tcp=tcp;
        this.username=username;
    }
    public static  Dbconnection get_instance(String url,String username,String password,String tcp){
        if(inst==null){
            Lock.lock();
            if(inst==null){
                inst=new Dbconnection(url,username,password,tcp);
            }
            Lock.unlock();
        }
        return inst;
    }

    @Override
    public void run() {

    }
}
