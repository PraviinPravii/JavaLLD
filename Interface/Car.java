package Interface;

public class Car {

    private Musicsystem ms;

    public void setmusicsystem(Musicsystem ms) {

        this.ms = ms;

    }

    void drive() {
        System.out.println("drive");
    }

    void play() {
        if (this.ms == null) {
            System.out.println("No Music system instaled");
        }

        else {
            System.out.println();
            this.ms.play();
        }

    }

}
