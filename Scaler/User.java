package Scaler;

public class User {

    private String email;
    private String password;
    private String name;
    private int id;
    private int phonenumber;
    private String typofuser;


    User(int id,String name,String email,String typofuser){
        this.id=id;
        this.name=name;
        this.email=email;
        this.typofuser=typofuser;
    }
    User(String name,int id,String email,String typofuser){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    


    void setemail(String email){
        this.email=email;
    }
    void setpassword(String password){
        this.password=password;
    }
    void setname(String name){
        this.name=name;
    }
    void setid(int id){
        this.id=id;
    }
    void setphonenumber(int phonenumber){
        this.phonenumber=phonenumber;
    }
    void settype(String type){
        this.typofuser=type;
    }

    String getemail(){
        return email;
    }
    String password(){
        return password;
    }
    String getname(){
        return name;
    }
    int getid(){
        return this.id;
    }
    int getphonenumber(){
        return this.phonenumber;
    }
    String gettypeofuser(){
        return typofuser;
    }

    boolean registration(int id,String name,String email,String passoword,int phonenumber){
        this.setemail(email);
        this.setid(id);
        this.setname(name);
        this.setpassword(passoword);
        this.setphonenumber(phonenumber);
        return true;
    }
    boolean login(String email,String password){
        if (email==this.email && password==this.password){
            return true;
        }
        else{
            return false;
        }
    }



    
}
