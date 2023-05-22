package AirthmaticO;

public class Addition {
    private double a;
    private double b;

    public double add(double a,double b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    double returnlastcalc(){
        return this.a+this.b;
    }


}
