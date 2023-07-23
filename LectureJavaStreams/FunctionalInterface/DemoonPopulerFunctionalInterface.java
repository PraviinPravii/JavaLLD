package LectureJavaStreams.FunctionalInterface;

import java.util.function.*;

public class DemoonPopulerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<Integer> obj=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Anonymouse Method");
            }
        };
    }
    BiConsumer<Integer,String> ob1=new BiConsumer<Integer, String>() {
        @Override
        public void accept(Integer integer, String s) {

        }
    };
    Predicate<Integer> pre=new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return false;
        }
    };
    BiPredicate<Integer,String> bipre=new BiPredicate<Integer, String>() {
        @Override
        public boolean test(Integer integer, String s) {
            return false;
        }
    };
    Function<String,Integer> fucn=new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return null;
        }
    };



    BiFunction<Integer,String,Double> bifunc=new BiFunction<Integer, String, Double>() {
        @Override
        public Double apply(Integer integer, String s) {
            return 0.6;
        }
    };

    BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer integer, Integer integer2) {
            return null;
        }
    };
}
