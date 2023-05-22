package Scaler;

public class Client {

    public static void main(String[] args) {
        // Instructor ins=new Instructor();
        // boolean h=ins.registration(0, "Praveen", "mjpraveen13@gmail.com", "null",
        //  52);
        //  System.out.println(h);
        // boolean login=ins.login("mjpraveen13@gmail.com", "null");
        // System.out.println(login);
        Instructor ins=new Instructor(120, "Sandeep", "sandeepsinha@gmail.com",
         "Instructor", 29);
         System.out.println(ins.getemail());
         System.out.println(ins.getid());
         System.out.println(ins.gettypeofuser());
        
         Student st=new Student("Praveen", 12, "Mjpraveen13@gmail.com", "Student");
         System.out.println(st.getemail());
         System.out.println(st.getid());
         System.out.println(st.gettypeofuser());

        
    }
    
}
