package LectureJavaStreams.Lambmdas;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Demoonlambdas {
    public static void main(String[] args) {
        BiPredicate<Integer,String> bipre=new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
            return false;
            }
        };
        BiPredicate<Integer,String> way2=new Democlassforbipredicate();

        BiPredicate<Integer,String> way3=(x,y)->{
            if(y.length()>x){
                return true;
            }
            return false;

        };
        BinaryOperator<String> obj1=(s1,s2)->{
            return s1+" How "+s2;
        };
        BiFunction<Integer,String,String> biFunction=(x,y)->x+y;

        BiConsumer<String,String> consumer=(x,y)-> System.out.println(x+y);

        System.out.println(way3.test(2,"Hello"));
        System.out.println(obj1.apply("Hello","Praveen"));

        System.out.println(biFunction.apply(1,"Hello"));
        consumer.accept("Praveen","Coder");

    }
}
