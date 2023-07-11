package Version2_0;

public class Dbconnection {
    String url="";
    String username=new String();
    String password="";
    String tcp=new String();

    private Dbconnection(String url,String username,String password,String tcp){


        this.url = url;
        this.password=password;
        this.tcp=tcp;
        this.username=username;
    }
    public Dbconnection get_instance(String url,String username,String password,String tcp){
        Dbconnection db=new Dbconnection(url,username,password,tcp);
        return db;
    }
}
