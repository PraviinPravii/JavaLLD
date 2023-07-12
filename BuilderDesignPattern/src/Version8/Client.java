package BuilderDesignPattern.src.Version8;

public class Client {
    public static void main(String[] args) {

        Student.Builder bldr= Student.getBuilder();
//        Student st1=bldr.build();
//        Student.Builder bldr= Student.getBuilder();
        bldr.age=20;
        bldr.name="Praveen";
        bldr.email="Praveena@2234.com";
        bldr.phonenum="09999";
        bldr.psp=13;

        Student st=bldr.build();


    }
}
