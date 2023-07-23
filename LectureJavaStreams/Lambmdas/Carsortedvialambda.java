package LectureJavaStreams.Lambmdas;

import java.lang.reflect.Array;
import java.util.*;

public class Carsortedvialambda {

    static class Car{
        int speed;
        int price;
        String brand;
        Car(int speed,int price,String brand){
            this.speed=speed;
            this.price=price;
            this.brand=brand;
        }
        public String toString(){
            return "Speed "+this.speed+" \nprice "+this.price+" \nbrand "+this.brand;

        }
    }

    public static void main(String[] args) {
        Car c1=new Car(1000,10000,"BMW");
        Car c2=new Car(100,10000,"Maruthi");
        Car c3=new Car(547,10000,"Zugati");
        Car c4=new Car(100,10000,"race");
        Car c5=new Car(652,10000,"Mahindra");
        Car c6=new Car(292,10000,"Jaguar");
        Car c7=new Car(8569,10000,"Bullero");

        List<Car> list= Arrays.asList(c1,c2,c3,c4,c5,c6,c7);
        Comparator<Car> speedcompar=(x,y)->

                y.speed-x.speed;
        Collections.sort(list,speedcompar);
//        System.out.println(c1.toString());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).speed);

        }



    }
}
