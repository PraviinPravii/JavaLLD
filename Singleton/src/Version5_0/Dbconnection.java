package Version5_0;

public class Dbconnection {
    String url="";
    String username=new String();
    String password="";
    String tcp=new String();
    private static Dbconnection inst;
    private Dbconnection(String url,String username,String password,String tcp){
        this.url = url;
        this.password=password;
        this.tcp=tcp;
        this.username=username;
    }
    public static Dbconnection get_instance(String url,String username,String password,String tcp){
        inst=new Dbconnection(url,username,password,tcp);
        return inst;
    }
}
