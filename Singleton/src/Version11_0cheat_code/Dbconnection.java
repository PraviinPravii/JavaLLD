package Version11_0cheat_code;

public class Dbconnection {
    String url="";
    String username=new String();
    String password="";
    String tcp=new String();
    Dbconnection(String url,String username,String password,String tcp){
        this.url = url;
        this.password=password;
        this.tcp=tcp;
        this.username=username;
    }
    public static final Dbconnection inst=new Dbconnection("Hello","user","pass","192.293");
}
