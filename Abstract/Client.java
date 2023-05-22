package Abstract;

public class Client {

    public static void main(String[] args) {
        Employee es = new SDE();
        es.Empid = 1;
        es.name = "Praveen";
        es.markattendence(true);
        es.work();

        Employee es1 = new HR();
        es1.Empid = 2;
        es1.name = "Aisha";
        es1.markattendence(true);
        es1.work();
    }

}
