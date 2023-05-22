package Interface;

public class Sony implements Musicsystem {

    @Override
    public void forword(int fw) {
        System.out.println("forword" + fw);
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        System.out.println("pause");
        // TODO Auto-generated method stub

    }

    @Override
    public void play() {
        System.out.println("sony play");
        // TODO Auto-generated method stub

    }

    @Override
    public void rewind(int rw) {
        // TODO Auto-generated method stub
        System.out.println("rewind" + rw);
    }

    @Override
    public void setvolume(int vol) {
        System.out.println("volum" + vol);
        // TODO Auto-generated method stub

    }

}
