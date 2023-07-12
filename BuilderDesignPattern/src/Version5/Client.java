package BuilderDesignPattern.src.Version5;

public class Client {
    public static void main(String[] args) {

        Builder bldr=Student.getBuilder();
        bldr.age=20;
        bldr.name="Praveen";
        bldr.email="Praveena@2234.com";
        bldr.phonenum="09999";
        bldr.psp=13;

    }
}
