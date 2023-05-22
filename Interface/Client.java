package Interface;

public class Client {

    public static void main(String[] args) {
        Car sn = new Car();
        Sony k = new Sony();
        sn.setmusicsystem(k);
        sn.play();
        Musicsystem bs = new Boss();
        System.out.println(bs.a);
        sn.setmusicsystem(bs);
        sn.play();

    }

}
