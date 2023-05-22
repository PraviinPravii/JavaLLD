package Abstract;

public abstract class Employee {
    int Empid;
    String name;
    boolean Attendence;

    void markattendence(boolean flag) {
        this.Attendence = flag;
    }

    abstract void work();

}
