package Upcasting;

public class Client {

    public static void main(String[] args) {
        Student s = new Teacher();
        // Teacher k = (Teacher) new Student();
        // k.id = 10;
        // k.name = "Praveen";
        // k.subject = "Programming";
        s.print();

    }

}
