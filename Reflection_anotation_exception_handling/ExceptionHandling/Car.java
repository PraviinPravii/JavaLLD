package Reflection_anotation_exception_handling.ExceptionHandling;

public class Car {
    private Musicsystem ms;
    public void setMS(Musicsystem ms){
        this.ms=ms;
    }
    void playmusic() throws MusicSystemNotfound  {
        if (ms==null){
           throw  new MusicSystemNotfound();
        }
        ms.play();
    }
}
