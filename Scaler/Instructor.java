package Scaler;

public class Instructor extends User{
    private int rating;

    public Instructor(int id,String name,String email,String typeofusr,int rating){
        super(id,name,email,typeofusr);
        this.rating=rating;

    }
    
}
