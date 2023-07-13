package Reflection_anotation_exception_handling.ExceptionHandling;

public class BossMS implements Musicsystem{
    @Override
    public void play() {
        System.out.println("Boss Play");
    }

    @Override
    public void pause() {
        System.out.println("Boss Pause");

    }
}
