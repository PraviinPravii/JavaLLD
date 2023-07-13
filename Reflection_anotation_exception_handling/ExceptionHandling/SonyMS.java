package Reflection_anotation_exception_handling.ExceptionHandling;

public class SonyMS implements Musicsystem{
    @Override
    public void play() {
        System.out.println("SOny Playing");
    }

    @Override
    public void pause() {
        System.out.println("SOny Pause");

    }
}
