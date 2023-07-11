package Version9_0;


public class Client {
    public static void main(String[] args) {

        Dbconnection db1= Dbconnection.get_instance("Hello","user","pass","192.293");
        Dbconnection db2= Dbconnection.get_instance("Hello","user","pass","192.293");

        //In multiple Thread it will create multiple object
    }
}
