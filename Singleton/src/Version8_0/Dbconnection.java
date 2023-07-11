package Version8_0;

import java.util.concurrent.locks.ReentrantLock;

public class Dbconnection implements Runnable{
    String url="";
    String username=new String();
    String password="";
    String tcp=new String();
    private static Dbconnection inst;
    static ReentrantLock Lock=new ReentrantLock();
    private Dbconnection(String url,String username,String password,String tcp){
        this.url = url;
        this.password=password;
        this.tcp=tcp;
        this.username=username;
    }
    public static synchronized Dbconnection get_instance(String url,String username,String password,String tcp){
        if(inst==null){
            Lock.lock();
            inst=new Dbconnection(url,username,password,tcp);
            Lock.unlock();
        }
        // Fail because if(inst==null) multiple thread can enter at same time..

        return inst;
    }

    @Override
    public void run() {

    }
}
