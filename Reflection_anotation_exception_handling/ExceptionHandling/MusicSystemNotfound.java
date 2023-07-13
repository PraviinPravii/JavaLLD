package Reflection_anotation_exception_handling.ExceptionHandling;

public class MusicSystemNotfound extends Exception{
    public MusicSystemNotfound(){
        super("You have not plugged in not any music system");
    }
}
