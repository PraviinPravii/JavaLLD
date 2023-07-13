package Reflection_anotation_exception_handling.ExceptionHandling;

public class Client {
    public static void main(String[] args) {
        try {
            Car car=new Car();
            SonyMS sony=new SonyMS();
            car.setMS(sony);
            car.playmusic();
        }
        catch (Exception ex){
            System.out.println("ex"+ex);
        }


    }
}
