package LectureJavaStreams.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Mapandfiler {
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

        List<Car> list=Arrays.asList(c1,c2,c3,c4,c5,c6,c7);

        System.out.println(list.stream().filter(x->x.speed==547).toList());
//        List<Integer> list= Arrays.asList(102,3,5,32,55,345,676,324,663,345,66,43);
//        Predicate<Integer> pred=(x)->x%2==0;
//        System.out.println(list.stream().filter(x->x%2!=0).toList());

//                for(int val: lit){
//            System.out.println(val);
//        };

    }
}
