package LectureJavaStreams.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        Integer[] arr={1,3,3,6,6,745,6};
        Stream<Integer> s1=Stream.of(arr);


        Stream<Integer> s2= Stream.of(10,1202,2020,2020);

        List<Integer> list= Arrays.asList(10,2,3,35,5,6);
        Stream<Integer> liststrreap=list.stream();


        Stream.Builder<Integer> sb=Stream.builder();
        sb.accept(10);
        sb.accept(60);
        sb.accept(52); sb.accept(41);
        sb.accept(63);
        sb.accept(75);



        Stream<Integer> s4=sb.build();

    }
}
