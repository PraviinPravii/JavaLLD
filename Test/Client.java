interface musicsystem{
public void play();
public void pause();
final int x=0;
}

interface carfunction extends musicsystem {
public void drive();
    
}

public class Client implements carfunction {
    
    @Override
    public void play() {
        System.out.println(x);
        // TODO Auto-generated method stub
        
    }
    @Override
    public void pause() {
        System.out.println(x);
        // TODO Auto-generated method stub
        
    }
    @Override
    public void drive() {
        // TODO Auto-generated method stub
        
    }
}
    