package LectureJavaStreams.Lambmdas;

import java.util.function.BiPredicate;

public class Democlassforbipredicate implements BiPredicate<Integer,String> {
    @Override
    public boolean test(Integer integer, String s) {
        return false;
    }
}
